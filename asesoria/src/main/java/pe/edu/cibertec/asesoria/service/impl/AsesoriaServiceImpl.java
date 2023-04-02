package pe.edu.cibertec.asesoria.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pe.edu.cibertec.asesoria.config.NotificacionRequest;
import pe.edu.cibertec.asesoria.model.Asesoria;
import pe.edu.cibertec.asesoria.rabbitmq.RabbitMQMessageProducer;
import pe.edu.cibertec.asesoria.repo.IAsesoriaRepo;
import pe.edu.cibertec.asesoria.service.IAsesoriaService;

import java.text.SimpleDateFormat;
import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class AsesoriaServiceImpl implements IAsesoriaService {

    //@Autowired //ya no es necesario si se usa el AllArgsConstructor
    private IAsesoriaRepo asesoriaRepo;

    private final RestTemplate restTemplate;

    private final RabbitMQMessageProducer rabbitMQMessageProducer;

    public List<Asesoria> listarAsesorias(){
        return asesoriaRepo.findAll();
    }

    public Asesoria obtenerAsesoria(Integer id){
        return asesoriaRepo.findById(id).get();
    }

    //si no le mando el id o este no existe inserta
    /*public Asesoria registrarAsesoria(Asesoria asesoria){
        return asesoriaRepo.save(asesoria);
    }*/
    public Asesoria registrarAsesoria(Asesoria asesoria) {
        Asesoria asesoriaResponse = asesoriaRepo.save(asesoria);

        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        String asesoriaFecha = sdf.format(asesoriaResponse.getFecha());

        AsesoriaCheckResponse asesoriaCheckResponse = restTemplate.getForObject(
                //"http://localhost:8081/api/v3/asesoria-check/{asesoriaId}",
                "http://REUNIONVIRTUAL/api/v1/asesoria-link/{asesoriaId}/{asesoriaFecha}/{asesoriaHorario}/{asesoriaPsicologo}",
                AsesoriaCheckResponse.class,
                asesoriaResponse.getId(),
                asesoriaFecha,
                asesoriaResponse.getHorario().getId(),
                asesoriaResponse.getPsicologo().getId()
        );
        log.info("respuesta de validar asesorias: {}", asesoriaCheckResponse.esLink());

        NotificacionRequest notificacionRequest = new NotificacionRequest(
                asesoriaResponse.getId(),
                asesoriaResponse.getPsicologo().getEmail(),
                String.format("Hola %s, bienvenidos a Cibertec...",
                        asesoriaResponse.getPsicologo().getNombre())
        );

        rabbitMQMessageProducer.publish(
                notificacionRequest,
                "internal.exchange",
                "internal.notification.routing-key"
        );

        return asesoriaResponse;
    }

    //si le mando el id modifica
    public Asesoria modificarAsesoria(Asesoria asesoria){
        return asesoriaRepo.save(asesoria);
    }

    public String eliminarAsesoria(Integer id){
        asesoriaRepo.deleteById(id);
        return "Asesoria eliminada";
    }


}

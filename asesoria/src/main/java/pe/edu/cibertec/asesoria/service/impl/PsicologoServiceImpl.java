package pe.edu.cibertec.asesoria.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pe.edu.cibertec.asesoria.model.Psicologo;
import pe.edu.cibertec.asesoria.repo.IPsicologoRepo;
import pe.edu.cibertec.asesoria.service.IPsicologoService;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class PsicologoServiceImpl implements IPsicologoService {

    //@Autowired //ya no es necesario si se usa el AllArgsConstructor
    private IPsicologoRepo psicologoRepo;

    //private final RestTemplate restTemplate;

    public List<Psicologo> listarPsicologos(){
        return psicologoRepo.findAll();
    }

    public Psicologo obtenerPsicologo(Integer id){
        return psicologoRepo.findById(id).get();
    }

    //si no le mando el id o este no existe inserta
    public Psicologo registrarPsicologo(Psicologo psicologo){
        return psicologoRepo.save(psicologo);
    }

    //si le mando el id modifica
    public Psicologo modificarPsicologo(Psicologo psicologo){
        return psicologoRepo.save(psicologo);
    }

    public String eliminarPsicologo(Integer id){
        psicologoRepo.deleteById(id);
        return "Psicologo eliminada";
    }

    public List<Psicologo> listarPsicologosPorNombre(String nombre) {
        return psicologoRepo.findByNombre(nombre);
    }

}

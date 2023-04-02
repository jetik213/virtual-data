package pe.edu.cibertec.reunionvirtual.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.reunionvirtual.service.IAsesoriaCheckService;
import java.text.SimpleDateFormat;
import java.util.Date;


@Slf4j
@RestController
@RequestMapping("api/v1/asesoria-link")
@AllArgsConstructor //crea constructores con argumento
public class AsesoriaCheckController {

    @Autowired
    private final IAsesoriaCheckService asesoriaCheckService;
    @GetMapping(path = "{asesoriaId}/{asesoriaFecha}/{asesoriaHorario}/{asesoriaPsicologo}")
    public AsesoriaCheckResponse crearLink(
            @PathVariable("asesoriaId") Integer asesoriaId,
            @PathVariable("asesoriaFecha") String asesoriaFecha,
            @PathVariable("asesoriaHorario") Integer asesoriaHorario,
            @PathVariable("asesoriaPsicologo") Integer asesoriaPsicologo
            ) {

        /*SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        String fecha = sdf.format(asesoriaFecha);*/
        String link = "http://asesoriavirtual/" + asesoriaFecha + asesoriaHorario + asesoriaPsicologo;
        log.info("{}", link);

        boolean esLink = asesoriaCheckService.crearLink(asesoriaId, link);
        log.info("parametros para asesoria: {}, {}", asesoriaId, link);

        return new AsesoriaCheckResponse(esLink);
    }

}

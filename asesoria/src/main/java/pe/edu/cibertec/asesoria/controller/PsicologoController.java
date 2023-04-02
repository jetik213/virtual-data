package pe.edu.cibertec.asesoria.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.asesoria.model.Psicologo;
import pe.edu.cibertec.asesoria.service.IPsicologoService;

import javax.validation.Valid;
import java.util.List;

@Slf4j //para manejar logs
@RestController //es json
@RequestMapping("api/v1/psicologo")
public class PsicologoController {

    @Autowired
    private IPsicologoService psicologoService;

    //método para listar psicologo
    @GetMapping //que utiliza un get
    public ResponseEntity<?> listarPsicologos(){
        List<Psicologo> psicologos = psicologoService.listarPsicologos();
        log.info("listar psicologos");
        return new ResponseEntity<>(psicologos, psicologos.size() > 0 ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/{id}") //utiliza get pero con un id
    public ResponseEntity<?> obtenerPsicologo(@PathVariable("id") Integer id){
        log.info("obtener psicologo con id: {}", id);
        return new ResponseEntity<>(psicologoService.obtenerPsicologo(id), HttpStatus.OK);
    }

    @PostMapping  //post para crear
    public ResponseEntity<?> registrarPsicologo(@Valid @RequestBody Psicologo psicologo){
        Psicologo newPsicologo = psicologoService.registrarPsicologo(psicologo);
        log.info("nuevo registro de psicologo {}", psicologo);
        return new ResponseEntity<Psicologo>(newPsicologo, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> modificarPsicologo(@Valid @RequestBody Psicologo psicologo){
        Psicologo newPsicologo = psicologoService.modificarPsicologo(psicologo);
        log.info("modificar datos de psicologo {}", psicologo);
        return new ResponseEntity<Psicologo>(newPsicologo, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> eliminarPsicologo(@PathVariable("id") Integer id){
        log.info("eliminar psicologo con id: {}", id);
        return new ResponseEntity<>(psicologoService.eliminarPsicologo(id), HttpStatus.OK);
    }

    @GetMapping(params = "nombre")
    public ResponseEntity<?> listarPsicologosPorNombre(@RequestParam String nombre) {
        List<Psicologo> psicologos = psicologoService.listarPsicologosPorNombre(nombre);
        log.info("listar psicologos por nombre: {}",nombre);
        return new ResponseEntity<>(psicologos, psicologos.size() > 0 ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

}

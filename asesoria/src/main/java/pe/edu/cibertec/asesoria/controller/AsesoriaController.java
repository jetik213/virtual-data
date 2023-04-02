package pe.edu.cibertec.asesoria.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.asesoria.model.Asesoria;
import pe.edu.cibertec.asesoria.service.IAsesoriaService;

import javax.validation.Valid;
import java.util.List;

@Slf4j //para manejar logs
@RestController //es json
@RequestMapping("api/v1/asesoria")
public class AsesoriaController {

    @Autowired
    private IAsesoriaService asesoriaService;

    //método para listar asesoria
    @GetMapping //que utiliza un get
    public ResponseEntity<?> listarAsesorias(){
        List<Asesoria> asesorias = asesoriaService.listarAsesorias();
        log.info("listar asesorias");
        return new ResponseEntity<>(asesorias, asesorias.size() > 0 ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/{id}") //utiliza get pero con un id
    public ResponseEntity<?> obtenerAsesoria(@PathVariable("id") Integer id){
        log.info("obtener asesoria con id: {}", id);
        return new ResponseEntity<>(asesoriaService.obtenerAsesoria(id), HttpStatus.OK);
    }

    @PostMapping  //post para crear
    public ResponseEntity<?> registrarAsesoria(@Valid @RequestBody Asesoria asesoria){
        Asesoria newAsesoria = asesoriaService.registrarAsesoria(asesoria);
        log.info("nuevo registro de asesoria {}", asesoria);
        return new ResponseEntity<Asesoria>(newAsesoria, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> modificarAsesoria(@Valid @RequestBody Asesoria asesoria){
        Asesoria newAsesoria = asesoriaService.modificarAsesoria(asesoria);
        log.info("modificar datos de asesoria {}", asesoria);
        return new ResponseEntity<Asesoria>(newAsesoria, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> eliminarAsesoria(@PathVariable("id") Integer id){
        log.info("eliminar asesoria con id: {}", id);
        return new ResponseEntity<>(asesoriaService.eliminarAsesoria(id), HttpStatus.OK);
    }

}

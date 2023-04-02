package pe.edu.cibertec.asesoria.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.asesoria.model.Alumno;
import pe.edu.cibertec.asesoria.service.IAlumnoService;

import javax.validation.Valid;
import java.util.List;

@Slf4j //para manejar logs
@RestController //es json
@RequestMapping("api/v1/alumno")
public class AlumnoController {

    @Autowired
    private IAlumnoService alumnoService;

    //método para listar alumno
    @GetMapping //que utiliza un get
    public ResponseEntity<?> listarAlumnos(){
        List<Alumno> alumnos = alumnoService.listarAlumnos();
        log.info("listar alumnos");
        return new ResponseEntity<>(alumnos, alumnos.size() > 0 ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/{id}") //utiliza get pero con un id
    public ResponseEntity<?> obtenerAlumno(@PathVariable("id") Integer id){
        log.info("obtener alumno con id: {}", id);
        return new ResponseEntity<>(alumnoService.obtenerAlumno(id), HttpStatus.OK);
    }

    @PostMapping  //post para crear
    public ResponseEntity<?> registrarAlumno(@Valid @RequestBody Alumno alumno){
        Alumno newAlumno = alumnoService.registrarAlumno(alumno);
        log.info("nuevo registro de alumno {}", alumno);
        return new ResponseEntity<Alumno>(newAlumno, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> modificarAlumno(@Valid @RequestBody Alumno alumno){
        Alumno newAlumno = alumnoService.modificarAlumno(alumno);
        log.info("modificar datos de alumno {}", alumno);
        return new ResponseEntity<Alumno>(newAlumno, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> eliminarAlumno(@PathVariable("id") Integer id){
        log.info("eliminar alumno con id: {}", id);
        return new ResponseEntity<>(alumnoService.eliminarAlumno(id), HttpStatus.OK);
    }

    @GetMapping(params = "nombre")
    public ResponseEntity<?> listarAlumnosPorNombre(@RequestParam String nombre) {
        List<Alumno> alumnos = alumnoService.listarAlumnosPorNombre(nombre);
        log.info("listar alumnos por nombre: {}",nombre);
        return new ResponseEntity<>(alumnos, alumnos.size() > 0 ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

}

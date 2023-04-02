package pe.edu.cibertec.asesoria.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pe.edu.cibertec.asesoria.model.Alumno;
import pe.edu.cibertec.asesoria.repo.IAlumnoRepo;
import pe.edu.cibertec.asesoria.service.IAlumnoService;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class AlumnoServiceImpl implements IAlumnoService {

    //@Autowired //ya no es necesario si se usa el AllArgsConstructor
    private IAlumnoRepo alumnoRepo;

    //private final RestTemplate restTemplate;

    public List<Alumno> listarAlumnos(){
        return alumnoRepo.findAll();
    }

    public Alumno obtenerAlumno(Integer id){
        return alumnoRepo.findById(id).get();
    }

    //si no le mando el id o este no existe inserta
    public Alumno registrarAlumno(Alumno alumno){
        return alumnoRepo.save(alumno);
    }

    //si le mando el id modifica
    public Alumno modificarAlumno(Alumno alumno){
        return alumnoRepo.save(alumno);
    }

    public String eliminarAlumno(Integer id){
        alumnoRepo.deleteById(id);
        return "Alumno eliminada";
    }

    public List<Alumno> listarAlumnosPorNombre(String nombre) {
        return alumnoRepo.findByNombre(nombre);
    }


}

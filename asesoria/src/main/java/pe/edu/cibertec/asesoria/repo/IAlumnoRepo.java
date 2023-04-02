package pe.edu.cibertec.asesoria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.asesoria.model.Alumno;

import java.util.List;

//heredamos de la clase JpaRepository para heredar el CRUD
public interface IAlumnoRepo extends JpaRepository<Alumno, Integer> {
    List<Alumno> findByNombre(String nombre);

}

package pe.edu.cibertec.asesoria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.asesoria.model.Asesoria;

import java.util.List;

//heredamos de la clase JpaRepository para heredar el CRUD
public interface IAsesoriaRepo extends JpaRepository<Asesoria, Integer> {

}

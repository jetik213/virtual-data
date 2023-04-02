package pe.edu.cibertec.asesoria.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.asesoria.model.Psicologo;

import java.util.List;

//heredamos de la clase JpaRepository para heredar el CRUD
public interface IPsicologoRepo extends JpaRepository<Psicologo, Integer> {
    List<Psicologo> findByNombre(String nombre);

}

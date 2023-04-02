package pe.edu.cibertec.reunionvirtual.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.reunionvirtual.model.AsesoriaCheck;

public interface IAsesoriaCheckRepo extends JpaRepository<AsesoriaCheck, Integer> {
}
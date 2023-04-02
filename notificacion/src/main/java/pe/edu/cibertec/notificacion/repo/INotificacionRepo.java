package pe.edu.cibertec.notificacion.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.notificacion.model.Notificacion;

public interface INotificacionRepo extends JpaRepository<Notificacion, Integer> {
}

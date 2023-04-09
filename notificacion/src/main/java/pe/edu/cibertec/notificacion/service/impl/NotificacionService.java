package pe.edu.cibertec.notificacion.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.notificacion.controller.NotificacionRequest;
import pe.edu.cibertec.notificacion.model.Notificacion;
import pe.edu.cibertec.notificacion.repo.INotificacionRepo;
import pe.edu.cibertec.notificacion.service.INotificacionService;

import java.util.Date;

@Service
@AllArgsConstructor
public class NotificacionService implements INotificacionService {
    private final INotificacionRepo notificacionRepo;

    public boolean enviarNotificacion(NotificacionRequest notificacionRequest) {
        notificacionRepo.save(
                Notificacion.builder()
                        .clienteId(notificacionRequest.clienteId())
                        .remitente("Cibertec")
                        .mensaje(notificacionRequest.mensaje())
                        .horaEnvio(new Date())
                        .build()
        );
        return false;
    }
}

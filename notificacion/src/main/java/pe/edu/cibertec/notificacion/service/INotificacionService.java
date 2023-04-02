package pe.edu.cibertec.notificacion.service;

import pe.edu.cibertec.notificacion.controller.NotificacionRequest;

public interface INotificacionService {
    public boolean enviarNotificacion(NotificacionRequest notificacionRequest);
}

package pe.edu.cibertec.notificacion.controller;

public record NotificacionRequest(Integer clienteId, String clienteEmail, String mensaje) {
}

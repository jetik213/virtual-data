package pe.edu.cibertec.notificacion.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Builder
@Table(name="notificacion")
public class Notificacion {
    @Id
    @GeneratedValue
    private Integer notificacionId;
    private Integer clienteId;
    private String remitente;
    private String mensaje;
    private Date horaEnvio;

    public Notificacion() {
    }

    public Notificacion(Integer notificacionId, Integer clienteId, String remitente, String mensaje, Date horaEnvio) {
        this.notificacionId = notificacionId;
        this.clienteId = clienteId;
        this.remitente = remitente;
        this.mensaje = mensaje;
        this.horaEnvio = horaEnvio;
    }
}

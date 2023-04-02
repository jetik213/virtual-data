package pe.edu.cibertec.asesoria.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name="asesoria")
public class Asesoria implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "asesoria_id")
    private int id;

    @ManyToOne
    @NotNull(message = "{NotNull.alumno.id}")
    @JoinColumn(name="alumno_id", nullable = false)
    private Alumno alumno;

    @ManyToOne
    @NotNull(message = "{NotNull.psicologo.id}")
    @JoinColumn(name="psicologo_id", nullable = false)
    private Psicologo psicologo;

    @NotNull(message = "{NotNull.asesoria.fecha}")
    @Column(name = "asesoria_fecha")
    private Date fecha;

    @ManyToOne
    @NotNull(message = "{NotNull.horario.id}")
    @JoinColumn(name="horario_id", nullable = false)
    private Horario horario;

}

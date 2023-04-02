package pe.edu.cibertec.asesoria.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Entity
@Data
@Table(name="alumno")
public class Alumno implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "alumno_id")
    private int id;

    @NotEmpty(message = "{NotEmpty.alumno.codigo}")
    @Pattern(regexp="i+[0-9]{9}", message = "{Pattern.alumno.codigo}")
    @Column(name = "alumno_codigo")
    private String codigo;

    @NotEmpty(message = "{NotEmpty.alumno.nombre}")
    @Pattern(regexp="[a-zA-Z\s]{5,200}", message = "{Pattern.alumno.nombre}")
    @Column(name = "alumno_nombre")
    private String nombre;

    @NotEmpty (message = "{NotEmpty.alumno.direccion}")
    @Column(name = "alumno_direccion")
    private String direccion;

    @NotEmpty(message = "{NotEmpty.alumno.telefono}")
    @Pattern(regexp="[0-9]{9}", message = "{Pattern.alumno.telefono}")
    @Column(name = "alumno_telefono")
    private String telefono;

    @Column(name = "alumno_email")
    @NotEmpty (message = "{NotEmpty.alumno.email}")
    @Email(message = "{Email.alumno.email}")
    private String email;

    @ManyToOne
    @NotNull(message = "{NotNull.alumno.carrera}")
    @JoinColumn(name="carrera_id", nullable = false)
    private Carrera carrera;

    @ManyToOne
    @NotNull(message = "{NotNull.alumno.ciclo}")
    @JoinColumn(name="ciclo_id", nullable = false)
    private Ciclo ciclo;
}

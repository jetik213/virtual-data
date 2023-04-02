package pe.edu.cibertec.asesoria.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Entity
@Data
@Table(name="psicologo")
public class Psicologo implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "psicologo_id")
    private int id;

    @NotEmpty(message = "{NotEmpty.psicologo.dni}")
    @Pattern(regexp="[0-9]{8}", message = "{Pattern.psicologo.dni}")
    @Column(name = "psicologo_dni")
    private String dni;

    @NotEmpty(message = "{NotEmpty.psicologo.nombre}")
    @Pattern(regexp="[a-zA-Z\s]{5,200}", message = "{Pattern.psicologo.nombre}")
    @Column(name = "psicologo_nombre")
    private String nombre;

    @NotEmpty (message = "{NotEmpty.psicologo.direccion}")
    @Column(name = "psicologo_direccion")
    private String direccion;

    @NotEmpty(message = "{NotEmpty.psicologo.telefono}")
    @Pattern(regexp="[0-9]{9}", message = "{Pattern.psicologo.telefono}")
    @Column(name = "psicologo_telefono")
    private String telefono;

    @Column(name = "psicologo_email")
    @NotEmpty (message = "{NotEmpty.psicologo.email}")
    @Email(message = "{Email.psicologo.email}")
    private String email;

}

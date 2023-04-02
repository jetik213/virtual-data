package pe.edu.cibertec.asesoria.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="horario")
public class Horario implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "horario_id")
    private int id;

    @Column(name = "horario_nombre")
    private String nombre;
}

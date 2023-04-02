package pe.edu.cibertec.asesoria.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="ciclo")
public class Ciclo implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "ciclo_id")
    private int id;

    @Column(name = "ciclo_nombre")
    private String ciclo;
}

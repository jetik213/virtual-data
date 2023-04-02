package pe.edu.cibertec.asesoria.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data //genera el getter y setter
@Entity
@Table(name="carrera") //fuerza a que el nombre de la tabla en la BD quede tal cual
public class Carrera implements Serializable {

    @Id  //indica que es la llave primaria
    @GeneratedValue  //autogenerado
    @Column(name = "carrera_id")
    private int id;

    @Column(name = "carrera_nombre")
    private String nombre;

}

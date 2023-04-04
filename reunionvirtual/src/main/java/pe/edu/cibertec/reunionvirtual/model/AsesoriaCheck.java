package pe.edu.cibertec.reunionvirtual.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Builder
@Table(name="asesoriacheck")
public class AsesoriaCheck implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer idAsesoria;
    private String link;
    private Date fechaCreacion;

    //nuevo implementado

    //@Builder
    public AsesoriaCheck(Integer id, Integer idAsesoria, String link, Date fechaCreacion) {
        this.id = id;
        this.idAsesoria = idAsesoria;
        this.link = link;
        this.fechaCreacion = fechaCreacion;
    }
    public AsesoriaCheck(Integer idAsesoria, String link, Date fechaCreacion) {
        this.idAsesoria = idAsesoria;
        this.link = link;
        this.fechaCreacion = fechaCreacion;
    }

    public AsesoriaCheck() {

    }
}

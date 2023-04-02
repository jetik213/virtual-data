package pe.edu.cibertec.reunionvirtual.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
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

    //implementado
    public AsesoriaCheck() {

    }
}

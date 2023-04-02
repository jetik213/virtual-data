package pe.edu.cibertec.asesoria.service;

import pe.edu.cibertec.asesoria.model.Asesoria;

import java.util.List;

public interface IAsesoriaService {

    public List<Asesoria> listarAsesorias();
    public Asesoria obtenerAsesoria(Integer id);
    public Asesoria registrarAsesoria(Asesoria asesoria);
    public Asesoria modificarAsesoria(Asesoria asesoria);
    public String eliminarAsesoria(Integer id);

}

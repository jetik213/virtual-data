package pe.edu.cibertec.asesoria.service;

import pe.edu.cibertec.asesoria.model.Psicologo;

import java.util.List;

public interface IPsicologoService {

    public List<Psicologo> listarPsicologos();
    public Psicologo obtenerPsicologo(Integer id);
    public Psicologo registrarPsicologo(Psicologo psicologo);
    public Psicologo modificarPsicologo(Psicologo psicologo);
    public String eliminarPsicologo(Integer id);
    public List<Psicologo> listarPsicologosPorNombre(String nombre);
}

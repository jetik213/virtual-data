package pe.edu.cibertec.asesoria.service;

import pe.edu.cibertec.asesoria.model.Alumno;

import java.util.List;

public interface IAlumnoService {

    public List<Alumno> listarAlumnos();
    public Alumno obtenerAlumno(Integer id);
    public Alumno registrarAlumno(Alumno alumno);
    public Alumno modificarAlumno(Alumno alumno);
    public String eliminarAlumno(Integer id);
    public List<Alumno> listarAlumnosPorNombre(String nombre);
}

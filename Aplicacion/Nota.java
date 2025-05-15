import java.util.*;
public class Nota {
    private String titulo;
    private String contenido;
    private Date fechaCreacion;
    private Date fechaActualizacion;
    private Estudiante estudiante;
    private Curso curso;
    private List<Clasificacion> clasificaciones;
    private List<Archivo> archivos;

    public Nota(String titulo, String contenido, Estudiante estudiante, Curso curso) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.estudiante = estudiante;
        this.curso = curso;
        this.fechaCreacion = new Date();
        this.fechaActualizacion = new Date();
        this.clasificaciones = new ArrayList<>();
        this.archivos = new ArrayList<>();
    }

    public void editarNota(String nuevoContenido) {
        this.contenido = nuevoContenido;
        this.fechaActualizacion = new Date();
    }

    public void agregarClasificacion(Clasificacion clasificacion) {
        clasificaciones.add(clasificacion);
    }

    public void agregarArchivo(Archivo archivo) {
        archivos.add(archivo);
    }

    // Getters
    public String getTitulo() { return titulo; }
    public String getContenido() { return contenido; }
    public Estudiante getEstudiante() { return estudiante; }
    public Curso getCurso() { return curso; }
    public List<Clasificacion> getClasificaciones() { return clasificaciones; }
    public List<Archivo> getArchivos() { return archivos; }
}
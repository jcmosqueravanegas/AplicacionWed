import java.util.*;

public class Nota {
    private String titulo;
    private String contenido;
    private Date fechaCreacion;
    private Date fechaActualizacion;
    private Materia materia;
    private List<Etiqueta> etiquetas;
    private List<ArchivoAdjunto> archivos;

    public Nota(String titulo, String contenido, Materia materia) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaCreacion = new Date();
        this.fechaActualizacion = new Date();
        this.materia = materia;
        this.etiquetas = new ArrayList<>();
        this.archivos = new ArrayList<>();
    }

    public void editarNota(String nuevoContenido) {
        this.contenido = nuevoContenido;
        this.fechaActualizacion = new Date();
    }

    public void agregarEtiqueta(Etiqueta etiqueta) {
        etiquetas.add(etiqueta);
    }

    public void agregarArchivo(ArchivoAdjunto archivo) {
        archivos.add(archivo);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public Materia getMateria() {
        return materia;
    }

    public List<Etiqueta> getEtiquetas() {
        return etiquetas;
    }

    public List<ArchivoAdjunto> getArchivos() {
        return archivos;
    }

    @Override
    public String toString() {
        return "Nota: " + titulo + "\n" +
               "Contenido: " + contenido + "\n" +
               "Materia: " + materia + "\n" +
               "Etiquetas: " + etiquetas + "\n" +
               "Archivos: " + archivos + "\n" +
               "Creada: " + fechaCreacion + " | Actualizada: " + fechaActualizacion;
    }
}
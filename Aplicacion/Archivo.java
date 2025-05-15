public abstract class Archivo {
    private String nombreArchivo;
    private String rutaArchivo;

    public Archivo(String nombreArchivo, String rutaArchivo) {
        this.nombreArchivo = nombreArchivo;
        this.rutaArchivo = rutaArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public abstract String getTipoArchivo();
}
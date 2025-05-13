public class ArchivoAdjunto {
    private String nombreArchivo;
    private String tipoArchivo;
    private String rutaArchivo;

    public ArchivoAdjunto(String nombreArchivo, String tipoArchivo, String rutaArchivo) {
        this.nombreArchivo = nombreArchivo;
        this.tipoArchivo = tipoArchivo;
        this.rutaArchivo = rutaArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public String getTipoArchivo() {
        return tipoArchivo;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    @Override
    public String toString() {
        return nombreArchivo + " (" + tipoArchivo + ") - " + rutaArchivo;
    }
}
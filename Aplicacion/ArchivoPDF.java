public class ArchivoPDF extends Archivo {
    public ArchivoPDF(String nombreArchivo, String rutaArchivo) {
        super(nombreArchivo, rutaArchivo);
    }

    @Override
    public String getTipoArchivo() {
        return "PDF";
    }
}

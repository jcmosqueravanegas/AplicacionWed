
public class ArchivoWord extends Archivo {
    public ArchivoWord(String nombreArchivo, String rutaArchivo) {
        super(nombreArchivo, rutaArchivo);
    }

    @Override
    public String getTipoArchivo() {
        return "DOCX";
    }
}
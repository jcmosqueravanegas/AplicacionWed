public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Ana", "ana@mail.com", "1234");
        Curso curso = new Curso("Matemáticas");
        Nota nota = new Nota("Tarea 1", "Resolver ecuaciones", estudiante, curso);

        nota.agregarClasificacion(new Clasificacion("Tarea"));
        nota.agregarArchivo(new ArchivoPDF("ejercicios.pdf", "/docs/ejercicios.pdf"));
        nota.agregarArchivo(new ArchivoWord("respuestas.docx", "/docs/respuestas.docx"));

        System.out.println("Nota: " + nota.getTitulo());
        System.out.println("Curso: " + nota.getCurso().getNombre());
        System.out.println("Estudiante: " + nota.getEstudiante().getNombre());
        System.out.println("Clasificaciones:");
        for (Clasificacion c : nota.getClasificaciones()) {
            System.out.println("- " + c.getNombre());
        }
        System.out.println("Archivos:");
        for (Archivo a : nota.getArchivos()) {
            System.out.println("- " + a.getNombreArchivo() + " (" + a.getTipoArchivo() + ")");
        }
    }
}
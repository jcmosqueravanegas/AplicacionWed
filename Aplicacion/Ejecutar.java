import java.util.*;

public class Ejecutar {
    public static void main(String[] args) {
      
        Usuario usuario = new Usuario("Juan", "juan@mail.com", "1234");
        usuario.iniciarSesion("juan@mail.com", "1234");

        Materia matematicas = new Materia("Matemáticas");

       
        Nota nota = new Nota("Tarea Derivadas", "Resolver ejercicios del libro", matematicas);

        System.out.println("Título: " + nota.getTitulo());
        System.out.println("Contenido: " + nota.getContenido());
        System.out.println("Materia: " + nota.getMateria().getNombre());

        nota.editarNota("Resolver ejercicios del libro (páginas 10 a 20)");
        System.out.println("\nNota actualizada:");
        System.out.println("Contenido: " + nota.getContenido());

      
        Etiqueta tag1 = new Etiqueta("Cálculo");
        Etiqueta tag2 = new Etiqueta("Parcial1");
        nota.agregarEtiqueta(tag1);
        nota.agregarEtiqueta(tag2);

        System.out.println("\nEtiquetas:");
        for (Etiqueta e : nota.getEtiquetas()) {
            System.out.println("- " + e.getNombre());
        }

        ArchivoAdjunto archivo = new ArchivoAdjunto("EjerciciosDerivadas.pdf", "PDF", "/docs/derivadas.pdf");
        nota.agregarArchivo(archivo);

        System.out.println("\nResumen completo de la nota:\n" + nota);

      
        usuario.cerrarSesion();
    }
}
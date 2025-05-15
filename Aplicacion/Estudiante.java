public class Estudiante {
    private String nombre;
    private String correo;
    private String contrasena;

    public Estudiante(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public boolean iniciarSesion() {
        return true;
    }

    public void cerrarSesion() {
        System.out.println("Sesión cerrada.");
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public String getCorreo() { return correo; }
    public String getContrasena() { return contrasena; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}
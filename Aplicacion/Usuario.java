public class Usuario {
    private String nombre;
    private String correo;
    private String contrasena;
    private boolean sesionIniciada;

    public Usuario(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.sesionIniciada = false;
    }

    public boolean iniciarSesion(String correo, String contrasena) {
        if (this.correo.equals(correo) && this.contrasena.equals(contrasena)) {
            this.sesionIniciada = true;
            System.out.println("Sesión iniciada correctamente para " + nombre);
            return true;
        } else {
            System.out.println("Credenciales incorrectas.");
            return false;
        }
    }

    public void cerrarSesion() {
        if (sesionIniciada) {
            sesionIniciada = false;
            System.out.println("Sesión cerrada para " + nombre);
        } else {
            System.out.println("No hay una sesión activa.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public boolean isSesionIniciada() {
        return sesionIniciada;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Usuario{" +
               "nombre='" + nombre + '\'' +
               ", correo='" + correo + '\'' +
               ", sesionIniciada=" + sesionIniciada +
               '}';
    }
}
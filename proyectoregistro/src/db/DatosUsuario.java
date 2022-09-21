package db;

public class DatosUsuario {
    private String nombres;
    private String apellidos;
    private String email;
    private String usuario;
    private String contraseña;

    //CONSTRUCTOR VACIO
    public DatosUsuario() {
        nombres = null;
        apellidos = null;
        email = null;
        usuario = null;
        contraseña = null;
    }

    //CONSTRUCTO
    public DatosUsuario(String nombres, String apellidos, String email, String usuario, String contraseña) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    

    //METODOS GET AND SETTER
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}

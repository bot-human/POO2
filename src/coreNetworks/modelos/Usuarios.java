package coreNetworks.modelos;

public class Usuarios {
    //Atributos
    private String nombreUsuario;
    private String contrasena;
    private String nombreCompleto;
    private String direccion;

    //2. Metodos
    public String mostrarDatos () {
        return "Nombre del Usuario: " + nombreUsuario + "Contraseña: " + contrasena +
                "Nombre completo: " + nombreCompleto + "Direccion:" + direccion;
    }

    //Constructores
    public Usuarios(){}

    public Usuarios (String nombreUsuario, String contrasena, String nombreCompleto, String direccion) {
        this.nombreUsuario = nombreUsuario;  //palabra reservada this distingue un parametro de entra del atributo
        this.contrasena = contrasena;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
    }

    //4. Setter
    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }
    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    }
    public void setNombreCompleto (String nombreCompleto){
        this.nombreCompleto = nombreCompleto;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    //Getters
    public String getNombreUsuario(){
        return nombreUsuario;
    }
    public String getContrasena(){
        return contrasena;
    }
    public String getNombreCompleto(){
        return nombreCompleto;
    }
    public String getDireccion(){
        return direccion;
    }

}

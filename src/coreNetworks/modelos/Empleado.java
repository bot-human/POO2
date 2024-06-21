package coreNetworks.modelos;

public class Empleado {
    //Atributos - PRIVATE para ocultar datos sensibles
    protected int idEmpleado;
    protected String nombre;
    protected String nDni;
    protected double sueldo;
    protected final static double PORCENTAJE = 0.75;

    public Empleado() {

    }

    //Metodos - PUBLIC datos publico
    public double calcularNomina(){
        return sueldo* PORCENTAJE;
    }

    //Contructures - siempre dejar 1 VACIO, p +adelante utilizar en spring
    // boton derechO opcion GENERATE, selecione CONSTRUCTOR y selecione las opciones disponibles

    public Empleado(int idEmpleado, String nombre, String nDni, double sueldo) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.nDni = nDni;
        this.sueldo = sueldo;
    }
    //Setter

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setnDni(String nDni) {
        this.nDni = nDni;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //Getter

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getnDni() {
        return nDni;
    }

    public double getSueldo() {
        return sueldo;
    }
}

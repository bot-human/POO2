package coreNetworks.modelos;

public class Operador extends Empleado {
    private int pieza;
    private double incentivo;

    @Override
    public double calcularNomina() {
        return super.calcularNomina() + (pieza * incentivo*PORCENTAJE);
    }

    public Operador() {
    }

    public Operador(int idEmpleado, String nombre, String nDni, double sueldo, int pieza, double incentivo) {
        super(idEmpleado, nombre, nDni, sueldo);
        this.pieza = pieza;
        this.incentivo = incentivo;
    }


}

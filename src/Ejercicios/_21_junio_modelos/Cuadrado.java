package Ejercicios._21_junio_modelos;

public class Cuadrado extends Figuras{

    private double lado;

    @Override
    public double CalcularArea() {
        return lado*lado;
    }

    public Cuadrado() {
    }

    public Cuadrado(int x, int y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}

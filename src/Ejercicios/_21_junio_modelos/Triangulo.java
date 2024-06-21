package Ejercicios._21_junio_modelos;

public class Triangulo extends Figuras {

    private double base;
    private double altura;

    @Override
    public double CalcularArea() {
        return base*altura /2;
    }

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(int x, int y, double base, double altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

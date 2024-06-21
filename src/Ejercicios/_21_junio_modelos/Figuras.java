package Ejercicios._21_junio_modelos;

public class Figuras {
    protected int x;
    protected int y;

    public double CalcularArea(){
        return 0;
    }


    public String mostrarPosicion(){
        return "x,y "+x + " "+ y;
    }

    public Figuras(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Figuras() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

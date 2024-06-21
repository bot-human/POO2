package Ejercicios._20_junio_modelos;

public class Campo {
    private int x;

    public  int mostrar(){
        return x;
    }

    public void incrementar(){
        x++;
    }

    public Campo() {
    }

    public Campo(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


}

package Ejercicios._21_junio_modelos;

public class Bateria extends InstrumentoMusical{
    private int noPlatillos;

    @Override
    public String emiteSonido() {
        return "bata bata";
    }

    public Bateria() {
    }

    public Bateria(String marca, int noPlatillos) {
        super(marca);
        this.noPlatillos = noPlatillos;
    }

    public int getNoPlatillos() {
        return noPlatillos;
    }

    public void setNoPlatillos(int noPlatillos) {
        this.noPlatillos = noPlatillos;
    }
}



package Ejercicios._21_junio_modelos;

public class InstrumentoMusical {
    protected String marca;

    public String emiteSonido(){
        return "";
    }

    public InstrumentoMusical() {
    }

    public InstrumentoMusical(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

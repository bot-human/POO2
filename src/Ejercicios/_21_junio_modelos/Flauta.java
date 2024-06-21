package Ejercicios._21_junio_modelos;

public class Flauta extends InstrumentoMusical{
    private String material;

    @Override
    protected String emiteSonido() {
        return "flu flua";
    }

    public Flauta() {
    }

//    public Flauta(String marca, String material) {
//        super(marca);
//        this.material = material;
//    }
    //GetterSetter

}

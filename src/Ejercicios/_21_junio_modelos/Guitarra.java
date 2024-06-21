package Ejercicios._21_junio_modelos;

public class Guitarra extends InstrumentoMusical{

    private String tipoCuerdas;

    @Override
    public String emiteSonido(){
        return "bam bam";
    }

    public Guitarra() {
    }

    public Guitarra(String tipoCuerdas) {
        this.tipoCuerdas = tipoCuerdas;
    }

    public String getTipoCuerdas() {
        return tipoCuerdas;
    }

    public void setTipoCuerdas(String tipoCuerdas) {
        this.tipoCuerdas = tipoCuerdas;
    }
}

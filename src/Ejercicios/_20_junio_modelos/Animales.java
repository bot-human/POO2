package Ejercicios._20_junio_modelos;

public class Animales {
    //EJERCICIO 2
    //Crear la clase Animal con los atributos (propiedades) y operaciones (métodos) que se
    //estimen oportunos.
    //Crear la clase TestAnimal desde donde se crearán 3 objetos: Perro, pez y cocodrilo.
    //Modificar las propiedades de cada objeto y llamar a cada uno de los métodos
    //mostrando el resultado por pantalla.
    private String tipo;
    private int numExtremidades;
    private boolean vuelo;
    private float tamano;

    public Animales() {
    }

    public String moverse (){
        return moverse();
    }
    public String comer(){
        return comer();
    }
    public String sonidoEmitido(){
        return sonidoEmitido();
    }

    //@Override //generate toString genera automatico

    public String registroEntradas () {
        return "Animal: " + tipo + "Extremidades: " + numExtremidades +
                "puede volar: " + vuelo + "su tamaño es:" + tamano ;
    }


    public Animales(String tipo, int numExtremidades, boolean vuelo, float tamano, String moverse, String comer, String sonidoEmitido) {
        this.tipo = tipo;
        this.numExtremidades = numExtremidades;
        this.vuelo = vuelo;
        this.tamano = tamano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumExtremidades() {
        return numExtremidades;
    }

    public void setNumExtremidades(int numExtremidades) {
        this.numExtremidades = numExtremidades;
    }

    public boolean isVuelo() {
        return vuelo;
    }

    public void setVuelo(boolean vuelo) {
        this.vuelo = vuelo;
    }

    public float getTamano() {
        return tamano;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }

}



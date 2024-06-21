package Ejercicios._20_junio_presentacion;

import Ejercicios._20_junio_modelos.Animales;

public class ProbarAnimales {
    public static void main(String [] args){
        Animales a1 = new Animales("mamifero",5,  true, 5, "arrastra", "racion", "ranger");

        a1.setTipo("herbivoro");
        a1.setNumExtremidades(2);
        a1.setVuelo(true);
        a1.setTamano(25);
        System.out.println(a1.registroEntradas());
    }
}

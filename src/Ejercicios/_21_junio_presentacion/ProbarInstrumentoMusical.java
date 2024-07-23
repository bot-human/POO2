package Ejercicios._21_junio_presentacion;

import Ejercicios._21_junio_modelos.Bateria;
import Ejercicios._21_junio_modelos.Flauta;
import Ejercicios._21_junio_modelos.Guitarra;
import Ejercicios._21_junio_modelos.InstrumentoMusical;

public class ProbarInstrumentoMusical {
    public static void main(String[] args) {
        InstrumentoMusical guido = new Guitarra("xx","nylon"); //Polimorfismo
        InstrumentoMusical bataca = new Bateria("xx",5); //Polimorfismo
        InstrumentoMusical ham = new Flauta("xx","madera"); //Polimorfismo
        InstrumentoMusical[] instrumentos = new InstrumentoMusical[3];

        instrumentos[0]= guido;
        instrumentos[1]= bataca;
        instrumentos[2] = ham;

        for(InstrumentoMusical elemento : instrumentos){
            System.out.println("---");
            System.out.println(elemento.getClass());
            System.out.println(elemento.emiteSonido());
        }


    }
}
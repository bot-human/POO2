package Ejercicios._20_junio_presentacion;

import Ejercicios._20_junio_modelos.Campo;

public class ProbarCampo {
    public static void main (String[] args){
        Campo c1 = new Campo(5);
        c1.incrementar();
        System.out.println(c1.mostrar());
    }

}

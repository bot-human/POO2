package coreNetworks.modelos;

import java.util.Random;

public class Dado {
    private Random numAleatorio = new Random();

    public int lanzaDado(){
        int valorDado = numAleatorio.nextInt(1,7);
        return valorDado;
    }
    public static String Uno(){
        return "\n" + "*" + "\n";
    }
    public static String Dos(){
        return "\n" + "*" + "\n";
    }
    public static String Cuatro(){
        return "\n" + "*" + "\n";
    }


}

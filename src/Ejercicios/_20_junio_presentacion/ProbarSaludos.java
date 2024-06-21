package Ejercicios._20_junio_presentacion;

import Ejercicios._20_junio_modelos.Saludar;

public class ProbarSaludos {
    public static void main (String [] args){
        Saludar s1 = new Saludar("Franci","portugues",30, "Brasil", "Obrigado");

        s1.setPersonaQsaluda("Sofi");
        s1.setIdioma("frances");
        s1.setEdad(30);
        s1.setLocalizacion("Paris");
        s1.setMensage("Merci");
        System.out.println(s1.saludos());
    }
}

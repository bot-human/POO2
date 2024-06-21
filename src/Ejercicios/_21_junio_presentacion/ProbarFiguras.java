package Ejercicios._21_junio_presentacion;

import Ejercicios._21_junio_modelos.Cuadrado;
import Ejercicios._21_junio_modelos.Figuras;
import Ejercicios._21_junio_modelos.Triangulo;

public class ProbarFiguras {
    public void main (String[] args){
        Cuadrado cPeque = new Cuadrado();
        cPeque.setX(0);
        cPeque.setY(0);
        cPeque.setLado(5);

        Figuras cMediano = new Cuadrado(3,5,8);

        Triangulo tPeque = new Triangulo();
        tPeque.setX(3);
        tPeque.setY(2);
        tPeque.setAltura(7);
        tPeque.setBase(5);

        Figuras tMediano = new Triangulo(5,6,8,9);

        Figuras[] abstracto = new Figuras[4];
        abstracto[0] = cPeque;
        abstracto[1] = cMediano;
        abstracto[2]= tPeque;
        abstracto[3] = tMediano;


        //for(int i=0; i< abstracto.length);

        for(Figuras elementos: abstracto){
            System.out.println(elementos.CalcularArea());

        }

    }

}

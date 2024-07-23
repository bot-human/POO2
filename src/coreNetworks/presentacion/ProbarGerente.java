package coreNetworks.presentacion;

import coreNetworks.modelos.Empleado;
import coreNetworks.modelos.Gerente;
import coreNetworks.modelos.Vendedor;

public class ProbarGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setSueldo(1500);
        System.out.println("Nomina -> " + g1.calcularNomina());

        Gerente g2 = new Gerente(1, "Ana Flores", "12345678D",
                3_000, 5, 1_000, "Ventas");
        System.out.println("Nomina -> " + g2.calcularNomina());

        //Polimofismo variable de alguna referencia a la pila
        //UpCasting
        Empleado ePolimodismo = new Gerente(1,
                "Juan Lopes", "12345A", 2_000.0,
                5,200, "Ventas");
        System.out.println(ePolimodismo.getIdEmpleado());
        System.out.println(ePolimodismo.calcularNomina());

        Gerente g3 = new Gerente(1,
                "Juan Lopes", "12345A", 2_000.0,
                5,200, "Ventas");
        //UpCasting
        Empleado ePolimarfimo2 = g3;

        //DownCasting
        Gerente g4 = (Gerente) ePolimodismo;

        Empleado a1 = new Empleado();
        //Gerente g5 = (Gerente)

        Empleado a2 = new Vendedor(1,"Dani Romero", "85421L",3520,5,200,"Ventas");

        System.out.println(ePolimodismo.getIdEmpleado());
        System.out.println();


        Empleado[] empleados = new Empleado[3];
        empleados[0] = ePolimodismo;
        empleados[1] = new Empleado(1,"Juan Lopes", "123456A",1000);
        empleados[2] = new Empleado(2,"Ana Flores", "54123S", 1000);

        for(Empleado elemento: empleados){
            System.out.println("----Calculando la nomina adecuada ---");
            System.out.println(elemento.getClass());
            System.out.println();
        }


    }

}

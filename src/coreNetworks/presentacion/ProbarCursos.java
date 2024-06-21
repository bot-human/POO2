package coreNetworks.presentacion;


import coreNetworks.modelos.Cursos;

public class ProbarCursos {
    public static void main (String[] args) {
        //Instancia la clase Curso
        Cursos c1 = new Cursos(1,"Programacion en Java", 1_500.00, 60f);

        c1.setRequisitos("ESO");
        c1.setModalidad("Presencial");
        c1.setTipoCurso("Informatica");
        c1.setContenido("JSE");
        c1.setDuracion(3);
        c1.setPrecio(1_500.00);
        c1.setIdCurso(1);
        System.out.println(c1.mostrarInformacion());
    }


}

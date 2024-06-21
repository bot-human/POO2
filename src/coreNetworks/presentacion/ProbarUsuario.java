package coreNetworks.presentacion;

import coreNetworks.modelos.Usuarios;

public class ProbarUsuario {
    public static void main(String[] args){
        Usuarios u1 = new Usuarios();
        Usuarios u2 = new Usuarios("bot", "54321","Davis", "mi casa");

        System.out.println(u1.mostrarDatos());
        System.out.println(u2.mostrarDatos());
        u1.setNombreUsuario("star");
        u1.setContrasena("54321");
        u1.setNombreCompleto("Davi");
        u1.setDireccion("sua casa");
        System.out.println(u1.mostrarDatos());
        System.out.println(u2.getNombreUsuario() + u2.getContrasena() + u2.getNombreCompleto() + u2.getDireccion());
    }
}

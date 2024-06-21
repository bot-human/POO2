package coreNetworks.modelos;

public class Cursos {

    //1. Atributos (dominio)
    public String nombre;
    public String contenido;
    public String requisitos;
    public float duracion;
    public double precio;
    public int idCurso;
    public String modalidad;
    public String tipoCurso;

    //2. Metodos
    public Cursos[] mostrarCurso(String tipoCurso, String modalidad){
        return new Cursos[6];
    }
    public void solicitarCriterioBusqueda(){
        System.out.println("Mandamos solicitar a la capa coreNetworks.presentacion");
    }

    public String mostrarInformacion (){
        return "idCurso:" + idCurso + "nombre: " + nombre +
        "contenido" + contenido + "requisitos" + requisitos +
        "duracion" + duracion + "precio: " + precio +
        "modalidad: " + modalidad + "Tipo curso :" +tipoCurso;
    }

    //3. Constructores
    //sobrecargando os contructures
    //Constructor vacio
    public Cursos(){}


    public Cursos (int idCurso, String nombre, double precio, float duracion){
        this.idCurso = idCurso;  //palabra reservada this distingue un parametro de entra del atributo
        this.nombre = nombre;
        this.precio = precio;
        this.duracion = duracion;
    }

    //4. Setter
    public void setIdCurso(int idCurso){
        this.nombre = nombre;
    }
    public void setRequisitos(String requisitos){
        this.contenido = contenido;
    }
    public void setDuracion (float duracion){
        this.duracion = duracion;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void setModalidad(String modalidad){
        this.modalidad = modalidad;
    }
    public void setTipoCurso(String tipoCurso){
        this.tipoCurso = tipoCurso;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    //Geter
    public int getIdCurso(){
        return idCurso;
    }
    public double getPrecio(){
        return precio;
    }
    public float getDuracion() {
        return duracion;
    }
    public String getRequisitos() {
        return requisitos;
    }
    public String getContenido() {
        return contenido;
    }
    public String getModalidad() {
        return modalidad;
    }
    public String getTipoCurso() {
        return tipoCurso;
    }



}

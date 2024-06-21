package Ejercicios._20_junio_modelos;

public class Saludar {
    //EJERCICIO 1
    //Crear una clase Saludo con un método saludar donde se muestre un mensaje de bienvenida.
    //Crear una clase Main y desde el método main crear una instancia de la clase Saludo e
    //invocar al método saludar.
    private String personaQsaluda;
    private String idioma;
    private int edad;
    private String localizacion;
    private String mensage;


    public Saludar(){

    }

    public String contestarSaludos(){
        return mensage;
    }


    //Metodos
    public String saludos(){
        return "Saludamos a: " + personaQsaluda + ". Que idioma hablas? " + idioma +
                ". Cual es la edad? " +edad + " años" + ". De donde eres? " + localizacion + ". Muy bienvenida. " + mensage;
    }

    //Contructores

    public Saludar(String personaQsaluda, String idioma, int edad, String localizacion, String mensage) {
        this.personaQsaluda = personaQsaluda;
        this.idioma = idioma;
        this.edad = edad;
        this.localizacion = localizacion;
        this.mensage = mensage;
    }

    // Setter Getter


    public String getPersonaQsaluda() {
        return personaQsaluda;
    }

    public void setPersonaQsaluda(String personaQsaluda) {
        this.personaQsaluda = personaQsaluda;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getMensage() {
        return mensage;
    }

    public void setMensage(String mensage) {
        this.mensage = mensage;
    }
}

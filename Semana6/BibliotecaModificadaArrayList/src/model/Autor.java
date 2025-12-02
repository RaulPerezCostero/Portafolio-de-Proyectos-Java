package model;

public class Autor {
    
    //Atributos

    private String nombre;
    private String apellidos;
    private boolean premioPlaneta;

    //Constructor de autor.

    public Autor(String nombre, String apellidos, boolean premioPlaneta){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.premioPlaneta = premioPlaneta;
    }

    //Setters y getters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

        public String getNombre() {
            return nombre;
        }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setPremioPlaneta(boolean premioPlaneta) {
        this.premioPlaneta = premioPlaneta;
    }

    public boolean getPremioPlaneta(){
        return premioPlaneta;
    }


}

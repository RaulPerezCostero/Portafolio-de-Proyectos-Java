package model;

public class Persona2 {

    private String nombre = "sin nombre";
    private double peso;
    private double talla;

    public Persona2(){
        this.nombre = "Desconocido";
        this.peso = 80; //por ejemplo, para inicializar.
        this.talla = 1.80; //por ejemplo, para inicializar.

    }

    public Persona2(String paramNombre){
        this.nombre = paramNombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }
}
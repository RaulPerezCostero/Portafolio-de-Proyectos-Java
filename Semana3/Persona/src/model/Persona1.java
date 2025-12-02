package model;

public class Persona1 {

    private String nombre = "sin nombre";
    private double peso;
    private double talla;

    public Persona1(){
        //soy un constructor vacio
    }

    public Persona1(String paramNombre){
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
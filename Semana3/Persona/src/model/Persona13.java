package model;

public class Persona13 {

    private String nombre = "sin nombre";
    private float peso;
    private int edad;
    private float talla;

    public Persona13(){
        //soy un constructor vacio
    }

    public Persona13(String paramNombre, int edad, float talla, float peso){
        this.nombre = paramNombre;
        this.edad = edad;
        this.talla = talla;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public float getTalla() {
        return talla;
    }

    public void setTalla(float talla) {
        this.talla = talla;
    }
}
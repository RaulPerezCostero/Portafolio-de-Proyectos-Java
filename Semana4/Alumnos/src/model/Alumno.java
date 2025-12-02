package model;

public class Alumno {

    private String nombre;
    private float parcial1;
    private float parcial2;
    private float examenFinal;

    public Alumno(){

    }

    public Alumno(String nombre, float parcial1, float parcial2, float examenFinal){
        this.nombre = nombre;
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.examenFinal = examenFinal;

    }

    public double Media(){
        return this.parcial1*0.1+this.parcial2*0.1+this.examenFinal*0.8;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setParcial1(float parcial1) {
        this.parcial1 = parcial1;
    }

    public float getParcial1() {
        return parcial1;
    }

    public void setParcial2(float parcial2) {
        this.parcial2 = parcial2;
    }

    public float getParcial2() {
        return parcial2;
    }

    public void setExamenFinal(float examenFinal) {
        this.examenFinal = examenFinal;
    }

    public float getExamenFinal() {
        return examenFinal;
    }
    
}
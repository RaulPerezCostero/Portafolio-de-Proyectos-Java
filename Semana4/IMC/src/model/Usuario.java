package model;

public class Usuario {
    private String nombre;
    private float peso;
    private float altura;

    public Usuario(String nombre, float peso, float altura) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }

    public float IMC() {
        return peso / (altura * altura);
    }

    
    public String getNombre() {
        return nombre;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }
}

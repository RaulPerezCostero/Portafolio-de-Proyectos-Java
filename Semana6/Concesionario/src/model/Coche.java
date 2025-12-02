package model;
public class Coche {
    private String matricula;
    private String color;
    private String marca;
    private String modelo;
    
    public Coche(String matricula, String color, String marca, String modelo) {
        this.matricula = matricula;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCocheString() {
        return "Persona [matricula=" + matricula + ", color=" + color + ", marca=" + marca + " modelo="+ modelo+ " ]";
    }

    
}



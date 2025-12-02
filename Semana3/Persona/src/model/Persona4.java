package model;

public class Persona4 {

    private String nombre = "sin nombre"; //Primero se inicializa el atributo
    private double peso;
    private double talla;

    public Persona4(){
        System.out.println("Ejecución del constructor vacio"); //y luego se ejcuta el constructor
        this.nombre = "Desconocido";
        this.peso = 80; //por ejemplo, para inicializar.
        this.talla = 1.80; //por ejemplo, para inicializar.
    }

    public Persona4(String paramNombre){
        System.out.println("Ejecución del constructor inicializado");
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

    
    // Ahora calculamos el IMC
    public double getIMC() {
        if (talla > 0) {
            return peso / (talla * talla);
        } else {
            return 0;
        }
    }
}

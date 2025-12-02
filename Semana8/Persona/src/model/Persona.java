package model;

public class Persona {
    private String nombre;
    private String telefono;
    private double peso;

    public Persona(String nombre, String telefono, double peso) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.peso = peso;
    }

    public static Persona LeerPersona(String delimitedString, String delimiter) {
        String[] chunks = delimitedString.split(delimiter);
    
        if (chunks.length != 3) {
            System.out.println("Error: la línea no tiene 3 campos: " + delimitedString);
            return null;
        }
    
        try {
            String nombre = chunks[0];
            String telefono = chunks[1]; //Lo ponemos como String en vez de int ya que se interpreta bien igualmente y hace mas sencillo el programa al no usar otro delimiador "-"
            double peso = Double.parseDouble(chunks[2]);
            
            return new Persona(nombre, telefono, peso);
        } catch (Exception e) {
            System.out.println("\u001b[33mError al convertir la línea en persona: " + delimitedString + " - " + e.getMessage() + "\u001b[0m");
            return null;
        }
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    
}

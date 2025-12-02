package model;

public class Alumno {

    private String DNI;
    private String nombre;
    private String apellido1;
    private String apellido2;
    
    public Alumno(String dNI, String nombre, String apellido1, String apellido2) {
        DNI = dNI;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public static Alumno getAlumnoFromDelimitedString(String linea, String delimitador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAlumnoFromDelimitedString'");
    }

    public String getAlumnoAsString(String delimitador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAlumnoAsString'");
    }

    
}

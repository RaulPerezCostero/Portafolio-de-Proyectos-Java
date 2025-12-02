package com.ListaDeClase.model;

import java.util.Locale;
import java.util.Random;

public class DatosPersonales {
    private String nombre;
    private String apellidos;
    private int edad;
    private String NIF;

    public DatosPersonales(String nombre, String apellidos, int edad, String nIF) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        NIF = nIF;
    }

    public DatosPersonales(int numeroPersona){
        nombre="Desconocido " + numeroPersona;
        apellidos="Apellidos desconocido " + numeroPersona;
        edad=numeroAleatorio();
        NIF=crearNIF();
    }

    public String DatosPersonalesAString(){
        return "Nombre: " + nombre + ", apellidos: " + apellidos + ", edad: " + edad + ", NIF: " + NIF;
    }

    public String getInstanceAsDelimitedString(String delimiter){
        return String.format(Locale.ENGLISH,"%s"+delimiter+"%s"+delimiter+"%d"+delimiter+"%s", nombre,apellidos,edad,NIF);
    }


    public int numeroAleatorio(){
        Random random = new Random();
        int numeroRandom = random.nextInt(99-1)+1;
        return numeroRandom;
    }

    public String crearNIF() {
        Random random = new Random();
        int numero = random.nextInt(100000000);
        char letra = (char) ('A' + random.nextInt(26));
        return numero + String.valueOf(letra);
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String nIF) {
        NIF = nIF;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellidos: " + apellidos + ", Edad: " + edad + ", NIF: " + NIF;
    }
    
}

package com.ListaDeClase.model;

import java.util.Locale;
import java.util.Random;

public class Direccion {
    private String calle;
    private int numero;
    private int piso;
    private String letra;
    
    public Direccion(String calle, int numero, int piso, String letra) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.letra = letra;
    }

    public Direccion(){
        calle="Calle desconocida";
        numero=numeroAleatorio();
        piso=numeroAleatorio();
        letra="A";
    }

    public String DireccionAString(){
        return "Calle: " + calle + ", número: " + numero + 
            ", piso: " + piso + ", letra: " + letra;
    }

    public String getInstanceAsDelimitedString(String delimiter) {
        return String.format(Locale.ENGLISH,"%s"+delimiter+"%d"+delimiter+"%d"+delimiter+"%s", calle,numero,piso,letra);
    }

    public int numeroAleatorio(){
        Random random = new Random();
        int numeroRandom = random.nextInt(99-1)+1;
        return numeroRandom;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "Calle: " + calle + ", Número: " + numero + ", Piso: " + piso + ", Letra: " + letra;
    }

}

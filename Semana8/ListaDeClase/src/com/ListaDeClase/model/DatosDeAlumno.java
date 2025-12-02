package com.ListaDeClase.model;

public class DatosDeAlumno {
    private Direccion direccion;
    private DatosPersonales datosPersonales;
    
    public DatosDeAlumno(Direccion direccion, DatosPersonales datosPersonales) {
        this.direccion = direccion;
        this.datosPersonales = datosPersonales;
    }

    public String DatosDeAlumnoAString(){
        return "| Dirección[ " + direccion + " ] | DatosPersonales[ " + datosPersonales + " ]";
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }

    public void setDatosPersonales(DatosPersonales datosPersonales) {
        this.datosPersonales = datosPersonales;
    }
    
    @Override
    public String toString() {
        return direccion.DireccionAString() + " | " + datosPersonales.DatosPersonalesAString();
    }
}

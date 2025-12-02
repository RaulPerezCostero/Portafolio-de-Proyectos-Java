package com.ExportarImprotarLibros.controller;

import java.util.ArrayList;

import com.ExportarImprotarLibros.model.Libro;
import com.ExportarImprotarLibros.model.Modelo;
import com.ExportarImprotarLibros.view.Vista;

public class Controlador {

    Modelo m;
    Vista v;

    public Controlador(Modelo m, Vista v) {
        this.m = m;
        this.v = v;
        v.setController(this);
    }

    public void init() {//Inicializa la app
        if(m.cargarDatosBinario()){
            v.showMessage("Se ha cargado la información del binario");
        }else{
            v.showError("Ha habido un error en la lectura del binario");
        }
        
        v.mostrarMenu();

        //Finaliza la app
        if(m.guardarDatosBinario()){
            v.showMessage("Se ha guardado la información en el binario");
        }else{
            v.showError("Ha habido un error al guardar los datos en el binario");
        }
    }

    public ArrayList<Libro> mostrarLibros(){
        return m.mostrarLibros();
    }

    public boolean exportarLibrosJSON() {
        return m.exportarLibrosJSON();
    }

    public boolean importarLibrosJSON() {
        return m.importarLibrosJSON();
    }

    public void agregarNuevoLibro(Libro libro) {
        m.agregarNuevoLibro(libro);
    }

    public void eliminarLibro(Libro libro) {
        m.eliminarLibro(libro);
    }

    public void exportarLibrosCSV() {
        m.exportarLibrosCSV();
    }

    public void importarLibrosCSV() {
        m.importarLibrosCSV();
    }

    public boolean exportarLibrosXML() {
        return m.exportarLibrosXML();
    }

    public boolean importarLibrosXML() {
        return m.importarLibrosXML();
    }
}

package com.ListaDeClase.controller;

import com.ListaDeClase.view.Vista;

import java.util.ArrayList;

import com.ListaDeClase.model.DatosDeAlumno;
import com.ListaDeClase.model.Modelo;

public class Controlador {
    Vista v;
    Modelo m;

    public Controlador(Vista vista, Modelo modelo){
        this.v=vista;
        this.m=modelo;
        v.setController(this);
    }

    public void init() {
        v.mostrarMenu();
    }

    public void crearListaAlumnos() {
        m.crearListaAlumnos();
    }

    public ArrayList<DatosDeAlumno> mostrarListaAlumnos() {
        return m.mostrarListaAlumnos();
    }

    public void exportarDatosPersonalesCSV() {
        m.exportarDatosPersonalesCSV();
    }

    public void exportarDireccionesCSV() {
        m.exportarDireccionesCSV();
    }
}

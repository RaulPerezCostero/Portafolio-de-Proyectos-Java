package com.ListaDeClase;

import com.ListaDeClase.controller.Controlador;
import com.ListaDeClase.model.Modelo;
import com.ListaDeClase.view.Vista;

public class App {
    public static void main(String[] args) throws Exception {
        Vista view = new Vista();
        Modelo model = new Modelo();
        Controlador c = new Controlador(view, model);

        c.init();
    }
}

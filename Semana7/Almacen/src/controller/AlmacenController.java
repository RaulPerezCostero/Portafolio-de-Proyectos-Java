package controller;

import model.AlmacenModel;
import view.AlmacenView;

public class AlmacenController {

    AlmacenModel model;
    AlmacenView view;

    public AlmacenController(AlmacenModel model, AlmacenView view){
        this.model=model;
        this.view=view;

        this.view.setController(this);
    }

    public void leerVentas(){
        model.leerVentas();
    }

    public void leerPrecios(){
        model.leerPrecios();
    }

    public void calcularIngresos(){
        model.calcularIngresos();
    }

    public void mostrarResultados(){
        view.mostrarResultados();
    }

    public float getIngresos(){
        return model.getIngresosTotales();
    }

    public void run(){
        this.view.showMenu();
    }
}
package controller;

import model.ConcesionarioModel;
import view.ConcesionarioView;

public class ConcesionarioController {
    ConcesionarioModel model;
    ConcesionarioView view;
    
    public ConcesionarioController(ConcesionarioModel model, ConcesionarioView view) {
        this.model = model;
        this.view = view;

        this.view.setController(this);
    }

    public void agregarCoche(){
        model.agregarCoche();
    }

    public void eliminarCoche(){
        model.eliminarCoche();
    }

    public void modificarCoche(){
        model.modificarCoche();
    }

    public void listarCoche(){
        model.listarCoche();
    }

    public void run(){
        this.view.showMenu();
    }

    public ConcesionarioModel getModel() {
        return model;
    }

    public void setModel(ConcesionarioModel model) {
        this.model = model;
    }

    public ConcesionarioView getView() {
        return view;
    }

    public void setView(ConcesionarioView view) {
        this.view = view;
    }

    

    
}

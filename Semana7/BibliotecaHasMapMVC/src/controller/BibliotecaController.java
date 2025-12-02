package controller;

import model.BibliotecaModel;
import view.BibliotecaView;

public class BibliotecaController {
    BibliotecaModel model;
    BibliotecaView view;

    public BibliotecaController(BibliotecaModel model, BibliotecaView view){
        this.model = model;
        this.view = view;

        this.view.setController(this);
    }

    public void añadirLibro(){
        model.añadirLibro();
    }

    public void eliminarLibro(){
        model.eliminarLibro();
    }

    public void modificarLibro(){
        model.modificarLibro();
    }

    public void mostrarLibro(){
        model.mostrarLibro();
    }

    public void run(){
        this.view.showMenu();
    }

    public BibliotecaModel getModel() {
        return model;
    }

    public void setModel(BibliotecaModel model) {
        this.model = model;
    }

    public BibliotecaView getView() {
        return view;
    }

    public void setView(BibliotecaView view) {
        this.view = view;
    }

    
    
}

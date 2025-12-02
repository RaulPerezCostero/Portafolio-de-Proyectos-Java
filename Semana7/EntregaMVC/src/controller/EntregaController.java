package controller;

import model.EntregaModel;
import view.EntregaView;

public class EntregaController {
    EntregaModel model;
    EntregaView view;

    public EntregaController(EntregaModel model, EntregaView view){
        this.model = model;
        this.view = view;

        this.view.setController(this);
    }

    public void run(){
        this.view.showMenu();
    }

    public void nuevoAlmacen(){
        model.nuevoAlmacen();
    }

    public void cambiarRitmo(){
        model.cambiarRitmo();
    }

    public void añadirLibro(){
        model.añadirLibro();
    }

    public void mostrarLibros(){
        model.mostrarLibros();
    }

    public void modificarLibro(){
        model.modificarLibro();
    }

    public void eliminarLibro(){
        model.eliminarLibro();
    }
}

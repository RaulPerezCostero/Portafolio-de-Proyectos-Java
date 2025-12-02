package controller;

import java.nio.file.Path;
import java.util.ArrayList;

import model.Persona;
import model.PersonaModel;
import view.PersonaView;

public class PersonaController {
    
    PersonaModel model;
    PersonaView view;
    Persona persona;

    public PersonaController(PersonaModel model, PersonaView view ){
        this.model = model;
        this.view = view;

        this.view.setController(this);
    }

    public boolean cargarDatos(Path ruta, String delimitador){
        return model.cargarDatos(ruta, delimitador) != null;
    }

    public void run(){
        this.view.showMenu();
    }

    public ArrayList<Persona> mostrarTSV() {
        return model.mostrarTSV();
    }
}

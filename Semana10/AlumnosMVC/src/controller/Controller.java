package controller;

import model.Model;
import view.BaseView;

public class Controller {

    BaseView v;
    Model m;

    public Controller(BaseView v, Model m){
        this.v = v;
        this.m = m;
        this.v.setController(this);
    }

    public void initApp(){
        
        this.v.init();
        this.v.showMenuPrincipal()
    }

    public boolean agregarAlumno(Alumno alumno){
        return this.m.agregarAlumno(alumno);
    }

    public boolean importarAlumnos(){

        return this.m.importarAlumnos();
    }
}

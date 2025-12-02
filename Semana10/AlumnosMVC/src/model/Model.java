package model;

import java.util.ArrayList;
import java.util.List;

public class Model {

    //trata los estados de listado de alumnos
    private ArrayList<Alumno> alumnos;

    //persistencia al repositorio, gestiona la importacion/exportacion de las fuentes externas (TSV, CSV, Serial)
    private PersistenceRepository repository;

    public Model(PersistenceRepository repository){ //indicamos que repositorio debe usar
        this.repository = repository;
        this.alumnos = new ArrayList<>();
    }

    public boolean exportAlumnos() throws Exception { //Propaga la excepcion al controlador (con throws)
        return repository.exportAlumnos(alumnos);
    }

    public boolean importAlumnos() throws Exception {
        List<Alumno> alumnosImportados = repository.importAlumnos();

        if (alumnosImportados != null){
            for (Alumno alumnoImportado : alumnosImportados) {
                //Verificamos si ya existe el alumno
                if(!alumnos.contains(alumnoImportado)){
                    this.alumnos.add(alumnoImportado);
                }
            }
            return true;
        }else{
            return false;
        }
    }
}

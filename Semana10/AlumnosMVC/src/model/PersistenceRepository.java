package model;

import java.util.List;

public interface PersistenceRepository {

    public List<Alumno> importAlumnos() throws Exception;

    public boolean exportAlumnos(List<Alumno> listaAlumnos) throws Exception;

}




package model;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVRepository implements PersistenceRepository{

    Path ruta = Paths.get(System.getProperty("user.home"), "Desktop", "alumnos.csv");
    String delimitador = ";";

    @Override
    public List<Alumno> importAlumnos() throws Exception{
        ArrayList<Alumno> alumnos = new ArrayList<>();
        try{
            List<String> lineas = Files.readAllLines(ruta);
            for(String linea:lineas){
                Alumno a = Alumno.getAlumnoFromDelimitedString(linea, delimitador);
                if(a != null){
                    alumnos.add(a);
                }
            }
            return alumnos;
        }catch(Exception e){
            throw new Exception("ERROR en la importacion de alumnos", e);

        }
    }

    @Override
    public boolean exportAlumnos(List<Alumno> listaAlumnos) throws Exception {
        ArrayList<String> lineas = new ArrayList<>();

        for (Alumno alumno : listaAlumnos) {
            //getAlumnoAsString transforma una instancia de Alumno a una string delimitador
            lineas.add(alumno.getAlumnoAsString(delimitador));
        }
        try{
            Files.write(ruta, lineas, StandardCharsets.UTF_8);
            return true;
        }catch(Exception e){
            throw new Exception("Ocurrio un error al intentar exportar los alumnos", e);
        }
    
    }

}

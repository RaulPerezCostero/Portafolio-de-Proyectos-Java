package model;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JSONRepository implements PersistenceRepository {

    Path ruta = Paths.get(System.getProperty("user.home"), "OneDrive","Escritorio", "datos.json");
    File f = ruta.toFile();
    
    @Override
    public ArrayList<Alumno> importarAlumnos() {

        try{
            Gson gson = new Gson();
            String json = new String(Files.readAllBytes(f.toPath()),StandardCharsets.UTF_8);
            Type tipoDeLista = new TypeToken<ArrayList<Alumno>>() {}.getType();
            return gson.fromJson(json, tipoDeLista);
        }catch (IOException e){
            return null;
        }

    }

    @Override
    public boolean exportarAlumnos(ArrayList<Alumno> alumnos) {

        try{
            Gson gson = new Gson();
            String json = gson.toJson(alumnos);
            Files.write(f.toPath(), json.getBytes(StandardCharsets.UTF_8));
            return true;
        } catch(IOException e){
            return false;
        }
        
    }

}

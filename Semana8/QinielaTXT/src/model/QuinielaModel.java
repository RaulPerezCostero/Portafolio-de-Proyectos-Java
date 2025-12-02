package model;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class QuinielaModel {
    
    ArrayList<Partido> partidos;

    public QuinielaModel(){
        this.partidos = new ArrayList<>();
    }
    
    public int cargarPartidos(Path archivoPartidos) throws Exception{
        List<String> lineas = null;
        try{
            lineas = Files.readAllLines(archivoPartidos, StandardCharsets.UTF_8);
            for(String linea : lineas){
                String[] equipo = linea.split("-");
                Partido p = new Partido(equipo[0],equipo[1]);
                this.partidos.add(p);
            }
            return this.partidos.size();
        } catch(Exception e) {
            return -1;

        }
    }
    
    
    
    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    
}

package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class PersonaModel {
    
    ArrayList<Persona> pers = new ArrayList<>();

    public PersonaModel() {
    }

    public List<Persona> cargarDatos(Path ruta, String delimitador) {
        pers.clear();

        try {
            List<String> lineas = Files.readAllLines(ruta);

            for (String linea : lineas) {
                Persona f = Persona.LeerPersona(linea, delimitador);
                if (f != null) {
                    pers.add(f);
                }
            }
        } catch (IOException e) {
            return null;
        }

        return pers.isEmpty() ? null : pers;
    }

    public ArrayList<Persona> mostrarTSV() {
        return pers;
    }




}

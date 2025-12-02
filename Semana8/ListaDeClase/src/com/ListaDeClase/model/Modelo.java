package com.ListaDeClase.model;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import com.coti.tools.Rutas;

public class Modelo {

    ArrayList<DatosDeAlumno> alumnos = new ArrayList<>();

    public void crearListaAlumnos(){
        for(int i=1; i<=20; i++){
            alumnos.add(new DatosDeAlumno(new Direccion(),new DatosPersonales(i)));
        }
    }

    public ArrayList<DatosDeAlumno> mostrarListaAlumnos() {
        return alumnos;
    }

    public void exportarDatosPersonalesCSV() {
        Path ruta = Rutas.pathToFileOnDesktop("datosPersonales.csv");
        ArrayList<String> lineas = new ArrayList<>();
        String delimitador = ",";
        for (DatosDeAlumno datosDeAlumno : alumnos) {
            lineas.add(datosDeAlumno.getDatosPersonales().getInstanceAsDelimitedString(delimitador));
        }
        try {
            Files.write(ruta, lineas, StandardCharsets.UTF_8);
            System.out.println("\u001b[32mDatos exportados exitosamente a: \u001b[35m" + ruta.toFile().getAbsolutePath()+"\u001b[0m");
        } catch (IOException e) {
            System.err.println("\u001b[31mOcurrió un error al intentar exportar los datos: \u001b[0m" + e.getMessage());
        }
    }

    public void exportarDireccionesCSV() {
        Path ruta = Rutas.pathToFileOnDesktop("direcciones.csv");
        ArrayList<String> lineas = new ArrayList<>();
        String delimitador = ",";
        for (DatosDeAlumno datosDeAlumno : alumnos) {
            lineas.add(datosDeAlumno.getDireccion().getInstanceAsDelimitedString(delimitador));
        }
        try {
            Files.write(ruta, lineas, StandardCharsets.UTF_8);
            System.out.println("\u001b[32mDatos exportados exitosamente a: \u001b[0m" + ruta.toFile().getAbsolutePath());
        } catch (IOException e) {
            System.err.println("\u001b[31mOcurrió un error al intentar exportar los datos: \u001b[0m" + e.getMessage());
        }
    }

}

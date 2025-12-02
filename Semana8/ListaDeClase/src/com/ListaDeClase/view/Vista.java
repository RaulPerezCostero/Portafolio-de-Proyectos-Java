package com.ListaDeClase.view;

import java.util.ArrayList;

import com.ListaDeClase.controller.Controlador;
import com.ListaDeClase.model.DatosDeAlumno;
import com.coti.tools.Esdia;

public class Vista {
    Controlador c;

    public void setController(Controlador controlador){
        this.c=controlador;
    }

    public void mostrarMenu() {
        boolean salir = false;
    
        while (!salir) {
            System.out.println("|-----------------------------------------|");
            System.out.println("| 1- Volver a crear la lista de alumnos   |");
            System.out.println("| 2- Mostrar tabla de alumnos             |");
            System.out.println("| 3- Exportar datos personales a CSV      |");
            System.out.println("| 4- Exportar direcciones a CSV           |");
            System.out.println("| 5- Salir                                |");
            System.out.println("|-----------------------------------------|");
            int opc = Esdia.readInt("Introduce una opción (1-5): ");
    
            switch (opc) {
                case 1:
                    c.crearListaAlumnos();
                    break;
                case 2:
                    mostrarListaAlumnos();
                    break;
                case 3:
                    c.exportarDatosPersonalesCSV();
                    break;
                case 4:
                    c.exportarDireccionesCSV();
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("\u001b[31mEl numero debe estar entre 1 y 5\u001b[0m");
                    break;
            }
        }
    }

    public void mostrarListaAlumnos() {
        ArrayList<DatosDeAlumno> alumnos = c.mostrarListaAlumnos();
    
        System.out.println("Lista de alumnos: ");
        for (DatosDeAlumno datosDeAlumno : alumnos) {
            System.out.println(datosDeAlumno); // Llama automáticamente a toString()
        }
    }
}

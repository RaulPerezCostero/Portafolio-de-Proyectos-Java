package view;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.coti.tools.Esdia;
import com.coti.tools.Rutas;

import controller.PersonaController;
import model.Persona;

public class PersonaView {
    
    PersonaController controller;

    public void showMenu() {
        boolean salir = false;
        cargarDatos();

        while (!salir) {
            System.out.println("|-----------------------------|");
            System.out.println("| 1- Importar TSV             |");
            System.out.println("| 2- Mostrar los datos        |");
            System.out.println("| 3- Salir                    |");
            System.out.println("|-----------------------------|");
            int option = Esdia.readInt("Introduzca una opcion (1-3): ");
            
            switch (option) {
                case 1:
                    importarTSV();
                    break;
                case 2:
                    mostrarTSV();
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("\u001b[31mEl numero debe estar entre 1-3\u001b[0m");
                    break;
            }
        }
    }

    public void cargarDatos() {
        Path rutaDatos = Rutas.pathToFileOnDesktop("datos.txt");
        String delimitador = "\t";
    
        boolean cargadoCorrectamente = controller.cargarDatos(rutaDatos, delimitador);
    
        if (!cargadoCorrectamente) {
            System.out.println("\u001b[31mLos datos no se han podido cargar correctamente\u001b[0m");
        } else {
            System.out.println("\u001b[32mLos datos (datos.txt) se han cargado correctamente\u001b[0m");
        }
    }

    public void importarTSV() {
        String nomArchivo = Esdia.readString("Introduce el nombre del archivo a leer (debe estar en el escritorio datos.tsv): ");
        Path rutaDatos = Paths.get(System.getProperty("user.home"), "OneDrive", "Escritorio", nomArchivo);
        String delimitador = "\t";
        
        boolean cargadoCorrectamente = controller.cargarDatos(rutaDatos, delimitador);
        if (!cargadoCorrectamente) {
            System.out.println("\u001b[31mError al cargar el archivo\u001b[0m");
        } else {
            System.out.println("\u001b[32mArchivo cargado exitosamente\u001b[0m");
        }
    }

    public void mostrarTSV() {
        ArrayList<Persona> arrayPersonas = controller.mostrarTSV();
        
        if (arrayPersonas.isEmpty()) {
            System.out.println("\u001b[31mNo hay datos cargados para mostrar\u001b[0m");
            return;
        }

        System.out.println("\u001b[32m" + "-".repeat(44));
        for (Persona persona : arrayPersonas) {
            System.out.printf("\u001b[32m| %14s | %10s | %10.2f |\n", persona.getNombre(), persona.getTelefono(), persona.getPeso());
            System.out.println("-".repeat(44) + "\u001b[0m");
        }
    }

    public void setController(PersonaController personaController) {
        this.controller = personaController;
    }
}





package com.ExportarImprotarLibros.view;

import java.util.ArrayList;

import com.ExportarImprotarLibros.controller.Controlador;
import com.ExportarImprotarLibros.model.Libro;
import com.coti.tools.Esdia;

public class Vista {

    Controlador c;

    public void setController(Controlador controlador) {
        this.c = controlador;
    }

    public void mostrarMenu() {
        boolean salir = false;

        while (!salir) {
            
            System.out.println("|---------------------------------------|");
            System.out.println("| 1- Mostrar libros en formato tabla    |");
            System.out.println("| 2- Añadir nuevo libro al modelo\r     |");
            System.out.println("| 3- Eliminar libro                     |");
            System.out.println("| 4- Modificar libro                    |");
            System.out.println("| 5- Exportar libros a CSV              |");
            System.out.println("| 6- Exportar libros a formato JSON     |");
            System.out.println("| 7- Exportar libros a XML              |");
            System.out.println("| 8- Importar libros de un fichero JSON |");
            System.out.println("| 9- Importar libros de un fichero XML  |");
            System.out.println("| 10- Importar libros de un fichero CSV |");
            System.out.println("| 11- Salir del programa                |");
            System.out.println("|---------------------------------------|");
            int opc = Esdia.readInt("Introduce una opción (1-11): ");

            switch (opc) {
                case 1:
                    mostrarLibros();
                    break;
                case 2:
                    agregarNuevoLibro();
                    break;
                case 3:
                    eliminarLibro();
                    break;
                case 4:
                    if (modificarLibro()) {
                        System.out.println("Libro modificado con exito");
                    }else{
                        System.out.println("No se ha encontrado el libro a modificar");
                    }
                    break;
                case 5:
                    c.exportarLibrosCSV();
                    break;
                case 6:
                    if (c.exportarLibrosJSON()) {
                        System.out.println("Datos exportados correctamente");
                    }else{
                        System.out.println("Error al exportar los datos");
                    }
                    break;
                case 7:
                    if (c.exportarLibrosXML()) {
                        System.out.println("Datos exportados correctamente");
                    }else{
                        System.out.println("Error al exportar los datos");
                    }
                    break;
                case 8:
                    if (c.importarLibrosJSON()) {
                        System.out.println("Datos importados correctamente");
                    }else{
                        System.out.println("Error al importar los datos");
                    }
                    break;
                case 9:
                    if (c.importarLibrosXML()) {
                        System.out.println("Datos importados correctamente");
                    }else{
                        System.out.println("Error al importar los datos");
                    }
                    break;
                case 10:
                    c.importarLibrosCSV();
                    break;
                case 11:
                    salir=true;
                    System.out.println("Saliendo...");
                    break;
                default:
                    break;
            }
        }
    }

    public void showMessage(String string) {
        System.out.println(string);
    }

    public void showError(String string) {
        System.err.println(string);
    }

    public void mostrarLibros(){
        ArrayList<Libro> libros = c.mostrarLibros();

        for (Libro libro : libros) {
            System.out.println(libro.libroAsString());
        }
    }

    public void agregarNuevoLibro(){
        String ISBN = Esdia.readString("Introduce el ISBN del libro: ");
        String titulo = Esdia.readString("Introduce el titulo del libro: ");
        String autor = Esdia.readString("Introduce el nombre del autor del libro: ");
        int anio = Esdia.readInt("Introduce el año de publicación del libro: ");
        
        c.agregarNuevoLibro(new Libro(ISBN, titulo, autor, anio));
    }

    public void eliminarLibro(){
        String ISBN = Esdia.readString("Introduce el ISBN del libro: ");
        String titulo = Esdia.readString("Introduce el titulo del libro: ");
        String autor = Esdia.readString("Introduce el nombre del autor del libro: ");
        int anio = Esdia.readInt("Introduce el año de publicación del libro: ");

        c.eliminarLibro(new Libro(ISBN, titulo, autor, anio));
    }

    public boolean modificarLibro(){
        ArrayList<Libro> libros = c.mostrarLibros();

        for (Libro libro : libros) {
            System.out.println(libro.libroAsString());
        }

        String ISBN = Esdia.readString("Introduce el ISBN del libro a modificar: ");
        String titulo = Esdia.readString("Introduce el titulo del libro: ");
        String autor = Esdia.readString("Introduce el nombre del autor del libro: ");
        int anio = Esdia.readInt("Introduce el año de publicación del libro: ");
        Libro libroAModificar = new Libro(ISBN, titulo, autor, anio);

        for (Libro libro : libros) {
            if (libro.getISBN()==libroAModificar.getISBN()) {
                libro=libroAModificar;
                return true;
            }
        }

        return false;
        
    }

    

}

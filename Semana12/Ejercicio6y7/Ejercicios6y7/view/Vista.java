package view;

import java.util.ArrayList;

import com.coti.tools.Esdia;

import controller.Controlador;
import model.CustomException;
import model.Libro;

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
            System.out.println("| 2- Añadir nuevo libro al modelo       |");
            System.out.println("| 3- Eliminar libro                     |");
            System.out.println("| 4- Modificar libro                    |");
            System.out.println("| 5- Exportar libros a CSV              |");
            System.out.println("| 6- Exportar libros a formato JSON     |");
            System.out.println("| 7- Exportar libros a XML              |");
            System.out.println("| 8- Importar libros de un fichero JSON |");
            System.out.println("| 9- Importar libros de un fichero XML  |");
            System.out.println("| 10- Importar libros de un fichero CSV |");
            System.out.println("| 11- Ordenar por autor y año           |");
            System.out.println("| 12- Busqueda binaria                  |");
            System.out.println("| 13- Salir del programa                |");
            System.out.println("|---------------------------------------|");
            int opc = Esdia.readInt("Introduce una opción (1-13): ");

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
                    try {
                        c.exportarLibrosCSV();
                    } catch (CustomException e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    try {
                        if (c.exportarLibrosJSON()) {
                            System.out.println("Datos exportados correctamente");
                        }else{
                            System.out.println("Error al exportar los datos");
                        }
                    } catch (CustomException e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    try {
                        if (c.exportarLibrosXML()) {
                            System.out.println("Datos exportados correctamente");
                        }else{
                            System.out.println("Error al exportar los datos");
                        }
                    } catch (CustomException e) {
                        e.printStackTrace();
                    }
                    break;
                case 8:
                    try {
                        if (c.importarLibrosJSON()) {
                            System.out.println("Datos importados correctamente");
                        }else{
                            System.out.println("Error al importar los datos");
                        }
                    } catch (CustomException e) {
                        e.printStackTrace();
                    }
                    break;
                case 9:
                    try {
                        if (c.importarLibrosXML()) {
                            System.out.println("Datos importados correctamente");
                        }else{
                            System.out.println("Error al importar los datos");
                        }
                    } catch (CustomException e) {
                        e.printStackTrace();
                    }
                    break;
                case 10:
                    try {
                        c.importarLibrosCSV();
                    } catch (CustomException e) {
                        e.printStackTrace();
                    }
                    break;
                case 11:
                    c.ordenar();
                    break;
                case 12:
                    busquedaBinaria();
                    break;
                case 13:
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
            System.out.println(libro.toString());
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
            System.out.println(libro.toString());
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

    public Libro busquedaBinaria(){
        String titulo = Esdia.readString("Introduce el tituo del libro a buscar: ");
        return c.busquedaBinaria(titulo);
    }

    

}

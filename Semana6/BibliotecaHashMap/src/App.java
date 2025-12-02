import java.util.HashMap;
import java.util.Map;

import com.coti.tools.Esdia;

import model.Libro;

public class App {
    
    private static HashMap<String, Libro> libros = new HashMap<>();

    public static void main(String[] args) throws Exception {

        int caso;
        boolean valor = false;
        //Usamos un do while para repetir el proceso de eleccion del menu hasta que se pulse la opcion de salir.

        do {
            menu(); //Mostramos el menu.

            caso = Esdia.readInt("Seleccione una opción (1-5): "); //Accede al caso seleccionado por el usuario.

            switch (caso) {

                case 1:
                    añadirLibro(); //Llama al metodo.
                    break;

                case 2:
                    mostrarLibros(); //Llama al metodo.
                    break;

                case 3:
                    modificarLibro(); //Llama al metodo.
                    break;

                case 4:
                    eliminarLibro(); //Llama al metodo.
                    break;

                case 5:
                    valor = true; //Cuando se pulsa la opcion 5 el valor de "valor" pasa de false a true y se sale del bucle, actua como si fuera un interruptor.
                    break;

                default:
                    System.err.println("Introduzca un número entre el 1-5"); //Se ejecuta si no introducimos un numero entre 1 y 5.
                    break;
            }
        } while (!valor); //Se repite el bucle si "valor" es distinto de true.

    }


    public static void menu(){//Print menu (la "->" flecha sugiere que la primera opcion debe ser esa.)

        System.out.println("\u001b[0m|-------------------------------------------------------------|");
        System.out.println("| MIS LIBROS                                                  |");
        System.out.println("|-------------------------------------------------------------|");
        System.out.println("| -> 1)  Añadir un nuevo libro.                               |");
        System.out.println("|    2)  Mostrar libro.                                       |");
        System.out.println("|    3)  Modificar un libro.                                  |");
        System.out.println("|    4)  Eliminar un libro.                                   |");
        System.out.println("|    6)  Salir (se borrará toda la información).              |");
        System.out.println("|-------------------------------------------------------------|");

    }

    public static void añadirLibro(){

        String isbn = Esdia.readString("Introduzca el ISBN: ");
        String titulo = Esdia.readString("Introduzca el titulo del libro: ");
        String autor = Esdia.readString("Introduzca el autor: ");
        int año = Esdia.readInt("Introduzca el año de publicacion del libro: ");
        double precio = Esdia.readDouble("Introduzca el precio del libro: ");

        libros.put(isbn, new Libro(isbn, titulo, autor, año, precio));
    }

    public static void mostrarLibros(){
        if (libros.isEmpty()) {
            System.out.println("\u001b[31mNo hay libros en la biblioteca\u001b[0m");
            return;
        }

        System.out.println("\u001b[32mMIS LIBROS:");

        for (Map.Entry<String, Libro> entrada : libros.entrySet()) {
            String isbn = entrada.getKey();
            Libro valor = entrada.getValue();
            System.out.println(String.format("ISBN: %s - %s\u001b[0m",isbn ,valor.getToString()));
        }
    }

    public static void modificarLibro(){
        String isbn = Esdia.readString_ne("Ingrese el isbn del libro a modificar: ");

        if (libros.containsKey(isbn)) {

            String nuevoTitulo = Esdia.readString_ne("Introude el nuevo titulo: ");
            String nuevoAutor = Esdia.readString("Introude el nuevo autor: ");
            int nuevoAño = Esdia.readInt("Introude el nuevo año de publicacion: ");
            double nuevoPrecio = Esdia.readDouble("Introude el nuevo precio: ");


            Libro libroModificado = new Libro(isbn, nuevoTitulo, nuevoAutor, nuevoAño, nuevoPrecio);
            libros.put(isbn, libroModificado);

        } else {
            System.out.println("\u001b[31mLibro no encontrado.\u001b[0m");
        }
    }

    public static void eliminarLibro(){
        String isbn = Esdia.readString_ne("Ingrese el isbn del libro a eliminar: ");
        if (libros.containsKey(isbn)) {
            libros.remove(isbn);
            System.out.println("\u001b[32mLibro eliminado.\u001b[0m");
        } else {
            System.out.println("\u001b[31mLibro no encontrada.\u001b[0m");
        }

    }

}

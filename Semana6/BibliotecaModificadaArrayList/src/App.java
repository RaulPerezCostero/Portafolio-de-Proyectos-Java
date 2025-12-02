import com.coti.tools.Esdia;

import model.Almacen;
import model.Autor;
import model.Libro;

public class App {
    // Hacemos que n, vectAlmacenes, ritmo, i, y totalPrecio sean atributos de la clase App para poder usarlos en cualquier metodo de esta.
    private static Almacen almacen1;
    private static int ritmo = 1;
    private static int i = 0;
    private static double totalPrecio = 0;

    public static void main(String[] args) throws Exception {
        int caso;
        boolean valor = false;
        //Usamos un do while para repetir el proceso de eleccion del menu hasta que se pulse la opcion de salir.
        do {
            menu();

            caso = Esdia.readInt("Seleccione una opción (1-6): "); //Accede al caso seleccionado por el usuario.

            switch (caso) {
                case 1:
                    nuevoAlmacen(); //Llama al metodo.
                    break;
                
                case 2:
                    cambiarRitmo(); //Llama al metodo.
                    break;
                
                case 3:
                    añadirLibro(); //Llama al metodo.
                    break;

                case 4:
                    mostrarLibros(); //Llama al metodo.
                    break;
                case 5:
                    modificarLibro(); //Llama al metodo.
                    break;

                case 6:
                    eliminarLibro(); //Llama al metodo.
                    break;

                case 7:
                    valor = true; //Cuando se pulsa la opcion 5 el valor de "valor" pasa de false a true y se sale del bucle, actua como si fuera un interruptor.
                    break;

                default:
                    System.err.println("Introduzca un número entre el 1-6"); //Se ejecuta si no introducimos un numero entre 1 y 5.
                    break;
            }
        } while (!valor); //Se repite el bucle si "valor" es distinto de true.
    }

    ////////////////
    //Metodo Menu //
    ////////////////

    public static void menu(){ //Print menu (la "->" flecha sugiere que la primera opcion debe ser esa.)
        System.out.println("|-------------------------------------------------------------|");
        System.out.println("| MIS LIBROS                                                  |");
        System.out.println("|-------------------------------------------------------------|");
        System.out.println("| -> 1)  Nuevo almacén de libros.                             |");
        System.out.println("|    2)  Establecer ritmo de lectura (páginas por minuto).    |");
        System.out.println("|    3)  Añadir un nuevo libro al amacén.                     |");
        System.out.println("|    4)  Mostrar información actual de libros.                |");
        System.out.println("|    5)  Modificar un libro.                                  |");
        System.out.println("|    6)  Eliminar un libro.                                   |");
        System.out.println("|    7)  Salir (se borrará toda la información).              |");
        System.out.println("|-------------------------------------------------------------|");
    }

    ////////////////
    //Metodo caso1//
    ////////////////

    public static void nuevoAlmacen() {

        almacen1 = new Almacen(); //Inicializamos vectAlmacenes creando un vector de la clase Almacen con n espacios.
        System.out.println("\u001b[32mSe ha creado un almacén.\u001b[0m");
    }

    ////////////////
    //Metodo caso2//
    ////////////////

    public static void cambiarRitmo(){//Inicializamos ritmo.

        ritmo = Esdia.readInt("Introduzca el ritmo de lectura: ");
    }

    ////////////////
    //Metodo caso3//
    ////////////////

    public static void añadirLibro() {

        if (almacen1 == null) {
            System.out.println("\u001b[31mEl almacén no esta creado.\u001b[0m");
        
        }else if (i == almacen1.getTamañoAlmacen()) {//Aviso de que el almacén esta lleno.

            System.out.println("\u001b[31mElige otra opción, el almacén está lleno.\u001b[0m");

        } else {//Sino esta lleno pide los datos al usuario para llenarlo.

            String nombreAutor = Esdia.readString("Introduce el nombre del autor: ");
            String apellidosAutor = Esdia.readString("Introduce los apellidos del autor: ");
            boolean premio = Esdia.yesOrNo("¿Tiene premio Planeta? ");
            Autor datosAutor = new Autor(nombreAutor, apellidosAutor, premio); //Resumimos la informacion obtenida.

            String titulo = Esdia.readString("Introduce el título del libro: ");
            int añoDePublicacion = Esdia.readInt("Introduce el año de publicación del libro: ");
            int numeroPaginas = Esdia.readInt("Introduce el número de páginas del libro: ");
            double precio = Esdia.readDouble("Introduce el precio del libro: ");
            Libro datosLibro = new Libro(datosAutor, titulo, añoDePublicacion, numeroPaginas, precio); //Resumimos la informacion obtenida.

            almacen1.addLibro(datosLibro); //Añadimos los datos del libro al almacen

            System.out.println("\u001b[32mSe ha introducido al almacén el libro: '" + titulo + "' del escritor " + nombreAutor + " " + apellidosAutor + " a " + precio + "$\u001b[0m");
            i++; //Suma uno al contador (contador = numero de libros introducidos hasta hora)
        }
    }

    ////////////////
    //Metodo caso4//
    ////////////////

    public static void mostrarLibros() {//Si el vector de almacenes esta vacio o su longitud es cero o su posicion 0 esta vacía entonces se imprime que esta vacio.

        if (almacen1 == null) {
            System.out.println("\u001b[31mEl almacén no esta creado.\u001b[0m");
        
        }else if(i==0){
            System.out.println("\u001b[31mEl almacén esta vacio.\u001b[0m");
        
        }else{ //Creamos otro "interruptor", como el explicado anteriormente.

            boolean librosMostrados = false; //Este lo utilizaremos para imprimir la cabecera de la tabla tan solo una vez y los libros debajo.
    
            for (Libro libro : almacen1.getLibros()) {//Buscamos los datos en el vectAlmacenes.

                if (libro != null) {

                    if (!librosMostrados) {//Si libros no esta lleno y el "interruptor" esta en false entrara en el bucle
                        //Mostramos el encabezado de la tabla.

                        System.out.println();
                        System.out.println("\u001b[32m|"+ "-".repeat(159) + "|");
                        System.out.println("| LIBROS EN EL ALMACÉN" + " ".repeat(138) + "|");
                        System.out.println("|" + "-".repeat(159) + "|");
                        System.out.printf("| %-40s | %-10s | %-30s | %-10s  | %-10s  | %-10s  | %-10s  |\n", "Título", "Año Publicación", "Autor", "Premio Planeta", "Páginas", "Ritmo de lectura", "Precio");
                        System.out.println("|" + "-".repeat(159) + "|");

                        librosMostrados = true; // Al estar en true nos aseguramos de imprimirlo una sola vez.
                    }
    
                    // Imprimimos los datos del libro y el autor en una fila de la tabla
                    System.out.printf("| %-40s | %-15d |  %-29s | %-15s | %-11d | %-17d | $%-9.2f  |\n", libro.getTitulo(), libro.getAñoDePublicacion() ,libro.getAutor().getNombre() + " " + libro.getAutor().getApellidos(), libro.getAutor().getPremioPlaneta() ,libro.getNumeroDePaginas(), ritmo, libro.getPrecio());
                    totalPrecio = totalPrecio + libro.getPrecio();
                }
            }
    
            if (!librosMostrados) {//Si el "interruptor" esta en true entonces entre en el if, significa que solo entra una vez se haya ejecutado la cabecera.

                System.out.println("No hay libros en el almacén.");

            } else {

                System.out.println("|" + "-".repeat(159) + "|");
                //Calcula el ritmo total multiplicando el ritmo introducido por el numero de libros.
                System.out.printf("| Tiempo de lectura total del almacen: %88s %d min %13s             |\n", "|" ,ritmo*i,"|");
                //Calcula el precio total sumandose asi mismo cada vez que el for de la linea 135 hace una iteracion.
                System.out.printf("| Valor total del almacén: %120s $%.2f     |\n","|" ,totalPrecio);
                System.out.println("|" + "-".repeat(159) + "|\u001b[0m");
                System.out.println();
            }
        }
    }
    
    ////////////////
    //Metodo caso5//
    ////////////////

    public static void eliminarLibro() {
        if (almacen1 == null || i == 0) {
            System.out.println("\u001b[31mEl almacén no esta creado o no hay libros.\u001b[0m"); //Para que de error si no se ha creado antes

        }else{

            int posicion = Esdia.readInt("Introduce el número del libro que deseas eliminar: ");
        
            if (posicion-1 >= 0 && posicion-1 <= i) { //Verifica que la posicion es válido.
                almacen1.removeLibro(posicion-1);
                System.out.println("\u001b[32mEl libro ha sido eliminado\u001b[0m");
                i--;
            } else {
                System.out.println("\u001b[31mPosicion no válida. No se ha eliminado ningún libro.\u001b[0m");
            }
        }
    }
    

    ////////////////
    //Metodo caso6//
    ////////////////

    public static void modificarLibro(){ //Nos ayudamos del codigo creado para los metodos creados anteriormente para crear este.
        if (almacen1 == null || i == 0) {
            System.out.println("\u001b[31mEl almacén no esta creado o no hay libros.\u001b[0m"); //Para que de error si no se ha creado antes

        }else{
            int posicion = Esdia.readInt("Introduce el número del libro que deseas modificar: ");
        
            if (posicion-1 >= 0 && posicion-1 <= i) { //Verifica que la posicion es válido.
                
                String nuevoNombre = Esdia.readString("Introduce el nombre del autor: ");
                String nuevoApellidos = Esdia.readString("Introduce los apellidos del autor: ");
                boolean nuevoPremio = Esdia.yesOrNo("¿Tiene premio Planeta? ");
                Autor nuevoDatosAutor = new Autor(nuevoNombre, nuevoApellidos, nuevoPremio); //Resumimos la informacion obtenida en un vector.
    
                String nuevoTitulo = Esdia.readString("Introduce el título del libro: ");
                int nuevoAñoDePublicacion = Esdia.readInt("Introduce el año de publicación del libro: ");
                int nuevoNumeroPaginas = Esdia.readInt("Introduce el número de páginas del libro: ");
                double nuevoPrecio = Esdia.readDouble("Introduce el precio del libro: ");
                Libro nuevoDatosLibro = new Libro(nuevoDatosAutor, nuevoTitulo, nuevoAñoDePublicacion, nuevoNumeroPaginas, nuevoPrecio);
    
                almacen1.modificarLibro(posicion-1, nuevoDatosLibro);
    
                System.out.println("\u001b[32mEl libro ha sido modificado\u001b[0m");
    
            } else {
                System.out.println("\u001b[31mPosicion no válida. No se ha eliminado ningún libro.\u001b[0m");
            }
        }
    }

}




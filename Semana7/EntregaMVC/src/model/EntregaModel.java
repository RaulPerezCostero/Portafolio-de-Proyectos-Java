package model;

import com.coti.tools.Esdia;

public class EntregaModel {
    
    private AutorModel autor;
    private String titulo;
    private int añoDePublicacion;
    private int numeroDePaginas;
    private double precio;

    private String nombreAutor;
    private String apellidosAutor;
    private boolean premio;

    private static AlmacenModel almacen1;
    private static int ritmo = 1;
    private static int i = 0;
    private static double totalPrecio = 0;

    //Constructor vacio

    public EntregaModel() {
        
    }

    //Metodos CRUD

    public void nuevoAlmacen() {

        almacen1 = new AlmacenModel(); //Inicializamos vectAlmacenes creando un vector de la clase Almacen con n espacios.
        System.out.println("\u001b[32mSe ha creado un almacén.\u001b[0m");
    }

    public void añadirLibro(){
        if (almacen1 == null) {
            System.out.println("\u001b[31mEl almacén no esta creado.\u001b[0m");
        
        }else if (i == almacen1.getTamañoAlmacen()) {//Aviso de que el almacén esta lleno.

            System.out.println("\u001b[31mElige otra opción, el almacén está lleno.\u001b[0m");

        } else {//Sino esta lleno pide los datos al usuario para llenarlo.

            EntregaModel datosLibro = new EntregaModel();

            datosLibro.titulo = Esdia.readString("Introduce el título del libro: ");
            datosLibro.añoDePublicacion = Esdia.readInt("Introduce el año de publicación del libro: ");
            datosLibro.numeroDePaginas = Esdia.readInt("Introduce el número de páginas del libro: ");
            datosLibro.precio = Esdia.readDouble("Introduce el precio del libro: ");
            datosLibro.premio = Esdia.yesOrNo("¿Tiene premio Planeta? ");
            
            AutorModel autor = new AutorModel();
            autor.setNombre(Esdia.readString("Introduce el nombre del autor: "));
            autor.setApellidos(Esdia.readString("Introduce los apellidos del autor: "));
            datosLibro.setAutor(autor);  // Asigna el autor al libro

            almacen1.addLibro(datosLibro); //Añadimos los datos del libro al almacen

            System.out.println("\u001b[32mSe ha introducido al almacén el libro: '" + datosLibro.titulo + "' del escritor " + autor.getNombre() + " " + autor.getApellidos() + " a " + datosLibro.precio + "$\u001b[0m");
            i++; //Suma uno al contador (contador = numero de libros introducidos hasta hora)
        }
    }

    public void cambiarRitmo(){//Inicializamos ritmo.

        ritmo = Esdia.readInt("Introduzca el ritmo de lectura: ");
    }

    public void mostrarLibros(){
        if (almacen1 == null) {
            System.out.println("\u001b[31mEl almacén no esta creado.\u001b[0m");
        
        }else if(i==0){
            System.out.println("\u001b[31mEl almacén esta vacio.\u001b[0m");
        
        }else{ //Creamos otro "interruptor", como el explicado anteriormente.

            boolean librosMostrados = false; //Este lo utilizaremos para imprimir la cabecera de la tabla tan solo una vez y los libros debajo.
    
            for (EntregaModel libro : almacen1.getLibros()) {//Buscamos los datos en el vectAlmacenes.

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

    public void eliminarLibro(){
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

    public void modificarLibro(){
        if (almacen1 == null || i == 0) {
            System.out.println("\u001b[31mEl almacén no esta creado o no hay libros.\u001b[0m"); //Para que de error si no se ha creado antes

        }else{
            int posicion = Esdia.readInt("Introduce el número del libro que deseas modificar: ");
        
            if (posicion-1 >= 0 && posicion-1 <= i) { //Verifica que la posicion es válido.
                
                
                
                AutorModel nuevoAutor = new AutorModel();

                nuevoAutor.setNombre(Esdia.readString("Introduce el nombre del autor: "));
                nuevoAutor.setApellidos(Esdia.readString("Introduce los apellidos del autor: "));
                nuevoAutor.setPremioPlaneta(Esdia.yesOrNo("¿Tiene premio Planeta? "));
                
                EntregaModel nuevoDatosLibro = new EntregaModel();
                nuevoDatosLibro.titulo = Esdia.readString("Introduce el título del libro: ");
                nuevoDatosLibro.añoDePublicacion = Esdia.readInt("Introduce el año de publicación del libro: ");
                nuevoDatosLibro.añoDePublicacion = Esdia.readInt("Introduce el número de páginas del libro: ");
                nuevoDatosLibro.precio = Esdia.readDouble("Introduce el precio del libro: ");
                nuevoDatosLibro.setAutor(nuevoAutor);
                
    
                almacen1.modificarLibro(posicion-1, nuevoDatosLibro);
    
                System.out.println("\u001b[32mEl libro ha sido modificado\u001b[0m");
    
            } else {
                System.out.println("\u001b[31mPosicion no válida. No se ha eliminado ningún libro.\u001b[0m");
            }
        }
    }


    //Setters y getters

    public void setAutor(AutorModel autor) {
        this.autor = autor;
    }

    public AutorModel getAutor() {
        return autor;
    }

    public void setAñoDePublicacion(int añoDePublicacion) {
        this.añoDePublicacion = añoDePublicacion;
    }

    public int getAñoDePublicacion() {
        return añoDePublicacion;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getPrecio() {
        return precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return titulo;
    }

}

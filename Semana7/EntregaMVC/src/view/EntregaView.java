package view;

import com.coti.tools.Esdia;

import controller.EntregaController;

public class EntregaView {
    EntregaController controller;

    public void showMenu(){
        boolean salir = false;
        while(!salir){

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
            int option = Esdia.readInt("Seleccione una opción (1-7): ");

            switch (option) {

                case 1:
                    controller.nuevoAlmacen(); //Llama al metodo.
                    break;
                
                case 2:
                    controller.cambiarRitmo(); //Llama al metodo.
                    break;
                
                case 3:
                    controller.añadirLibro(); //Llama al metodo.
                    break;

                case 4:
                    controller.mostrarLibros(); //Llama al metodo.
                    break;
                case 5:
                    controller.modificarLibro(); //Llama al metodo.
                    break;

                case 6:
                    controller.eliminarLibro(); //Llama al metodo.
                    break;

                case 7:
                    salir = true; //Cuando se pulsa la opcion 5 el valor de "valor" pasa de false a true y se sale del bucle, actua como si fuera un interruptor.
                    break;

                default:
                    System.err.println("Introduzca un número entre el 1-7"); //Se ejecuta si no introducimos un numero entre 1 y 5.
                    break;
            }
        }
    }

    public void setController(EntregaController entregaController){
        this.controller = entregaController;
    }

}

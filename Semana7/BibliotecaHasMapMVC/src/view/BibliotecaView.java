package view;

import com.coti.tools.Esdia;

import controller.BibliotecaController;

public class BibliotecaView {
    BibliotecaController controller;

    public void showMenu(){
        boolean salir = false;
        while(!salir){

            System.out.println("|------------------------|");
            System.out.println("| 1- Agregar libro       |");
            System.out.println("| 2- Eliminar libro      |");
            System.out.println("| 3- Modificar libro     |");
            System.out.println("| 4- Listar libro        |");
            System.out.println("| 5- Salir               |");
            System.out.println("|------------------------|");
            int option = Esdia.readInt("Introduzca una opcion (1-5): ");

            switch (option) {
                case 1:
                    añadirLibro();
                    break;
                case 2:
                    eliminarLibro();
                    break;
                case 3:
                    modificarLibro();
                    break;
                case 4:
                    mostrarLibro();
                    break;
                case 5:
                    salir=true;
                    break;
                default:
                    System.out.println("\u001b[31mEl numero debe estar entre 1-5\u001b[0m");
                    break;
            }
        }
    }
        


    public void añadirLibro(){
        controller.añadirLibro();
    }

    public void eliminarLibro(){
        controller.eliminarLibro();
    }

    public void modificarLibro(){
        controller.modificarLibro();
    }

    public void mostrarLibro(){
        controller.mostrarLibro();
    }

    public void setController(BibliotecaController bibliotecaController){
        this.controller = bibliotecaController;
    }

}
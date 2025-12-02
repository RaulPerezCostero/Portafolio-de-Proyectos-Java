package view;

import com.coti.tools.Esdia;

import controller.ConcesionarioController;

public class ConcesionarioView {
    ConcesionarioController controller;
    
    public void showMenu(){
        boolean salir = false;
        while(!salir){

            System.out.println("|------------------------|");
            System.out.println("| 1- Agregar coche       |");
            System.out.println("| 2- Eliminar coche      |");
            System.out.println("| 3- Modificar coche     |");
            System.out.println("| 4- Listar coche        |");
            System.out.println("| 5- Salir               |");
            System.out.println("|------------------------|");
            int option = Esdia.readInt("Introduzca una opcion (1-5): ");

            switch (option) {
                case 1:
                    agregarCoche();
                    break;
                case 2:
                    eliminarCoche();
                    break;
                case 3:
                    modificarCoche();
                    break;
                case 4:
                    listarCoche();
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

    public void agregarCoche(){
        controller.agregarCoche();
    }

    public void eliminarCoche(){
        controller.eliminarCoche();
    }

    public void modificarCoche(){
        controller.modificarCoche();
    }

    public void listarCoche(){
        controller.listarCoche();
    }

    public void setController(ConcesionarioController concesionarioController){
        this.controller = concesionarioController;
    }


}


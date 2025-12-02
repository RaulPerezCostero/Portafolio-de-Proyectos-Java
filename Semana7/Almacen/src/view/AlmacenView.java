package view;

import com.coti.tools.Esdia;

import controller.AlmacenController;

public class AlmacenView {
    AlmacenController controller;

    public void showMenu(){
        boolean salir = false;
        while(!salir){

            System.out.println("|-------------------------------|");
            System.out.println("| 1- Leer tabla de ventas       |");
            System.out.println("| 2- Leer tabla de precios      |");
            System.out.println("| 3- Calcular ingresos totales  |");
            System.out.println("| 4- Mostrar resultados         |");
            System.out.println("| 5- Salir                      |");
            System.out.println("|-------------------------------|");
            int option = Esdia.readInt("Introduzca una opcion (1-5): ");

            switch (option) {
                case 1:
                    leerVentas();
                    break;
                case 2:
                    leerPrecios();
                    break;
                case 3:
                    calcularIngresos();
                    break;
                case 4:
                    mostrarResultados();
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

    public void leerVentas(){
        controller.leerVentas();
    }

    public void leerPrecios(){
        controller.leerPrecios();
    }

    public void calcularIngresos(){
        controller.calcularIngresos();
    }

    public void mostrarResultados(){
        if(controller.getIngresos() == -1){
            System.out.println("\u001b[31mSeleccione primero las opciones 1 y 2\u001b[0m");
        }else{
            System.out.println("\u001b[32mLos ingresos totales son: " + controller.getIngresos() + "$ \u001b[0m");
        }
        

        
    }

    public void setController(AlmacenController almacenController){
        this.controller = almacenController;
    }

}

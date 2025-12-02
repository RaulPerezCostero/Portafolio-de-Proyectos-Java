package view;

import com.coti.tools.Esdia;

import controller.CalculadoraController;

public class CalculadoraView {
    
    CalculadoraController controller;

    public void showMenu(){
        boolean salir = false;
        while(!salir){
            
            System.out.println("|-----------------------|");
            System.out.println("| 1- Leer los numeros   |");
            System.out.println("| 2- Calcular la suma   |");
            System.out.println("| 3- Mostrar resultado  |");
            System.out.println("| 4- Salir              |");
            System.out.println("|-----------------------|");
            int option = Esdia.readInt("Introduzca una opcion: ");

            switch (option) {
                case 1:
                    leerNumeros();
                    break;
                case 2:
                    calcularSuma();
                    break;
                case 3:
                    mostrarResultado();
                    break;
            
                default:
                    break;
            }
        
        }

    }

    public void mostrarResultado(){
        System.out.println("\u001b[32mNumero 1: "+ controller.getPrimerNunmero());
        System.out.println("Numero 2: "+ controller.getSegundoNunmero());
        System.out.println("Resultado: "+ controller.getResultado()+"\u001b[0m");
    }

    public void calcularSuma(){
        controller.calcularSuma();
    }

    public void leerNumeros(){
        int primerNumero = Esdia.readInt("Introduzca el primer numero: ");
        int segundoNumero = Esdia.readInt("Introduzca el segundo numero: ");
        controller.guardarNumeros(primerNumero, segundoNumero);
    }

    public void setController(CalculadoraController calculadoraController){
        this.controller = calculadoraController;
    }

}

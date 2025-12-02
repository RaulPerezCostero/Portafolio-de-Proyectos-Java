import com.coti.tools.Esdia;

import model.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        
        String nombre = Esdia.readString("Introduzca su nombre: ");
        float peso = Esdia.readFloat("Introduzca su peso (Kg): ");
        float alturaCm = Esdia.readFloat("Introduzca su altura (cm): ");
        float altura = alturaCm / 100;

        Usuario persona = new Usuario(nombre, peso, altura);
        float IMC = persona.IMC();

        System.out.println();
        System.out.printf("La tabla para %s es: \n", nombre);
        System.out.println();
        System.out.printf("\u001b[32m---------------\n");
        System.out.printf("| %.2f Kg    |\n", peso);
        System.out.printf("---------------\n");
        System.out.printf("| %.2f cm   |\n", alturaCm);
        System.out.printf("---------------\n");
        System.out.printf("| IMC: %.2f  |\n", IMC);
        System.out.println("---------------\u001b[0m");
    }
}

import java.util.Arrays; //Implementa el método sort que usamos más adelante. 
import java.util.Scanner;

public class Orden {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba un numero entero: ");
        int num1 = sc.nextInt();
        System.out.print("Escriba un numero entero: ");
        int num2 = sc.nextInt();
        System.out.print("Escriba un numero entero: ");
        int num3 = sc.nextInt();

        int[] vect = new int[3];
        vect[0] = num1;
        vect[1] = num2;
        vect[2] = num3;

        Arrays.sort(vect); //Permite ordenar de menor a mayor.

        System.out.println();
        System.out.printf("\u001b[32mEl mayor de los tres es el %d. \u001b[0m", vect[2]); //Imprime el mayor número, es decir la ultima posición del vector.
        sc.close();
    }
}

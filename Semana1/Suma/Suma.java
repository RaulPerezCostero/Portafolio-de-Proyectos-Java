import java.util.Scanner;

public class Suma {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      System.out.print("Introduce un numero entero: ");
      int num1 = sc.nextInt();
      System.out.print("Introduce un numero entero: ");
      int num2 = sc.nextInt();
      System.out.printf("\u001b[32mLa suma de los dos numeros es %d.\u001b[0m", num1 + num2);
      sc.close();

    }
}





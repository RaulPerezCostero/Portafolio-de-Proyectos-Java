import java.util.Scanner;
public class Problema {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Introduzca su edad: ");
        int edad = sc.nextInt();
        
        String no = sc.nextLine(); //Con esto evitamos que el nextLine() de "nombre" utilice el \n como String y lo utilice este que creamos de forma innecesaria.

        System.out.printf("Introduzca su nombre: ");
        String nombre = sc.nextLine(); // Otra solución sería simplemente invertir el orden, poniendo primero el nexLine() y luego el nextInt().
        
        System.out.printf("\u001b[32mSu nombre es %s y tiene %d años.\u001b[0m", nombre, edad);
        sc.close();
    }
}

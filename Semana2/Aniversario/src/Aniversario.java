import java.time.LocalDate;
import java.util.Scanner;
public class Aniversario{
    public static void main(String[] args) {
        int nac = 0, actual = 0;
        Scanner sc = new Scanner(System.in); //Constructor.
        
        System.out.printf("Escribe tu año de nacimiento: ");
        nac = sc.nextInt();
        
        actual = LocalDate.now().getYear();
        System.out.printf("\u001b[32mSu edad es de %d años.\u001b[0m",(actual-nac)); 
        //Printf permite agregar mas argumentos aparte de las comillas, y println permite cambiar de linea al mostrarlo por pantalla.
        
        sc.close();
    }
}
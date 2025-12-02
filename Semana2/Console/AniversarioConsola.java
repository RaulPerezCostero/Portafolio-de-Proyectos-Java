import java.io.Console;
import java.time.LocalDate;

public class AniversarioConsola {
   public static void main(String[] var0) throws Exception {
      Console cs = System.console();
      
      int actual = LocalDate.now().getYear();
      System.out.printf("Estamos en el año %d\n", actual);
      
      String nac = cs.readLine("Escriba el año de nacmiento: ");
      int edad = actual - Integer.parseInt(nac);

      System.out.println();
      System.out.printf("\u001b[32mSu edad es %d años.\u001b[0m", edad);
   }
}


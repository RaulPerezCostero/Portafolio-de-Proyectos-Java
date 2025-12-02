import com.coti.tools.Esdia;
public class App {
    public static void main(String[] args) throws Exception {
        double num1 = Esdia.readDouble("Introduce un numero: ");
        double num2 = Esdia.readDouble("Introduce otro numero: ");
        double suma = num1 + num2;
        System.out.printf("La suma es: %.4f", suma);
    }
}

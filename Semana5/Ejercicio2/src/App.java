import java.util.Arrays;

import com.coti.tools.Esdia;

public class App {
    public static void main(String[] args) throws Exception {
        String[] array = new String[5];

        for(int i = 0; i < array.length;i++){
            String entrada = Esdia.readString("Introduce una palabra: ");
            array[i]  = entrada;
            
        }

        Arrays.sort(array);

        System.out.println();
        System.out.printf("\u001b[32mArray ordenado de menor a mayor: \u001b[0m");

        for (String string : array) {
            System.out.printf("|\u001b[35m %s \u001b[0m", string);
        }

        System.out.printf("|");

    }
}

import com.coti.tools.Esdia;

public class Ejercicio5 {
    
    public static int leerInt(){
        int numero = 0;
        boolean valido = false;
        
        while(!valido){
            String entrada = Esdia.readString("Introduce un número entero: "); // Lee como String
            try {
                numero = Integer.parseInt(entrada); // Convierte el String a int
                valido = true;  // Si la conversión es exitosa, salimos del bucle
            } catch (NumberFormatException e) {
                System.out.println("\u001b[31mError: No es un número entero válido.\u001b[0m");
            }
        }

        return numero;
        }
        
    public static float leerFloat(){
        float numerof = 0;
        boolean valido = false;
            
        while(!valido){
            String entrada = Esdia.readString("Introduce un número flotante: "); // Lee como String
            try {
                numerof = Float.parseFloat(entrada); // Convierte el String a int
                if (entrada.contains(".")) {
                    valido = true;  // Si la conversión es exitosa y tiene punto decimal, salimos del bucle
                } else {
                    System.out.println("\u001b[31mError: Debe introducir un número flotante (con punto decimal).\u001b[0m");
                }
            } catch (NumberFormatException e) {
                System.out.println("\u001b[31mError: No es un número flotante válido.\u001b[0m");
            }
        }

        return numerof;
        }
        boolean valido = false;
    public static double leerDouble(){
        double numerod = 0.0;
        boolean valido = false;
        
        while(!valido){
            String entrada = Esdia.readString("Introduce un número doble: "); // Lee como String
            try {
                numerod = Double.parseDouble(entrada); // Convierte el String a int
                if (entrada.contains(".")) {
                    valido = true;  // Sale del bucle.
                } else {
                    System.out.println("\u001b[31m Error: Debe introducir un número flotante (con punto decimal).\u001b[0m");
                }
            } catch (NumberFormatException e) {
                System.out.println("\u001b[31m Error: No es un número doble válido.\u001b[0m");
            }
        }

        return numerod;
        }


    public static void main(String[] args) {
        int numInt = leerInt();
        System.out.printf("\u001b[32mSe ha convertido %d a tipo entero y para demostrarlo le podemos sumar uno de forma numerica: %d \u001b[0m \n", numInt, numInt+1);
        
        float numFloat = leerFloat();
        System.out.printf("\u001b[32mSe ha convertido %f a tipo flotante y para demostrarlo le podemos sumar 1.9876 de forma numerica: %f \u001b[0m \n", numFloat, numFloat+1.9876);
        
        double numDouble = leerDouble();
        System.out.printf("\u001b[32mSe ha convertido %e a tipo entero y para demostrarlo le podemos sumar 1.987654321 de forma numerica: %e \u001b[0m", numDouble, numDouble+1.987654321);
    }
}





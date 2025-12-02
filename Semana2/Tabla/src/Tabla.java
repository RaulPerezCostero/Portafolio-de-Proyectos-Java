import com.coti.tools.Esdia;
public class Tabla {
    public static void main(String[] args) throws Exception {
        
        String nombre = Esdia.readString("Introduzca su nombre: ");

        String apellidos = Esdia.readString("Introduce los apellidos: ");

        System.out.println("");

        System.out.println("\u001b[32m****************************************");
        System.out.println("* Nombre                   * Apellidos *");
        System.out.println("****************************************");
        System.out.printf("* %-15s%21s * \n",nombre, apellidos); //Separa de forma uniforme el nombre y los apellidos.
        System.out.println("****************************************\u001b[0m");
    }
}
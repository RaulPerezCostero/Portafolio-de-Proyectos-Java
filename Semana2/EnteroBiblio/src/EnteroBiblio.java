import com.coti.tools.Esdia;

public class EnteroBiblio {
    public static void main(){
        int n = 1;
        int i = 1;
        float numT = 0;
        
        do{
            if(n<=0){
            System.err.println("\u001b[31m***************************************************");
            System.err.println("*Error, introduzca un numero entero mayor que cero*");
            System.err.println("***************************************************\u001b[0m");
        }
            n = Esdia.readInt("Escribe un número entero: ");
            System.out.println();
        }while(n<=0);
        while(i<=n){
            float num1 = Esdia.readFloat("Escribe un número cualquiera: ");
            i++;
            numT = numT + num1;
        }
        System.out.println();
        System.out.printf("\u001b[32mEl resultado es %f.\u001b[0m", numT/n);
    }
}

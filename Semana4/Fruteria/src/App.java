package Fruteria.src;
import com.coti.tools.Esdia;

import Fruteria.src.model.Fruta;

public class App {
    public static void main(String[] args) throws Exception {
        
        float precioManzanas = Esdia.readFloat("¿Cual es el precio de las manzanas hoy? ");
        float precioPeras = Esdia.readFloat("¿Cual es el precio de las peras hoy? ");
        int i = 1;
        boolean j = true;

        while (j==true) {
            boolean cliente = Esdia.yesOrNo("¿Nuevo cliente");
            j=cliente;

            if (j==false){
                break;
            }

            int cuantasM = Esdia.readInt("¿Cuantas manzanas ha comprado el cliente "+ i +"? ");
            int cuantasP = Esdia.readInt("¿Cuantas peras ha comprado el cliente "+ i +"? ");

            Fruta[] frutas = new Fruta[2];
            

            frutas[0] = new Fruta("Manzana", cuantasM, precioManzanas);
            frutas[1] = new Fruta("Peras", cuantasP, precioPeras);
    
            float totalM = frutas[0].PrecioConIva()*cuantasM;
            float totalP = frutas[1].PrecioConIva()*cuantasP;
            float totalCliente = totalM + totalP;
            
            System.err.println("\u001b[32m-------------------------------------------------------");
            System.out.printf("| Cliente %d %43s \n",i,"|");
            System.err.println("-------------------------------------------------------");
            System.out.printf("| Manzanas %3d Kg | precio Kg con IVA %-5.2f | %-6.2f$ |\n", cuantasM, frutas[0].PrecioConIva(), totalM);
            System.out.printf("| Peras    %3d Kg | precio Kg con IVA %-5.2f | %-6.2f$ |\n", cuantasP, frutas[1].PrecioConIva(), totalP);
            System.err.println("-------------------------------------------------------");
            System.err.printf("| Total con IVA:%8.2f $ %28s\n", totalCliente,"|");
            System.err.println("-------------------------------------------------------\u001b[0m");

            i++;
        }
    }
}


import com.coti.tools.Esdia;

import model.Partido;

public class App {
    public static void main(String[] args) throws Exception {
        int i;
        int j=0;

        Partido[] vectPartidos = new Partido[15];
        for(i=1; i<=15; i++){
            System.out.printf("Partido %d \n" , i);
            String local = Esdia.readString("Introduce nombre del equipo local: ");
            int tamañoLocal = local.length();
            if(tamañoLocal>j){
                j=tamañoLocal;
            }
            String visitante = Esdia.readString("Introduce nombre del equipo visitante: ");
            int tamañoVisitante = visitante.length();
            if(tamañoVisitante>j){
                j=tamañoVisitante;
            }

            int golesLocal =  Esdia.readInt("Introduce los goles del equipo local: ");
            int golesVisitante =  Esdia.readInt("Introduce los goles del equipo visitante: ");

            String resultado =  calcularResultado(golesLocal, golesVisitante);
            
            vectPartidos[i-1]= new Partido(local, visitante, resultado);

        }

        for(i=0; i < 2*j+11; i++){
        System.out.printf("-");
        }
        
        System.out.printf("\n");


        System.out.printf("|");
        for(i=0; i < j; i++){
            System.out.printf(" ");
            }
        System.out.printf("QUINIELA");
        for(i=0; i < j+1; i++){
            System.out.printf(" ");
            }
        System.out.printf("|");
        
        
        System.out.printf("\n");

        for(i=0; i < 2*j+11; i++){
            System.out.printf("-");
            }

        System.out.printf("\n");
            for (Partido partido : vectPartidos) {
            System.out.printf("| %-"+ j +"s | %-"+ j +"s | \u001b[32m%1s\u001b[0m |\n",partido.getLocal(),partido.getVisitante(),partido.getResultado());
        }
        
        System.out.println();
    }

    public static String calcularResultado(int golesLocal, int golesVisitante){
        if(golesLocal>golesVisitante){
            return "1";
        }else if(golesLocal<golesVisitante){
            return "2";
        }else{
            return "X";
        }
    }
}



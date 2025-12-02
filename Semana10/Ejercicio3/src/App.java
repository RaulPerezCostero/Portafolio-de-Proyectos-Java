import com.coti.tools.Esdia;

public class App {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("\u001b[33mDe forma predefinida se calculan los primos por el metodo de Eratostenes\u001b[0m");
        Boolean naiveYes = Esdia.yesOrNo("¿Quiere calcular los primos con el metodo de Naive");
        int limite = Esdia.readInt("Introduce el numero hasta el que quiras que busque los primos: ");

        BuscadorPrimos naive = new BuscadorNaive("Naive", limite);
        BuscadorPrimos eratostenes = new BuscadorEratostenes("Eratostenes", limite);

        if(naiveYes == true){
            naive.calcular();

            System.out.println("\u001b[32mBuscador: " + naive.getNombre());
            System.out.println("Tiempo requerido: " + naive.getTiempoRequerido() + " ms");
            System.out.println("Cantidad de primos: " + naive.getCantidadPrimos()+ "\u001b[0m");
        }else{
            eratostenes.calcular();
            System.out.println("\n\u001b[32mBuscador: " + eratostenes.getNombre());
            System.out.println("Tiempo requerido: " + eratostenes.getTiempoRequerido() + " ms");
            System.out.println("Cantidad de primos: " + eratostenes.getCantidadPrimos() + "\u001b[0m");
        }

    }


}

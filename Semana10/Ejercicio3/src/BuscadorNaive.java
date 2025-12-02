import java.util.ArrayList;

public class BuscadorNaive extends BuscadorPrimos {

    public BuscadorNaive(String nombre, int limite) {
        super(nombre, limite);
    }

    @Override
    public ArrayList<Integer> calcularPrimos() {
        ArrayList<Integer> primos = new ArrayList<>();
        for (int i = 2; i <= getLimite(); i++) {
            if (esPrimo(i)) {
                primos.add(i);
            }
        }
        return primos;
    }

    //Metodo que verificar si el número es primo
    private boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}

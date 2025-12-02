
import java.util.ArrayList;

public class BuscadorEratostenes extends BuscadorPrimos {

    public BuscadorEratostenes(String nombre, int limite) {
        super(nombre, limite);
    }

    @Override
    public ArrayList<Integer> calcularPrimos() {
        boolean[] esCompuesto = new boolean[getLimite() + 1];
        ArrayList<Integer> primos = new ArrayList<>();

        for (int i = 2; i <= getLimite(); i++) {
            if (!esCompuesto[i]) {
                primos.add(i);
                for (int j = i * 2; j <= getLimite(); j += i) {
                    esCompuesto[j] = true;
                }
            }
        }
        return primos;
    }
}


import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public abstract class BuscadorPrimos {
    private String nombre;
    private int limite;
    private long tiempoRequerido;
    private int cantidadPrimos;

    //Constructor
    public BuscadorPrimos(String nombre, int limite) {
        this.nombre = nombre;
        this.limite = limite;
    }


    //Metodos de la clase
    public final void calcular() {
        Instant inicio = Instant.now();

        //Llamar al método abstracto calcularPrimos()
        ArrayList<Integer> primos = calcularPrimos();

        Instant fin = Instant.now();
        tiempoRequerido = Duration.between(inicio, fin).toMillis();
        cantidadPrimos = primos.size();
    }

    public abstract ArrayList<Integer> calcularPrimos();

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public int getLimite() {
        return limite;
    }

    public long getTiempoRequerido() {
        return tiempoRequerido;
    }

    public int getCantidadPrimos() {
        return cantidadPrimos;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setLimite(int limite) {
        this.limite = limite;
    }


    public void setTiempoRequerido(long tiempoRequerido) {
        this.tiempoRequerido = tiempoRequerido;
    }


    public void setCantidadPrimos(int cantidadPrimos) {
        this.cantidadPrimos = cantidadPrimos;
    }

    

}

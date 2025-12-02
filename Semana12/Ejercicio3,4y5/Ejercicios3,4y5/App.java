
import controller.Controlador;
import model.Modelo;
import view.Vista;

public class App {
    public static void main(String[] args) throws Exception {
        
        Modelo m = new Modelo(10);
        Vista v = new Vista();
        Controlador c = new Controlador(m, v);

        c.init();
    }
}

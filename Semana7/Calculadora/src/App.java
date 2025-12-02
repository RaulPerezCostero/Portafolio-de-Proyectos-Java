import controller.CalculadoraController;
import model.CalculadoraModel;
import view.CalculadoraView;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("|       Calculadora     |");

        CalculadoraModel model = new CalculadoraModel();
        CalculadoraView view = new CalculadoraView();
        CalculadoraController controller = new CalculadoraController(view, model);

        controller.run();

    }
}





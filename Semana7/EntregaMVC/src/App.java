import controller.EntregaController;
import model.EntregaModel;
import view.EntregaView;

public class App {
    public static void main(String[] args) throws Exception {
        EntregaModel model = new EntregaModel();
        EntregaView view = new EntregaView();
        EntregaController controller = new EntregaController(model, view);

        controller.run();
    
    }
}

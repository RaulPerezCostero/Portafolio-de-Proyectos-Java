import controller.FacturasController;
import model.FacturasModel;
import view.FacturasView;

public class App {
    public static void main(String[] args) throws Exception {
        FacturasModel model = new FacturasModel();
        FacturasView view = new FacturasView();
        FacturasController controller = new FacturasController(model, view);

        controller.run();
    }
}

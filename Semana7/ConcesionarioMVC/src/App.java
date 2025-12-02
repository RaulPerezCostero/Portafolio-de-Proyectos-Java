import controller.ConcesionarioController;
import model.ConcesionarioModel;
import view.ConcesionarioView;

public class App {
    public static void main(String[] args) {
        ConcesionarioModel model = new ConcesionarioModel();
        ConcesionarioView view = new ConcesionarioView();
        ConcesionarioController controller = new ConcesionarioController(model, view);

        controller.run();
    }
}

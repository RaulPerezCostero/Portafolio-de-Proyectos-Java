import controller.PersonaController;
import model.PersonaModel;
import view.PersonaView;

public class App {
    public static void main(String[] args) throws Exception {
        PersonaModel model = new PersonaModel();
        PersonaView view = new PersonaView();
        PersonaController controller = new PersonaController(model, view);

        controller.run();
    }
}

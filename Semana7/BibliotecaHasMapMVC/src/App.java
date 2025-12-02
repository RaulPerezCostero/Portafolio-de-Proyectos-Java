import controller.BibliotecaController;
import model.BibliotecaModel;
import view.BibliotecaView;

public class App {
    public static void main(String[] args) throws Exception {
        BibliotecaModel model =  new BibliotecaModel();
        BibliotecaView view = new BibliotecaView();
        BibliotecaController controller = new BibliotecaController(model, view);

        controller.run();
    }
}

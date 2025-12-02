import controller.AlmacenController;
import model.AlmacenModel;
import view.AlmacenView;

public class App {
    public static void main(String[] args) throws Exception {
        AlmacenModel model = new AlmacenModel();
        AlmacenView view = new AlmacenView();
        AlmacenController controller = new AlmacenController(model, view);

        controller.run();

        
    }
}
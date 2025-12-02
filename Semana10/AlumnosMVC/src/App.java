import controller.Controller;
import model.CSVRepository;
import model.PersistenceRepository;
import view.BaseView;
import view.ConsoleListaView;
import model.Model;

public class App {
    public static void main(String[] args) throws Exception {
        
        if (args[0].equals("lista")){
            BaseView view = new ConsoleListaView();
        }else{
            BaseView view = new ConsoleListaView();
        }

        BaseView view = getOptionForView(args[0]);
                
                PersistenceRepository repository = new CSVRepository();
        
                Model model = new Model(repository);
        
                Controller controller = new Controller(view, model);
                controller.initApp();
            }
        
            private static BaseView getOptionForView(String argumento) {
                switch (argumento) {
                    case "listado":
                        return new ConsoleListaView();
                    case "voice":
                    //return new VoiceView()
                    case "cli":
                    //return new CLIView();
                    default:
                        return new ConsoleListaView();
                }
            }
}

import java.nio.file.Path;
import java.nio.file.Paths;

import model.QuinielaModel;
public class App {
    public static void main(String[] args) throws Exception {
        
        Path rutaArchivo = Paths.get(System.getProperty("user.home"),"OneDrive","Escritorio", "equipos.txt");
        System.out.println(rutaArchivo);
        QuinielaModel quiniela = new QuinielaModel();
        int numPartidos = quiniela.cargarPartidos(rutaArchivo);
        System.out.printf("Se han añadido %d partidos", numPartidos);
    }
}

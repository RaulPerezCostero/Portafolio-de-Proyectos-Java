import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Archivo> archivos = new ArrayList<>();

        Documento doc = new Documento("Documento", 100);
        Imagen jpg = new Imagen("Imagen",500);
        APK apk = new APK("Aplicacion", 12000);

        archivos.add(doc);
        archivos.add(jpg);
        archivos.add(apk);

        System.out.println();
        for(Archivo archivo : archivos){
            System.out.println("Procesando archivo: "+ archivo.getNombre());
            
            if(archivo instanceof Imprimible){
                ((Imprimible) archivo).imprimir();
            }

            if (archivo instanceof Compartible) {
                ((Compartible) archivo).compartir("WhatsApp");
            }

            if (!(archivo instanceof Imprimible) && !(archivo instanceof Compartible)) {
                System.out.println("\u001b[31mEl archivo '" + archivo.getNombre() + "' no es imprimible ni compatible.\u001b[0m");
            }



        }
    }
}

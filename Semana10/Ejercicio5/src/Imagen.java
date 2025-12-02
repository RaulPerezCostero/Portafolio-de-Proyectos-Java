public class Imagen extends Archivo implements Compartible {

    public Imagen(String nombre, int tamaño){
        super(nombre, tamaño);
    }

    @Override
    public void compartir(String plataforma) {
        System.out.println("\u001b[32mEl archivo esta siendo compartido...\u001b[0m");
    }

}

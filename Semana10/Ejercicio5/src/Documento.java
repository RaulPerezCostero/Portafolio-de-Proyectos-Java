public class Documento extends Archivo implements Imprimible, Compartible{

    public Documento(String nombre, int tamño){
        super(nombre, tamño);
    }

    public void imprimir(){
        System.out.println("\u001b[32mEl archivo se ha enviado a imprimir...\u001b[0m");
    }

    public void compartir(String plataforma){

    }
}






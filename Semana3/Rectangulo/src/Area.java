import Area.Rectangulo;

public class Area {
    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo();

        double longitud = 1;
        rectangulo.setLongitud(longitud);

        double anchura = 1;
        rectangulo.setAnchura(anchura);

        System.out.println("\u001b[32mEl perímetro es: " + rectangulo.calcularPerimetro());
        System.out.println("El área es: " + rectangulo.calcularArea()+"\u001b[0m");
    }
}

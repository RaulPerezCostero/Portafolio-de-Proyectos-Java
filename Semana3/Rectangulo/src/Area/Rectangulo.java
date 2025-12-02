package Area;

import com.coti.tools.Esdia;

public class Rectangulo {
    private double longitud = 1.0;
    private double anchura = 1.0;

    public Rectangulo() {
        //Constructor vacio.
    }

    public double getLongitud() {
        return longitud;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setLongitud(double longitud) {
        boolean valido = false;
        while(!valido) {
            longitud = Esdia.readDouble("Introduce la longitud: ");
            try{
                if (longitud > 0.0 && longitud <= 20.0) {
                    this.longitud = longitud;
                    valido = true;
                } else {
                    System.out.println("\u001b[31mLa longitud debe estar entre 0.1 y 20.0\u001b[0m");
                }
            }catch(NumberFormatException e){
                System.out.println("\u001b[31m Error: No es un número doble válido.\u001b[0m");
            }
        }
    }

    public void setAnchura(double anchura) {
        boolean valido = false;
        while(!valido){
            anchura = Esdia.readDouble("Introduce la anchura: ");
            try{
                if (anchura > 0.0 && anchura <= 20.0) {
                    this.anchura = anchura;
                    valido = true;
                } else {
                    System.out.println("\u001b[31mLa anchura debe estar entre 0.1 y 20.0\u001b[0m");
                }
            }catch(NumberFormatException e){
                System.out.println("\u001b[31m Error: No es un número doble válido.\u001b[0m");
            }
        }
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 2 * (longitud + anchura);
    }

    // Método para calcular el área
    public double calcularArea() {
        return longitud * anchura;
    }
}

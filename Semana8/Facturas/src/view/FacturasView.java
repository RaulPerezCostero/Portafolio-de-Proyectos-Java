package view;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.coti.tools.Esdia;
import com.coti.tools.Rutas;

import controller.FacturasController;
import model.Facturas;

public class FacturasView {

    FacturasController controller;

    public void showMenu(){
        boolean salir = false;
        cargarFacturas();

        while(!salir){
            System.out.println("|-----------------------------|");
            System.out.println("| 1- Calcular valor minimo    |");
            System.out.println("| 2- Mostrar facturas         |");
            System.out.println("| 3- Exportar a html          |");
            System.out.println("| 4- Exportar a csv           |");
            System.out.println("| 5- Salir                    |");
            System.out.println("|-----------------------------|");
            int option = Esdia.readInt("Introduzca una opcion (1-5): ");
            

            switch (option) {
                case 1:
                    valorMinimo();
                    break;
                case 2:
                    mostrarFacturas();
                    break;
                case 3:
                    controller.exportarHtml();
                    break;
                
                case 4:
                    escribirCsv(controller.mostrarFacturas());
                    exportarCsv();
                    break;

                case 5:
                    salir=true;
                    break;
                default:
                    System.out.println("\u001b[31mEl numero debe estar entre 1-5\u001b[0m");
                    break;
            }
        }
    }

    public void escribirCsv(List<Facturas> facturas){
        controller.escribirCsv(facturas);
    }

    public void exportarCsv(){
        Path ruta = Rutas.pathToFileOnDesktop("facturas.csv");
        String delimitador = ",";

        List<Facturas> facturas = controller.mostrarFacturas();
        controller.exportarCsv(ruta, facturas, delimitador);
    }

    public void valorMinimo(){
        ArrayList<Facturas> arrayFacturas = controller.mostrarFacturas();
    
        controller.valorMinimo();
    
        System.out.println();
        System.out.println("\u001b[32m" + "-".repeat(149));
        System.out.printf("|");
    
        for (Facturas factura : arrayFacturas) {
            System.out.printf(" %5.2f |", factura.getValorMinimo());
        }
    
        System.out.println("\n" + "-".repeat(149) + "\u001b[0m");
        System.out.println();
    }
    

    public void mostrarFacturas(){
        ArrayList<Facturas> arrayFacturas = controller.mostrarFacturas();
        
        System.out.println();
        System.out.println("\u001b[32m" + "-".repeat(151));

        for (Facturas facturas : arrayFacturas) {
            System.out.printf("| %20s | %30s | %11.2f | %11s | %11.2f | %11s | %35s |\n", facturas.getNombre(), facturas.getConcepto(), facturas.getDescuento(), facturas.getFecha(), facturas.getImporte(), facturas.getNIF(), facturas.getDireccion());
            //No he hecho que muestre el IVA ya que es el mismo para todos, solo habría que añadir facturas.getIVA() al print anterior
        }

        System.out.println("-".repeat(151)+"\u001b[0m");
        System.out.println();

    }

    public void cargarFacturas(){
        Path rutaFacturas = Rutas.pathToFileOnDesktop("facturas.tsv");
        String delimitador = "\t";
        controller.cargarFacturas(rutaFacturas, delimitador);
    }

    public void setController(FacturasController facController){
        this.controller = facController;
    }
}

package model;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.coti.tools.OpMat;
import com.coti.tools.Rutas;

public class FacturasModel {
    
    ArrayList<Facturas> fact = new ArrayList<>();

    public FacturasModel() {
    }

    public List<Facturas> cargarFacturas(Path ruta, String delimitador){

        try{
            List<String> lineas = Files.readAllLines(ruta);

            for (String linea : lineas){
                Facturas f = Facturas.LeerFacturas(linea, delimitador);

                if(f != null){
                    fact.add(f);
                }
            }
        } catch (IOException e) {
            return null;
        }

        return fact;
    }

public void exportarHtml() {
    File file = Rutas.fileToFileOnDesktop("facturas.csv"); //Quizas no funcione en todos los ordenadores, aunque creo que si, sino funciona puede que sea por el OneDrive o por el tipo de "/"

    StringBuilder html = new StringBuilder();
    html.append("<html><head><title>Facturas</title></head><body>");
    html.append("<h1>Lista de Facturas</h1>");
    html.append("<table border='1'>");
    html.append("<tr><th>Nombre</th><th>Concepto</th><th>Descuento</th><th>Fecha</th><th>Importe</th><th>NIF</th><th>Dirección</th><th>IVA</th><th>Valor Mínimo</th></tr>");
    
    for (Facturas factura : fact) {
        html.append("<tr>")
            .append("<td>").append(factura.getNombre()).append("</td>")
            .append("<td>").append(factura.getConcepto()).append("</td>")
            .append("<td>").append(factura.getDescuento()).append("</td>")
            .append("<td>").append(factura.getFecha()).append("</td>")
            .append("<td>").append(factura.getImporte()).append("</td>")
            .append("<td>").append(factura.getNIF()).append("</td>")
            .append("<td>").append(factura.getDireccion()).append("</td>")
            .append("<td>").append(factura.getIVA()).append("</td>")
            .append("<td>").append(factura.getValorMinimo()).append("</td>")
            .append("</tr>");
    }
    
    html.append("</table>");
    html.append("</body></html>");

    try {
        Files.write(file.toPath(), html.toString().getBytes());
        System.out.println("\u001b[32mArchivo HTML generado exitosamente en: \u001b[35m" + file.getAbsolutePath() + "\u001b[0m");
    } catch (IOException e) {
        System.err.println("\u001b[31mError al exportar HTML: \u001b[0m" + e.getMessage());
    }
}

public void valorMinimo(){
    for (Facturas factura : fact) {
        factura.valorMinimo();
    }
}



    public void escribirCsv(List<Facturas> facturas){
        
        File f = Rutas.fileToFileOnDesktop("facturas.csv");
        String delimitador = ",";

        exportarCsv(f.toPath(), facturas, delimitador);

        List<Facturas> facturasLeidas = cargarFacturas(f.toPath(), delimitador);

        String[][] tabla = new String[facturasLeidas.size()][];
        for(int i = 0; i < tabla.length; i++){
            tabla[i] = facturasLeidas.get(i).getInstanceAsArrayOfStrings();
        }
        
        try{
            OpMat.printToScreen2(tabla);
        }catch(Exception ex){
            System.out.println("Error al mostrar la tabla");
        }

    }

    public void exportarCsv(Path ruta, List<Facturas> facturas, String delimitador){
        String[][] matrix = new String[facturas.size()][];
        for(int i = 0; i < matrix.length; i++){
            matrix[i]  = facturas.get(i).getInstanceAsArrayOfStrings();
        }

        try{
            OpMat.exportToDisk(matrix, ruta.toFile(), delimitador);
            System.out.println("\u001b[32mDatos exportados exitosamente a: \u001b[35m" + ruta.toFile().getAbsolutePath() + "\u001b[0m");
        } catch(Exception e){
            System.err.println("\u001b[31mOcurrio un error al intentar exportar las facturas: \u001b[0m"  + e.getMessage());
        }
    }

    public ArrayList<Facturas> mostrarFacturas() {
        return fact;
    }

}

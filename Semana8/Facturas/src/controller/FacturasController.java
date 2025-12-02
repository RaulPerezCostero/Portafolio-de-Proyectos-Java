package controller;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import model.Facturas;
import model.FacturasModel;
import view.FacturasView;

public class FacturasController {
    FacturasModel model;
    FacturasView view;
    Facturas facturas;

    public FacturasController(FacturasModel model, FacturasView view ){
        this.model = model;
        this.view = view;

        this.view.setController(this);
    }

    public void escribirCsv(List<Facturas> facturas){
        model.escribirCsv(facturas);
    }

    public void valorMinimo(){
        for (Facturas factura : model.mostrarFacturas()) {
            factura.valorMinimo();
        }
    }

    public void cargarFacturas(Path ruta, String delimitador){
        model.cargarFacturas(ruta, delimitador);
    }

    public void LeerFacturas(String delimitedString, String delimiter){
        Facturas.LeerFacturas(delimitedString, delimiter);
    }

    public void exportarHtml(){
        model.exportarHtml();
    }

    public void exportarCsv(Path ruta, List<Facturas> facturas, String delimitador){
        model.exportarCsv(ruta, facturas, delimitador);
    }

    public void run(){
        this.view.showMenu();
    }

    public ArrayList<Facturas> mostrarFacturas() {
        return model.mostrarFacturas();
    }
}

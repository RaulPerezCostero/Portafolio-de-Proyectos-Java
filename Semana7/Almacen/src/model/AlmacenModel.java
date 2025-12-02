package model;

import com.coti.tools.Esdia;

public class AlmacenModel {
    private int[][] ventas = new int[5][2];
    private float[] precios = new float[5];
    private float totalIngresos;
    private boolean interruptorVentas = false;
    private boolean interruptorPrecios = false;
    private boolean interruptorIngresos = false;

    public AlmacenModel() {
    }

    public void calcularIngresos(){
        if ( (interruptorPrecios && interruptorVentas) == true){
            totalIngresos = 0;
            for(int i=0; i<5; i++){
                for(int j=0; j<2; j++){
                    this.totalIngresos += this.ventas[i][j] * this.precios[j];
                }
            }
            interruptorIngresos = true;
        }else{
            System.err.println("\u001b[31mSeleccione primero las opciones 1 y 2\u001b[0m");
        }
    }

    public void leerPrecios(){
        for(int i=0; i<5; i++){
            precios[i] = Esdia.readFloat("Introduce el precio del producto "+ (i+1) + ": ");
        }
        interruptorPrecios = true;
    }

    public void leerVentas(){
        for(int i=0; i<5; i++){
            for(int j=0; j<2; j++){
                ventas[i][j] = Esdia.readInt("Introduce el numero de ventas en el almacen "+ (j+1) + " del producto "+ (i+1) +": ");
                
            }
        }
        interruptorVentas = true;
    }

    public float getIngresosTotales() {
        if ( (interruptorPrecios && interruptorVentas && interruptorIngresos) == true){
            return totalIngresos;
        }else{
            return -1;
        }
    }

    public void setIngresosTotales(float ingresosTotales) {
        this.totalIngresos = ingresosTotales;
    }


    public int[][] getVentas() {
        return ventas;
    }

    public void setVentas(int[][] ventas) {
        this.ventas = ventas;
    }

    public float[] getPrecios() {
        return precios;
    }

    public void setPrecios(float[] precios) {
        this.precios = precios;
    }
}

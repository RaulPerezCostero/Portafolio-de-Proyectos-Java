package Fruteria.src.model;

public class Fruta {
    private float precioSinIva;
    private int cantidad;
    private String nombre;

    private final float iva = (float) 1.21; //final hace que no se pueda modificar el valor con un set.

    public Fruta(){

    }

    public Fruta(String nombre, int cantidad, float precioSinIva){
        this.precioSinIva = precioSinIva;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public float PrecioConIva(){
        return precioSinIva*getIva();
    }

    public static float setPrecioSinIva(float precioSinIva) {
        return precioSinIva;
    }
    
    public float getPrecioSinIva() {
        return precioSinIva;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public float getIva() {
        return iva;
    }
}

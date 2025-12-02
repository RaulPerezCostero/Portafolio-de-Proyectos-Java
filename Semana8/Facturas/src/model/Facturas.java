package model;

public class Facturas {
    private String nombre;
    private String concepto;
    private double descuento;
    private String fecha;
    private double importe;
    private String NIF;
    private String direccion;
    private double IVA;
    private double valorMinimo;

    public Facturas(String concepto, double descuento, String fecha, double importe, String nIF, String nombre, String direccion, double IVA) {
        this.nombre = nombre;
        this.concepto = concepto;
        this.descuento = descuento;
        this.fecha = fecha;
        this.importe = importe;
        NIF = nIF;
        this.direccion = direccion;
        this.IVA = IVA;
    }

    public Double valorMinimo(){
        return this.valorMinimo = importe*(1-descuento)*(1+IVA);
    }

    public String[] getInstanceAsArrayOfStrings() {
        return new String[] {
            nombre,
            concepto,
            String.valueOf(descuento),
            fecha,
            String.valueOf(importe),
            NIF,
            direccion,
            String.valueOf(IVA),
            String.valueOf(valorMinimo)
        };
    }
    

    public static Facturas LeerFacturas(String delimitedString, String delimiter) {
        String[] chunks = delimitedString.split(delimiter);
    
        if (chunks.length != 8) {
            System.out.println("Error: la línea no tiene 8 campos: " + delimitedString);
            return null;
        }
    
        try {
            String concepto = chunks[0];
            double descuento = Double.parseDouble(chunks[1]);
            String fecha = chunks[2];
            double importe = Double.parseDouble(chunks[3]);
            String NIF = chunks[4];
            String nombre = chunks[5];
            String direccion = chunks[6];
            double IVA = Double.parseDouble(chunks[7]);
            
            return new Facturas(concepto, descuento, fecha, importe, NIF, nombre, direccion, IVA);
        } catch (Exception e) {
            System.out.println("Error al convertir la línea en factura: " + delimitedString + " - " + e.getMessage());
            return null;
        }
    }

    //Getters y Setters

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String nIF) {
        NIF = nIF;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getIVA() {
        return IVA;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setValorMinimo(double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public double getValorMinimo() {
        return valorMinimo;
    }

}

package model;

public class Libro {

    //Atributos

    private Autor autor;
    private String titulo;
    private int añoDePublicacion;
    private int numeroDePaginas;
    private double precio;

    //Constructor de libro

    public Libro(Autor autor, String titulo, int añoDePublicacion, int numeroDePaginas, double precio) {
        this.autor = autor;
        this.titulo = titulo;
        this.añoDePublicacion = añoDePublicacion;
        this.numeroDePaginas = numeroDePaginas;
        this.precio = precio;
    }

    //Setters y getters


    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAñoDePublicacion(int añoDePublicacion) {
        this.añoDePublicacion = añoDePublicacion;
    }

    public int getAñoDePublicacion() {
        return añoDePublicacion;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getPrecio() {
        return precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
}
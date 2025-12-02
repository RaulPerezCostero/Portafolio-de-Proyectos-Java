package model;

public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private int año;
    private double precio;
    
    

    public Libro(String isbn, String titulo, String autor, int año, double precio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.precio = precio;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getToString() {
        return  "Titulo: "+ titulo + ", Autor: " + autor + ", Año: " + año + ", Precio: "+ precio ;
    }

}
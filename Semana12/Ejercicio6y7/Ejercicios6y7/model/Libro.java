package model;

import java.io.Serializable;
import java.util.Locale;

public class Libro implements Serializable{

    //Atributos
    private String ISBN;
    private String titulo;
    private String autor;
    private int anio;

    public Libro(String iSBN, String titulo, String autor, int anio) {//Constructor con parametros
        ISBN = iSBN;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public Libro(){
        
    }

    @Override
    public String toString(){
        return "| ISBN: " + ISBN + " | Título: " + titulo + " | Autor: " + autor + " | Año publicación: " + anio + " |";
    }

    public String libroAsStringCSV(String delimiter){
        return String.format(Locale.ENGLISH,"%s"+delimiter+"%s"+delimiter+"%s"+delimiter+"%d", ISBN,titulo,autor,anio);
    }

    public static Libro getLibroFromDelimitedString(String delimitedString, String delimiter){
    
        String[] chunks = delimitedString.split(delimiter); //Separamos por el delimitador

        if(chunks.length != 4){
            return null;
        }
        try{
            String isbn = chunks[0]; //Asociamos cada variable a una posicion
            String titulo = chunks[1];
            String autor = chunks[2];
            int anio = Integer.parseInt(chunks[3]);
            Libro libro = new Libro(isbn, titulo, autor, anio);
            return libro;
        }
        catch(Exception e){
            return null;
        }
    }

    //Getters y Setters
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
}

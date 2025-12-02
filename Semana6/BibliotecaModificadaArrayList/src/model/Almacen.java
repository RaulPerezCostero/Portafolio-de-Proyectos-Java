package model;
import java.util.ArrayList;

public class Almacen {

    //Atributos

    private ArrayList<Libro> libros;
    private int tamañoAlmacen;

    //Constructor sin parametros/vacio.

    public Almacen(){
        this.libros = new ArrayList<>();
        this.tamañoAlmacen = 3;
    }

    //Metodo para añadir un libro.

    public void addLibro(Libro libro){
        if((libros.size() < tamañoAlmacen)){
            this.libros.add(libro);
        }else{
            System.err.println("\u001b[31mEl almacen esta lleno.\u001b[0m");
        }
    }

    //Metodo para eliminar un libro.

    public void removeLibro(int posicion){
        this.libros.remove(posicion);
    }

    //Metodo para reemplazar un libro.
    
    public void modificarLibro(int pos, Libro lib){
        this.libros.set(pos, lib);
    }

    //Setters y getters.

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setTamañoAlmacen(int tamañoAlmacen) {
        this.tamañoAlmacen = tamañoAlmacen;
    }

    public int getTamañoAlmacen() {
        return tamañoAlmacen;
    }

}

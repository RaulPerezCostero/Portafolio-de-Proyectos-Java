package model;

import java.util.HashMap;
import java.util.Map;

import com.coti.tools.Esdia;

public class BibliotecaModel {
    
    private String isbn;
    private String titulo;
    private String autor;
    private int año;
    private double precio;
    private static HashMap<String, BibliotecaModel> libros = new HashMap<>();
    

    public BibliotecaModel(){
        
    }

    public void añadirLibro(){
        BibliotecaModel nuevoLibro = new BibliotecaModel();

        nuevoLibro.isbn = Esdia.readString("Introduzca el ISBN: ");
        nuevoLibro.titulo = Esdia.readString("Introduzca el titulo del libro: ");
        nuevoLibro.autor = Esdia.readString("Introduzca el autor: ");
        nuevoLibro.año = Esdia.readInt("Introduzca el año de publicacion del libro: ");
        nuevoLibro.precio = Esdia.readDouble("Introduzca el precio del libro: ");

        libros.put(nuevoLibro.isbn, new BibliotecaModel());
    }

    public void eliminarLibro(){
        String isbn = Esdia.readString_ne("Ingrese el isbn del libro a eliminar: ");
        if (libros.containsKey(isbn)) {
            libros.remove(isbn);
            System.out.println("\u001b[32mLibro eliminado.\u001b[0m");
        } else {
            System.out.println("\u001b[31mLibro no encontrada.\u001b[0m");
        }
    }

    public void modificarLibro(){
        String isbn = Esdia.readString_ne("Ingrese el isbn del libro a modificar: ");

        if (libros.containsKey(isbn)) {
            BibliotecaModel libroModificado = new BibliotecaModel();
            
            libroModificado.titulo = Esdia.readString_ne("Introude el nuevo titulo: ");
            libroModificado.autor = Esdia.readString("Introude el nuevo autor: ");
            libroModificado.año = Esdia.readInt("Introude el nuevo año de publicacion: ");
            libroModificado.precio = Esdia.readDouble("Introude el nuevo precio: ");


            
            libros.put(isbn, libroModificado);

        } else {
            System.out.println("\u001b[31mLibro no encontrado.\u001b[0m");
        }
    }

    public void mostrarLibro(){
        if (libros.isEmpty()) {
            System.out.println("\u001b[31mNo hay libros en la biblioteca\u001b[0m");
            return;
        }

        System.out.println("\u001b[32mMIS LIBROS:");

        for (Map.Entry<String, BibliotecaModel> entrada : libros.entrySet()) {
            String isbn = entrada.getKey();
            BibliotecaModel valor = entrada.getValue();
            System.out.println(String.format("ISBN: %s - %s\u001b[0m",isbn ,valor.getToString()));
        }
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

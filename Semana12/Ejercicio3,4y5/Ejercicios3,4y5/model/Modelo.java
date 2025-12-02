package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.coti.tools.Rutas;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Modelo {

    ArrayList<Libro> libros;
    
    Path rutaBinario = Rutas.pathToFileOnDesktop("libros.bin");
    Path rutaJSON = Rutas.pathToFileOnDesktop("libros.JSON");
    Path rutaCSV = Rutas.pathToFileOnDesktop("libros.CSV");
    Path rutaXML = Rutas.pathToFileOnDesktop("libros.XML");

    public Modelo() {
        //Cuando se incia la aplicación el modelo está vacio
        libros = new ArrayList<>();
    }

    public Modelo(int personasRandom){
        libros = new ArrayList<>();

        for (int i = 0; i < personasRandom; i++) {
            Libro l = new Libro(""+i,"Libro"+i,"Autor"+i,1990+i);
            libros.add(l);
        }
    }

    public ArrayList<Libro> mostrarLibros(){
        return libros;
    }

    public void agregarNuevoLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    public boolean cargarDatosBinario() {
        
        File f = rutaBinario.toFile();

        if (f.exists()&&f.isFile()) {
            //Leo el binario
            try {
                FileInputStream fileInputStream = new FileInputStream(f);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                ArrayList<Libro> miObjeto = (ArrayList<Libro>) objectInputStream.readObject();
                objectInputStream.close();
                
                //Guardar en el modelo
                this.libros = miObjeto;
                return true;
            } catch (Exception e) {
                return false;
            }
        }else{
            return false;
        }
    }

    public boolean guardarDatosBinario() {
        
        File f = rutaBinario.toFile();

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(f);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(libros);
            objectOutputStream.close();

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void exportarLibrosCSV() throws CustomException{
        
        ArrayList<String> lineas = new ArrayList<>();
        String delimitador = ",";
        for (Libro libro : libros) {
            lineas.add(libro.libroAsStringCSV(delimitador));
        }
        try {
            Files.write(rutaCSV, lineas, StandardCharsets.UTF_8);
            System.out.println("Datos exportados exitosamente a: " + rutaCSV.toFile().getAbsolutePath());
        } catch (IOException e) {
            throw new CustomException(e.getMessage());
        }
    }

    public void importarLibrosCSV() throws CustomException {

        File f = rutaCSV.toFile();

        if (f.exists()&&f.isFile()) {
            try {
                String delimitador = ",";
                List<String> lineas = Files.readAllLines(rutaCSV);
                for (String linea : lineas) {
                    Libro libro = Libro.getLibroFromDelimitedString(linea, delimitador);
                    if(libro != null){
                        libros.add(libro);
                    }
                }
            } catch (IOException e) {
                throw new CustomException(e.getMessage());
            }
        }else{
            System.err.println("Error al exportar los libros, no existe el archivo: " + f.toString());
        }

    }

    public boolean exportarLibrosJSON() throws CustomException {

        try {
            Gson gson = new Gson();
            String json = gson.toJson(libros);
            Files.write(rutaJSON, json.getBytes(StandardCharsets.UTF_8));

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean importarLibrosJSON() throws CustomException {

        File f = rutaJSON.toFile();

        if (f.exists()&&f.isFile()) {
            try {
                Gson gson = new Gson();
                String json = new String(Files.readAllBytes(f.toPath()), StandardCharsets.UTF_8);
                Type tipoDeLista = new TypeToken<ArrayList<Libro>>() {}.getType();
                ArrayList<Libro> librosImportados = gson.fromJson(json, tipoDeLista);

                for (Libro libro : librosImportados) {
                    if(librosImportados.contains(libro)){
                        libros.add(libro);
                    }
                }

                return true;
            } catch (Exception e) {
                return false;
            }
        }else{
            return false;
        }

    }

    public boolean exportarLibrosXML() throws CustomException {
        
        File f = rutaXML.toFile();
        
        try {
            XmlMapper xmlMapper = new XmlMapper();
            String xml = xmlMapper.writeValueAsString(libros);
            Files.write(f.toPath(), xml.getBytes(StandardCharsets.UTF_8));
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }

    public boolean importarLibrosXML() throws CustomException {
        
        File f = rutaXML.toFile();

        try {
            XmlMapper xmlMapper = new XmlMapper();
            String xml = new String(Files.readAllBytes(f.toPath()), StandardCharsets.UTF_8);
            // Utiliza TypeFactory para obtener el tipo de lista correcto
            libros = xmlMapper.readValue(xml, xmlMapper.getTypeFactory().constructCollectionType(List.class, Libro.class));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}

package model;

import com.coti.tools.Esdia;

public class ConcesionarioModel {
    private String matricula;
    private String color;
    private String marca;
    private String modelo;

    private static final int MAX_SIZE = 5;
    private static ConcesionarioModel[] coches = new ConcesionarioModel[MAX_SIZE];
    private static int cochesCount = 0;

    public ConcesionarioModel() {
        
    }

    public void agregarCoche(){
        if (cochesCount < MAX_SIZE) {
            ConcesionarioModel nuevoCoche = new ConcesionarioModel();

            nuevoCoche.matricula = Esdia.readString_ne("Ingrese la matricula del coche: ");
            nuevoCoche.color = Esdia.readString_ne("Ingrese el color del coche: ");
            nuevoCoche.marca = Esdia.readString_ne("Ingrese la marca del coche: ");
            nuevoCoche.modelo = Esdia.readString("Ingrese el modelo del coche: ");
            coches[cochesCount++] = nuevoCoche;
            System.out.println("\u001b[32mCoche añadido correctamente\u001b[0m");
        } else {
            System.out.println("\u001b[31mArray de coches está lleno\u001b[0m");
        }
    }

    public void eliminarCoche(){
        String matricula = Esdia.readString_ne("Ingrese la matricula del coche a eliminar: ");
        boolean encontrado = false;
        for (int i = 0; i < cochesCount; i++) {
            
            if (coches[i].getMatricula().equals(matricula)) {
                encontrado = true;
                for (int j = i; j < cochesCount - 1; j++) {
                    coches[j] = coches[j + 1];
                }
                cochesCount--;

                System.out.println("\u001b[32mCoches eliminado correctamente\u001b[0m");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("\u001b[31mCoche no encontrado\u001b[0m");
        }
    }

    public void modificarCoche(){
        String matricula = Esdia.readString_ne("Ingrese la matricula del coche a modificar: ");
        boolean encontrado = false;
        for (int i = 0; i < cochesCount; i++) {
            if (coches[i].getMatricula().equals(matricula)) {
                String nuevaMatricula = Esdia.readString_ne("Ingrese la nueva matricula del nuevo coche: ");
                String nuevoColor = Esdia.readString_ne("Ingrese el nuevo color: ");
                String nuevaMarca = Esdia.readString_ne("Ingrese la nueva marca: ");
                String nuevoModelo = Esdia.readString_ne("Ingrese el nuvo modelo: ");

                coches[i].setMatricula(nuevaMatricula);
                coches[i].setColor(nuevoColor);
                coches[i].setMarca(nuevaMarca);
                coches[i].setModelo(nuevoModelo);

                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("\u001b[31mCoche no encontrado\u001b[0m");
        }
    }

    public void listarCoche(){
        if (cochesCount == 0) {
            System.out.println("\u001b[31mNo hay coches en el array\u001b[0m");
            return;
        }

        for (int i = 0; i < cochesCount; i++) {
            System.out.println(coches[i].getCocheString());
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCocheString() {
        return "Persona [matricula=" + matricula + ", color=" + color + ", marca=" + marca + " modelo="+ modelo+ " ]";
    }
}

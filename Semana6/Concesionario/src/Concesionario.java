//Ejercicio realizado a partir del de studium.

import static com.coti.tools.Esdia.*;

import model.Coche;

public class Concesionario {
    
    private static final int MAX_SIZE = 5;
    private static Coche[] coches = new Coche[MAX_SIZE];
    private static int cochesCount = 0;

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- MENU CRUD ---");
            System.out.println("1. Agregar coche");
            System.out.println("2. Eliminar coche");
            System.out.println("3. Modificar coche");
            System.out.println("4. Listar coche");
            System.out.println("5. Salir");
            opcion = readInt("Ingrese una opción: ");
            
            switch (opcion) {
                case 1: agregarCoche(); break;
                case 2: eliminarCoche(); break;
                case 3: modificarCoche(); break;
                case 4: listarCoche(); break;
                case 5: System.out.println("¡Hasta luego!"); break;
                default: System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    public static void agregarCoche() {
        if (cochesCount < MAX_SIZE) {
            String matricula = readString_ne("Ingrese la matricula del coche: ");
            String color = readString_ne("Ingrese el color del coche: ");
            String marca = readString_ne("Ingrese la marca del coche: ");
            String modelo = readString("Ingrese el modelo del coche: ");
            coches[cochesCount++] = new Coche(matricula, color, marca, modelo);
            System.out.println("Coche añadido correctamente.");
        } else {
            System.out.println("Array de coches está lleno.");
        }
    }

    public static void eliminarCoche() {
        String matricula = readString_ne("Ingrese la matricula del coche a eliminar: ");
        boolean encontrado = false;
        for (int i = 0; i < cochesCount; i++) {
            // Para comparar cadenas empleamos equals
            if (coches[i].getMatricula().equals(matricula)) { //No se puede hacer esto; persona[i].getNombre() == nombre, esto solo vale para primitivos como int, float.
                encontrado = true;
                for (int j = i; j < cochesCount - 1; j++) { //Sirve para reordenar el vector ya que hemos eliminado una persona del medio.
                    coches[j] = coches[j + 1];
                }
                cochesCount--; //Bajamos en uno el contador

                System.out.println("Coches eliminado correctamente.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Coche no encontrado.");
        }
    }

    public static void modificarCoche() {

        String matricula = readString_ne("Ingrese la matricula del coche a modificar: ");
        boolean encontrado = false;
        for (int i = 0; i < cochesCount; i++) {
            if (coches[i].getMatricula().equals(matricula)) {
                String nuevaMatricula = readString_ne("Ingrese la nueva matricula del nuevo coche: ");
                String nuevoColor = readString_ne("Ingrese el nuevo color: ");
                String nuevaMarca = readString_ne("Ingrese la nueva marca: ");
                String nuevoModelo = readString_ne("Ingrese el nuvo modelo: ");

                coches[i].setMatricula(nuevaMatricula);
                coches[i].setColor(nuevoColor);
                coches[i].setMarca(nuevaMarca);
                coches[i].setModelo(nuevoModelo);

                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Coche no encontrado.");
        }
    }

    public static void listarCoche() {

        if (cochesCount == 0) {
            System.out.println("No hay coches en el array.");
            return;
        }

        for (int i = 0; i < cochesCount; i++) {
            System.out.println(coches[i].getCocheString());
        }
    }
    
}

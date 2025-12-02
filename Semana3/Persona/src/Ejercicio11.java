import com.coti.tools.Esdia;

import model.Persona11;

public class Ejercicio11 {
    public static void main(String[] args) throws Exception {
        
        Persona11[] personas = new Persona11[3]; // Crea lista de tres posiciones, las listas empiezan en el cero.
        for (int index = 0; index < personas.length; index++){
            personas[index] = new Persona11();
            String promptNombre = String.format("Escriba el nombre de la persona %d: ", index+1); //Como Esdia no permite ",variable" como el printf debemos de cambiar a format con esta funcion.
            String nombre = Esdia.readString_ne(promptNombre); //readString_ne lee una entrada no nula.
            personas[index].setNombre(nombre);

            String promptPeso = String.format("Ingrese el peso (Kg) de %s: ", personas[index].getNombre());
            double peso = Esdia.readDouble(promptPeso);
            personas[index].setPeso(peso);

            String promptTalla = String.format("Ingrese el talla (cm) de %s: ", personas[index].getNombre());
            double talla = Esdia.readDouble(promptTalla);
            personas[index].setTalla(talla);

            int dni = Esdia.readInt("Introduce el numero del DNI: ", 1000000, 99999999);
            personas[index].setDni(dni);
            personas[index].getDni();
        }

        for (int i = 0; i < personas.length; i++){ //pesonas.length es la longitud de la lista.
            System.out.println("El IMC de " + personas[i].getNombre() + " es " + personas[i].getIMC());
        }

        Persona11 masAlta = personas[0];
        Persona11 masPesada = personas[0];

        for (int i = 0; i < personas.length; i++){
            if (personas[i].getTalla() > masAlta.getTalla()){
                masAlta = personas[i];
            }

            if (personas[i].getPeso() > masPesada.getPeso()){
                masPesada = personas[i];
            }
            
        }

        System.out.println("\u001b[32mLa persona más alta es: " + masAlta.getNombre() + " con una altura de " + masAlta.getTalla()+ "\u001b[0m");
        System.out.println("\u001b[32mLa persona más pesada es: " + masPesada.getNombre() + " con un peso de " + masPesada.getPeso() +"\u001b[0m");

    }
}
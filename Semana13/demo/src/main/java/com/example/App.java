package com.example;
import java.util.ArrayList;


/**
 * Clase principal que contiene el punto de entrada del programa.
 *
 * @author Raúl
*/

public class App {

    /**
     * Metodo principal que se ejecuta al iniciar el programa.
     *
     *@param args Argumentos de linea de comandos
    */
    public static void main(String[] args) {
        ArrayList<Damageable> damageables = new ArrayList<>();

        damageables.add(new Wall());
        damageables.add(new Character());
        damageables.add(new Knight());


        System.out.println();
        System.out.println("\u001b[33m|-----------------------------------------------|");
        System.out.println("| Aplicando daño de 100 puntos a cada objeto... |");
        System.out.println("|-----------------------------------------------|\u001b[0m");
        for (Damageable damageable : damageables) {
            damageable.applyDamage(100); //cambiar a damgePoints >= 500 para derrotar a todos
        }

        System.out.println("\u001b[31m|-----------------------------------------------|\u001b[0m");
    }
}
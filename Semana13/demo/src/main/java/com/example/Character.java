
package com.example;
class Character implements Damageable {
    protected int health;

    public Character() {
        this.health = 300;
    }

    @Override
    public void applyDamage(int damagePoints) {
        health -= damagePoints;
        if (health <= 0) {
            System.out.println("\u001B[38;2;255;165;0m|\u001b[31m    -El personaje ha muerto\u001b[0m                    \u001B[38;2;255;165;0m|\u001b[0m");
        } else {
            System.out.println("\u001B[38;2;255;165;0m| \u001b[0m   -Salud restante del personaje: \u001b[32m" + health + "\u001b[0m         \u001B[38;2;255;165;0m|\u001b[0m");
        }
    }

}
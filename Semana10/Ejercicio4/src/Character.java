class Character implements Damageable {
    protected int health;

    public Character() {
        this.health = 300;
    }

    @Override
    public void applyDamage(int damagePoints) {
        health -= damagePoints;
        if (health <= 0) {
            System.out.println("|\u001b[31m    -El personaje ha muerto\u001b[0m                    |");
        } else {
            System.out.println("|    -Salud restante del personaje: \u001b[32m" + health + "\u001b[0m         |");
        }
    }

}
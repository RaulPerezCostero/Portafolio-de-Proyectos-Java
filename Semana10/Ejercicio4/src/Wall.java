class Wall implements Damageable {
    private int durability;

    public Wall() {
        this.durability = 500;
    }

    @Override
    public void applyDamage(int damagePoints) {
        durability -= damagePoints;
        if (durability <= 0) {
            System.out.println("|\u001b[31m    -El muro ha sido destruido\u001b[0m                 |");
        } else {
            System.out.println("|    -Durabilidad del muro restante: \u001b[32m" + durability + "\u001b[0m        |");
        }
    }

}
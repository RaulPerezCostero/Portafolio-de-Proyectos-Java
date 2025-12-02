package com.example;
class Knight extends Character {

    public Knight() {
        super();
        this.health = 400;
    }

    @Override
    public void applyDamage(int damagePoints) {
        int reducedDamage = (int) (damagePoints * 0.9);
        super.applyDamage(reducedDamage);

            if(reducedDamage < 100){
                System.out.println("\u001b[31m| \u001b[30m  (El caballero recibió daño reducido: " + reducedDamage + ")\u001b[31m    |\u001b[0m");
        }else{
            System.out.println("\u001b[31m| \u001b[30m  (El caballero recibió daño reducido: " + reducedDamage + ")\u001b[31m   |\u001b[0m");
        }
    }

}
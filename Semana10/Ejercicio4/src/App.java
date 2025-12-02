import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Damageable> damageables = new ArrayList<>();

        damageables.add(new Wall());
        damageables.add(new Character());
        damageables.add(new Knight());

        System.out.println();
        System.out.println("|-----------------------------------------------|");
        System.out.println("|\u001b[33m Aplicando daño de 100 puntos a cada objeto... \u001b[0m|");
        System.out.println("|-----------------------------------------------|");
        for (Damageable damageable : damageables) {
            damageable.applyDamage(100);
        }

        System.out.println("|-----------------------------------------------|");
    }
}
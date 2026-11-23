import strategies.attack.BowAttack;
import strategies.attack.MagicAttack;
import strategies.attack.SwordAttack;
import strategies.fly.FlyNoWay;
import strategies.fly.FlyWithJet;
import strategies.fly.FlyWithWings;
import strategies.type.AssassinType;
import strategies.type.KnightType;
import strategies.type.WarriorType;

public class Main {

    public static void main(String[] args) {

        // Alex begins as a Warrior, using a sword, without the ability to fly.
        Player alex = new Player("Alex", new SwordAttack(),
                new FlyNoWay(), new WarriorType());

        System.out.println("--- Level 1: Starting character ---");
        alex.showStatus();
        alex.attack();
        alex.fly();

        // Same player, new weapon and a jetpack.
        System.out.println("\n--- Level 2: Equipment upgrade ---");
        alex.setAttackStrategy(new BowAttack());
        alex.setFlyStrategy(new FlyWithJet());

        alex.showStatus();
        alex.attack();
        alex.fly();

        // Same player, new character mode and wings.
        System.out.println("\n--- Level 3: Change combat type ---");
        alex.setTypeStrategy(new AssassinType());
        alex.setFlyStrategy(new FlyWithWings());

        alex.showStatus();
        alex.attack();
        alex.fly();

        // Demonstrate the last type and attack strategy.
        System.out.println("\n--- Level 4: Knight mode ---");
        alex.setTypeStrategy(new KnightType());
        alex.setAttackStrategy(new MagicAttack());
        alex.setFlyStrategy(new FlyNoWay());

        alex.showStatus();
        alex.attack();
        alex.fly();
    }
}

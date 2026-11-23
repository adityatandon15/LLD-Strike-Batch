import strategies.attack.AttackStrategy;
import strategies.fly.FlyStrategy;
import strategies.type.CharacterTypeStrategy;

import java.util.Objects;

public class Player {

    private final String name;

    private AttackStrategy attackStrategy;
    private FlyStrategy flyStrategy;
    private CharacterTypeStrategy typeStrategy;

    public Player(String name, AttackStrategy attackStrategy,
                  FlyStrategy flyStrategy, CharacterTypeStrategy typeStrategy) {

        this.name = name;
        this.attackStrategy = attackStrategy;
        this.flyStrategy = flyStrategy;
        this.typeStrategy = typeStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setFlyStrategy(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public void setTypeStrategy(CharacterTypeStrategy typeStrategy) {
        this.typeStrategy = typeStrategy;
    }

    public void showStatus() {
        System.out.println("Player: " + name + " | Type: " + typeStrategy.getTypeName());
    }

    public void attack() {
        System.out.print(name + " attacks: ");
        attackStrategy.attack();
    }

    public void fly() {
        System.out.print(name + " attempts to fly: ");
        flyStrategy.fly();
    }

}

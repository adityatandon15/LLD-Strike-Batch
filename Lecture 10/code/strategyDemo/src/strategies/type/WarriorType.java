package strategies.type;

public class WarriorType implements CharacterTypeStrategy {

    @Override
    public String getTypeName() {
        return "Warrior";
    }

    @Override
    public void specialMove() {
        System.out.println("Uses a powerful battle roar!");
    }
}

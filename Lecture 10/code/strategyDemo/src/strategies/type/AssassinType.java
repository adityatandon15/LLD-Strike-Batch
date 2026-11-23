package strategies.type;

public class AssassinType implements CharacterTypeStrategy {

    @Override
    public String getTypeName() {
        return "Assassin";
    }

    @Override
    public void specialMove() {
        System.out.println("Performs a stealth strike!");
    }
}

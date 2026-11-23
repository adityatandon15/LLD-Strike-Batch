package strategies.type;

public class KnightType implements CharacterTypeStrategy {

    @Override
    public String getTypeName() {
        return "Knight";
    }

    @Override
    public void specialMove() {
        System.out.println("Performs a shield bash!");
    }
}

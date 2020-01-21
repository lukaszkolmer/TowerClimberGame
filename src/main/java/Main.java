
import Character.CombatStatistics.CombatStatistics;
import Character.CustomCharacterGenerator;
import Character.CustomCharacter;

public class Main {
    public static void main(String[] args) {
        CustomCharacterGenerator customCharacterGenerator = new CustomCharacterGenerator();
        System.out.println("teeeeest");
        CustomCharacter customCharacter = customCharacterGenerator.createCustomCharacter();
        System.out.println(customCharacter);
    }
}

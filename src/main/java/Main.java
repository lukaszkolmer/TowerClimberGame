
import Character.CombatStatistics.CombatStatistics;
import Character.CustomCharacterGenerator;
import Character.CustomCharacter;


public class Main {
    public static void main(String[] args) {
        CustomCharacterGenerator customCharacterGenerator = new CustomCharacterGenerator();
        CustomCharacter customCharacter = customCharacterGenerator.createCustomCharacter();
        System.out.println(customCharacter);

    }
}

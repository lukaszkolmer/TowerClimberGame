package Character;

import Character.BaseInfo.CharacterBaseInfo;
import Character.BaseInfo.CharacterBaseInfoCreationMethods;
import Character.BaseStatistics.BaseStatistics;
import Character.Body.CharacterBody;
import Character.CombatStatistics.CombatStatistics;
import Character.Inventory.Inventory;
import Character.Races.RaceList;


public class CustomCharacterGenerator {

   private CombatStatistics combatStatistics = new CombatStatistics();

    public CustomCharacter createCustomCharacter(){
        RaceList raceList = new RaceList();
        CharacterBaseInfoCreationMethods characterBaseInfoCreationMethods = new CharacterBaseInfoCreationMethods();
        CharacterBaseInfo characterBaseInfo = characterBaseInfoCreationMethods.createCharacterBaseInfo();
         BaseStatistics baseStatistics = raceList.human.generateBaseHumanStatistics();
         CombatStatistics combatStatistics = new CombatStatistics();
         CharacterBody characterBody = new CharacterBody();
         Inventory inventory = new Inventory();
        return new CustomCharacter(characterBaseInfo,baseStatistics,combatStatistics,characterBody,inventory);
    }
}

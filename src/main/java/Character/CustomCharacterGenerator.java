package Character;

import Character.BaseInfo.CharacterBaseInfo;
import Character.BaseInfo.CharacterBaseInfoCreationMethods;
import Character.BaseStatistics.BaseStatistics;
import Character.Body.CharacterBody;
import Character.CombatStatistics.CombatStatistics;
import Character.CombatStatistics.CombatStatisticsCreationMethods;
import Character.Inventory.Inventory;
import Character.Races.RaceList;


public class CustomCharacterGenerator {


    public CustomCharacter createCustomCharacter(){
        RaceList raceList = new RaceList();
        CombatStatisticsCreationMethods combatStatisticsCreationMethods = new CombatStatisticsCreationMethods();
        CharacterBaseInfoCreationMethods characterBaseInfoCreationMethods = new CharacterBaseInfoCreationMethods();

         CharacterBaseInfo characterBaseInfo = characterBaseInfoCreationMethods.createCharacterBaseInfo();
         BaseStatistics baseStatistics = characterBaseInfo.race.getBaseStatistics();
         CombatStatistics combatStatistics = combatStatisticsCreationMethods.createCombatStatistics(baseStatistics);
         CharacterBody characterBody = new CharacterBody();
         Inventory inventory = new Inventory();
        return new CustomCharacter(characterBaseInfo,baseStatistics,combatStatistics,characterBody,inventory);
    }
}

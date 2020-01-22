package Character;

import Character.BaseInfo.CharacterBaseInfo;
import Character.BaseStatistics.BaseStatistics;
import Character.Body.CharacterBody;
import Character.CombatStatistics.CombatStatistics;
import Character.Inventory.Inventory;
import Character.Races.RaceList;

public class CustomCharacter {
    private RaceList raceList = new RaceList();
    private CharacterBaseInfo characterBaseInfo;
    private BaseStatistics baseStatistics;
    private CombatStatistics combatStatistics;
    private CharacterBody characterBody = new CharacterBody();
    private Inventory inventory = new Inventory();

    @Override
    public String toString() {
        return " " + characterBaseInfo + baseStatistics + combatStatistics;
    }

    CustomCharacter(CharacterBaseInfo characterBaseInfo) {
        this.characterBaseInfo = characterBaseInfo;
    }

    public CustomCharacter(CharacterBaseInfo characterBaseInfo, BaseStatistics baseStatistics, CombatStatistics combatStatistics, CharacterBody characterBody, Inventory inventory) {
        this.characterBaseInfo = characterBaseInfo;
        this.baseStatistics = baseStatistics;
        this.combatStatistics = combatStatistics;
        this.characterBody = characterBody;
        this.inventory = inventory;
    }
}


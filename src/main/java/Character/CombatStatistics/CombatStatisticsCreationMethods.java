package Character.CombatStatistics;

import Character.BaseStatistics.BaseStatistics;
import Character.Inventory.Inventory;
import Item.Armor.Armor;
import Item.Item;

import java.util.ArrayList;
import java.util.List;

public class CombatStatisticsCreationMethods {

    public DodgeChance createDodgeChance(){
        return new DodgeChance();
    }
    public HealthPoints createHealthPoints(){
        return new HealthPoints(5);
    }
    public Fatigue createFatigue(){
        return new Fatigue();
    }
    public Mana createMana(){
        return new Mana();
    }



    public CombatStatistics createCombatStatistics(BaseStatistics baseStatistics){
        DodgeChance dodgeChance = createDodgeChance();
        dodgeChance.setDodgeChance(5 + baseStatistics.getAgility().getAgilityValue()*0.25);
        HealthPoints healthPoints = createHealthPoints();
        healthPoints.setMaxHealthPoints(10 + baseStatistics.getEndurance().getEnduranceValue());
        Fatigue fatigue = createFatigue();
        Mana mana = createMana();
        mana.setMaxMana(10+baseStatistics.getIntelligence().getIntelligenceValue());

        return new CombatStatistics(dodgeChance,fatigue,healthPoints,mana);
    }
}

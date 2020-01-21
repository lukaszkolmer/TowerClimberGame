package Character.CombatStatistics;


import Character.BaseStatistics.Agility;
import Character.BaseStatistics.BaseStatistics;


public class DodgeChance {
    Agility agility = new Agility();
    private double dodgeChance = 10 + ( agility.getAgilityValue()*0.25);
    //chance to evade attack. 1/4 of agility not counting perks, i.e 25% to dodge from 100 agility;

    public double getDodgeChance() {
        return dodgeChance;
    }

    public void dodgeChanceUpdater(){
        dodgeChance = agility.getAgilityValue()*0.25;
    }
}

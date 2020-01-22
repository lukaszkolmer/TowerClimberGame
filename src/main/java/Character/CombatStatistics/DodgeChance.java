package Character.CombatStatistics;


import Character.BaseStatistics.Agility;
import Character.BaseStatistics.BaseStatistics;


public class DodgeChance {
    private double dodgeChance;
    //chance to evade attack. 1/4 of agility not counting perks, i.e 25% to dodge from 100 agility;
    public void setDodgeChance(double dodgeChance) {
        this.dodgeChance = dodgeChance;
    }

    public double getDodgeChance() {
        return dodgeChance;
    }

    @Override
    public String toString() {
        return "You have " + getDodgeChance() + "% to dodge a melee attack";
    }
}

package Character.CombatStatistics;


import Character.BaseStatistics.BaseStatistics;


public class DodgeChance {
    private BaseStatistics baseStatistics = BaseStatistics.getInstance();
    private double dodgeChance = 10 + (baseStatistics.getAgility().getAgilityValue()*0.25);
    //chance to evade attack. 1/4 of agility not counting perks, i.e 25% to dodge from 100 agility;

    public double getDodgeChance() {
        return dodgeChance;
    }

    public void dodgeChanceUpdater(){
        dodgeChance = baseStatistics.getAgility().getAgilityValue()*0.25;
    }
}

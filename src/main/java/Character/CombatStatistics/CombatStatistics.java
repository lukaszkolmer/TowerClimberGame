package Character.CombatStatistics;

public class CombatStatistics {
    private DodgeChance dodgeChance = new DodgeChance();
    private Fatigue fatigue = new Fatigue();
    private HealthPoints healthPoints = new HealthPoints();
    private Mana mana = new Mana();

    @Override
    public String toString() {
        return "\nCombat Statistics: \n Health Points: " + healthPoints.getCurrentHealthPoints()+"/"+ healthPoints.getMaxHealthPoints()
                + "\n Mana: " + mana.getCurrentMana() +"/"+mana.getBaseMana() + "\n Fatigue: " + fatigue.getFatigue() + "/" + fatigue.getMaxFatigue() + "\n Dodge chance: " + dodgeChance.getDodgeChance() + "%";
    }

    public void updateCombatStats(){
        dodgeChance.dodgeChanceUpdater();
        healthPoints.maxHealthPointsUpdater();
        mana.baseManaUpdater();
    }
}

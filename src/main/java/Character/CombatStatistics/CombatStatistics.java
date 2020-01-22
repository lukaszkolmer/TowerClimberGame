package Character.CombatStatistics;

public class CombatStatistics {
    private DodgeChance dodgeChance;
    private Fatigue fatigue;
    private HealthPoints healthPoints;
    private Mana mana;

    public CombatStatistics(DodgeChance dodgeChance, Fatigue fatigue, HealthPoints healthPoints, Mana mana) {
        this.dodgeChance = dodgeChance;
        this.fatigue = fatigue;
        this.healthPoints = healthPoints;
        this.mana = mana;
    }

    public DodgeChance getDodgeChance() {
        return dodgeChance;
    }

    public Fatigue getFatigue() {
        return fatigue;
    }

    public HealthPoints getHealthPoints() {
        return healthPoints;
    }

    public Mana getMana() {
        return mana;
    }

    @Override
    public String toString() {
        return "\n Combat Statistics: \n Health: " + healthPoints.getCurrentHealthPoints() + "/" + healthPoints.getMaxHealthPoints() + " \n Fatigue: " + fatigue.getFatigue() + "/" + fatigue.getMaxFatigue()
                + "\n Mana: " + mana.getCurrentMana()+"/" + mana.getMaxMana() + "\n Chance to dodge melee attack: " + dodgeChance.getDodgeChance() +"%";
    }
}

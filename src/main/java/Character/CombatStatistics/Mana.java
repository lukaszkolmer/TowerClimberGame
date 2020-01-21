package Character.CombatStatistics;

import Character.BaseStatistics.Intelligence;

public class Mana {

    private Intelligence intelligence = new Intelligence();
    private Integer baseMana = 10 + intelligence.getIntelligenceValue();
    private Integer currentMana = getBaseMana();

    public Integer getBaseMana() {
        return baseMana;
    }
    public void baseManaUpdater(){
        this.baseMana = 10 + intelligence.getIntelligenceValue();
    }

    public Integer getCurrentMana() {
        return currentMana;
    }

    public void setCurrentMana(Integer currentMana) {
        this.currentMana = currentMana;
    }

    public void currentManaIncrease(Integer increseBy){
        currentMana += increseBy;
        if (currentMana > baseMana){
            setCurrentMana(baseMana);
        }

    }
    public void currentManaDecrease(Integer decreaseBy){
        currentMana -= decreaseBy;
        if (currentMana < 0){
            setCurrentMana(0);
        }
    }
}

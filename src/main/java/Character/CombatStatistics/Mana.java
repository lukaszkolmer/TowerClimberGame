package Character.CombatStatistics;

public class Mana {


    private Integer maxMana;
    private Integer currentMana;

    public Integer getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(Integer baseMana) {
        this.maxMana = baseMana;
        currentMana = maxMana;
    }

    public Integer getCurrentMana() {
        return currentMana;
    }

    public void setCurrentMana(Integer currentMana) {
        this.currentMana = currentMana;
    }

    public void currentManaIncrease(Integer increseBy){
        currentMana += increseBy;
        if (currentMana > maxMana){
            setCurrentMana(maxMana);
        }

    }
    public void currentManaDecrease(Integer decreaseBy){
        currentMana -= decreaseBy;
        if (currentMana < 0){
            setCurrentMana(0);
        }
    }
}

package Character.CombatStatistics;

public class Fatigue {
    private Integer fatigue = 0;
    private Integer maxFatigue = 100;
    // fatigue is set value of 0 at start with max fatigue being 100.
    // current fatigue inc/decreased in fight doing special attacks, quick resting etc.
    // Max fatigue can be maniupulated by perks or buffs/debuffs.

    public Integer getFatigue() {
        return fatigue;
    }

    public void setFatigue(Integer fatigue) {
        this.fatigue = fatigue;
    }

    public Integer getMaxFatigue() {
        return maxFatigue;
    }

    public void setMaxFatigue(Integer maxFatigue) {
        this.maxFatigue = maxFatigue;
    }

    public void increaseFatigue(Integer increaseBy){
        fatigue +=  increaseBy;
        if (fatigue > maxFatigue){
            setFatigue(maxFatigue);
        }
    }

    public void decreaseFatigue(Integer decreaseBy){
        fatigue -= decreaseBy;
        if (fatigue < 0) {
            setFatigue(0);
        }
    }
}

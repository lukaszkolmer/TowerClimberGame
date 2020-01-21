package Character.CombatStatistics;


import Character.BaseStatistics.Endurance;

public class HealthPoints {

    private Endurance endurance = new Endurance();
    private Integer maxHealthPoints = 10 + endurance.getEnduranceValue();
    private Integer currentHealthPoints = maxHealthPoints;

    Integer getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void maxHealthPointsUpdater(){
        this.maxHealthPoints = 10 + endurance.getEnduranceValue();
    }

    public Integer getCurrentHealthPoints() {
        return currentHealthPoints;
    }

    public void setCurrentHealthPoints(Integer currentHealthPoints) {
        this.currentHealthPoints = currentHealthPoints;
    }

    public void increaseCurrentHealthPoints(Integer increaseBy){
        currentHealthPoints += increaseBy;
        if (currentHealthPoints > maxHealthPoints){
            currentHealthPoints = maxHealthPoints;
        }
    }
    public void decreaseCurrentHealthPoints(Integer decreaseBy){
       currentHealthPoints -= decreaseBy;
       if (currentHealthPoints < 0){
           currentHealthPoints = 0;
       }
    }


}

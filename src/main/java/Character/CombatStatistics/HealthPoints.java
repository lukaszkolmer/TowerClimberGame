package Character.CombatStatistics;

public class HealthPoints {

    private Integer maxHealthPoints;
    private Integer currentHealthPoints;

    public HealthPoints(Integer maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    void setMaxHealthPoints(Integer maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
        currentHealthPoints = maxHealthPoints;
    }

    Integer getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void maxHealthPointsUpdater(){
        this.maxHealthPoints = 10;
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

package Character.BaseStatistics;

public class Endurance {
    private Integer enduranceValue = 20;

    public Integer getEnduranceValue() {
        return enduranceValue;
    }

    public void setEnduranceValue(Integer enduranceValue) {
        this.enduranceValue = enduranceValue;
    }
    public void enduranceDecreaseBy(Integer decreaseBy){
        enduranceValue -= decreaseBy;
        if (enduranceValue < 0){
            setEnduranceValue(0);
        }
    }
    public void enduranceIncreaseBy(Integer increaseBy){
        enduranceValue+= increaseBy;
    }
}

package Character.BaseStatistics;

public class Strength {
    private Integer strengthValue = 20;


    public Integer getStrengthValue() {
        return strengthValue;
    }

    public void setStrengthValue(Integer strengthValue) {
        this.strengthValue = strengthValue;
    }
    public void strengthDecreaseBy(Integer decreaseBy){
        strengthValue -= decreaseBy;
        if (strengthValue < 0){
            setStrengthValue(0);
        }
    }
    public void strengthIncreaseBy(Integer increaseBy){
        strengthValue+= increaseBy;
    }
}

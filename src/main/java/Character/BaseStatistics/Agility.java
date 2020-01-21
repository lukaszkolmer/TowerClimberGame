package Character.BaseStatistics;

public class Agility {

    private int agilityValue;

    public Integer getAgilityValue() {
        return agilityValue;
    }

    public void setAgilityValue(Integer agilityValue) {
        this.agilityValue = agilityValue;
    }

    public void agilityDecreaseBy(Integer decreaseBy){
        agilityValue -= decreaseBy;
        if (agilityValue < 0){
            setAgilityValue(0);
        }
    }
    public void agilityIncreaseBy(Integer increaseBy){
        agilityValue+= increaseBy;
    }
}

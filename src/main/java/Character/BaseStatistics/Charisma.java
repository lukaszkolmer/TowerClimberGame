package Character.BaseStatistics;

public class Charisma {
    private Integer charismaValue = 1;

    public Integer getCharismaValue() {
        return charismaValue;
    }

    public void setCharismaValue(Integer charismaValue) {
        this.charismaValue = charismaValue;
    }
    public void charismaDecreaseBy(Integer decreaseBy){
        charismaValue -= decreaseBy;
        if (charismaValue < 0){
            setCharismaValue(0);
        }
    }
    public void charismaIncreaseBy(Integer increaseBy){
        charismaValue+= increaseBy;
    }
}

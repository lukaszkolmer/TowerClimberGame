package Character.BaseStatistics;

public class Intelligence {
    private Integer intelligenceValue = 1;


    public Integer getIntelligenceValue() {
        return intelligenceValue;
    }

    public void setIntelligenceValue(Integer intelligenceValue)
    {
        this.intelligenceValue = intelligenceValue;
    }
    public void intelligenceDecreaseBy(Integer decreaseBy){
        intelligenceValue -= decreaseBy;
        if (intelligenceValue < 0){
            setIntelligenceValue(0);
        }
    }
    public void intelligenceIncreaseBy(Integer increaseBy){
        intelligenceValue+= increaseBy;
    }
}

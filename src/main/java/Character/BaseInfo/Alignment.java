package Character.BaseInfo;

public class Alignment {
    private Integer alignmentValue = 0;
    private String generalDescription;

    public Integer getAlignmentValue() {
        return alignmentValue;
    }

    public void setAlignmentValue(Integer alignmentValue) {
        this.alignmentValue = alignmentValue;
    }

    public String getGeneralDescription() {
        return generalDescription;
    }

    public void setGeneralDescription(String generalDescription) {
        this.generalDescription = generalDescription;
    }

    public void checkWhatIsAlignment(){
        if (alignmentValue == 0){
            setGeneralDescription("Neutral");
        }
        else if(alignmentValue >= 25 && alignmentValue <50){
            setGeneralDescription("Somewhat good");
        }
        else if (alignmentValue >= 50){
            setGeneralDescription("Good");
        }
        else if (alignmentValue < 0 && alignmentValue >= -25){
            setGeneralDescription("Somewhat Evil");
        }
        else {
            setGeneralDescription("Evil");
        }
    }
}

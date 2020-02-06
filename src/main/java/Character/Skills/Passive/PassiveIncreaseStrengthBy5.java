package Character.Skills.Passive;
import Character.CustomCharacter;
import Character.Skills.PassivlyWorkingSpells;


public class PassiveIncreaseStrengthBy5 extends PassiveSkill implements PassivlyWorkingSpells {

    public String name = "Passive lesser strength";
    private boolean isCurrentlyActive = false;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return "Passive skill that increases character strength by 5";
    }

    @Override
    public boolean isCurrentlyActive() {
        return isCurrentlyActive;
    }

    public void apply(CustomCharacter customCharacter) {
        customCharacter.getBaseStatistics().getStrength().strengthIncreaseBy(5);
        isCurrentlyActive = true;
    }


    public void unApply(CustomCharacter customCharacter) {
        customCharacter.getBaseStatistics().getStrength().strengthDecreaseBy(5);
        isCurrentlyActive = false;
    }
}

package Character.Skills.Passive;

public abstract class PassiveSkill {

    private String name;
    private String description;
    private boolean isCurrentlyActive;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCurrentlyActive() {
        return isCurrentlyActive;
    }
}

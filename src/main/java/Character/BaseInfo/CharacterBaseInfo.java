package Character.BaseInfo;

public class CharacterBaseInfo {
    public Name name;
    public Level level;
    public Gender gender;
    public Alignment alignment;
    public Race race;


    public CharacterBaseInfo(Name name, Level level, Gender gender, Alignment alignment, Race race) {
        this.name = name;
        this.level = level;
        this.gender = gender;
        this.alignment = alignment;
        this.race = race;
    }

    @Override
    public String toString() {
        return "Your name is " + name.getName() + "\n "+ race + "\n " + gender + "\n " + level;
    }
}

package Character.BaseInfo;

public class CharacterBaseInfo {
    private Name name;
    private Level level;
    private Gender gender;
    private Alignment alignment;
    private Race race;

    public Name getName() {
        return name;
    }

    public Level getLevel() {
        return level;
    }

    public Gender getGender() {
        return gender;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public Race getRace() {
        return race;
    }

    private CharacterBaseInfo(Name name, Gender gender, Race race) {
        this.name = name;
        this.gender = gender;
        this.race = race;
    }

    public static CharacterBaseInfo createCharacterBaseinfo(){
        Level level = new Level();
        Alignment alignment = new Alignment();
        Name name  = new Name();
        name.whatIsCharacterName();
        Gender gender = new Gender();
        gender.whatIsCharacterGender();
        Race race = new Race();
        race.whatIsCharacterRace();
        return new CharacterBaseInfo(name,gender,race);
    }
}

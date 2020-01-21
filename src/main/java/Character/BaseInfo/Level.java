package Character.BaseInfo;

public class Level {
    private Integer characterLevel = 1;
    private Integer experience = 0;
    private Integer experienceNeededToLevelUp = 200;
    public Integer getExperience() {
        return experience;
    }

    public Integer getCharacterLevel() {
        return characterLevel;

    }

    public void experienceGained(Integer experienceGained){
        experience += experienceGained;
        checkIfLevelUp();
    }

    private void checkIfLevelUp() {
        if (experience >= experienceNeededToLevelUp) {
            characterLevel += 1;
            experience = experience - experienceNeededToLevelUp;
            experienceNeededToLevelUp += 100;
            System.out.println("Level Up!");
        }
    }

    @Override
    public String toString() {
        return "Level : " + characterLevel + "\n Current Exp: " + experience + "\n Experience needed for" +
                " level up: " + experienceNeededToLevelUp;
    }
}

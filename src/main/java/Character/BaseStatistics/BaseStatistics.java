package Character.BaseStatistics;

public class BaseStatistics {
    private Agility agility;
    private Charisma charisma;
    private Endurance endurance;
    private Intelligence intelligence;
    private Strength strength;
    private static BaseStatistics instance;

    private BaseStatistics(){}

    public static BaseStatistics getInstance(){
        if(instance == null){
            instance = new BaseStatistics();
        }
        return instance;}

    public BaseStatistics(Agility agility, Charisma charisma, Endurance endurance, Intelligence intelligence, Strength strength) {
        this.agility = agility;
        this.charisma = charisma;
        this.endurance = endurance;
        this.intelligence = intelligence;
        this.strength = strength;
    }

    public Agility getAgility() {
        return agility;
    }

    public Charisma getCharisma() {
        return charisma;
    }

    public Endurance getEndurance() {
        return endurance;
    }

    public Intelligence getIntelligence() {
        return intelligence;
    }

    public Strength getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "\nStats:\n Agility: " + agility.getAgilityValue() + " \n Charisma: " + charisma.getCharismaValue() + " \n Endurance: " + endurance.getEnduranceValue() +
                " \n Intelligence: " + intelligence.getIntelligenceValue() + " \n Strength: " + strength.getStrengthValue();

    }
}

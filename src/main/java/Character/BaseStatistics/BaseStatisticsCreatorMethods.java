package Character.BaseStatistics;

public class BaseStatisticsCreatorMethods {

    public Agility generateAgility(Integer agilityValue){
        Agility agility = new Agility();
        agility.setAgilityValue(agilityValue);
        return agility;
    }

    public Strength generateStrength(Integer strengthValue){
        Strength strength = new Strength();
        strength.setStrengthValue(strengthValue);
        return strength;
    }

    public Intelligence generateIntelligence(Integer intelligenceValue) {
        Intelligence intelligence = new Intelligence();
        intelligence.setIntelligenceValue(intelligenceValue);
        return intelligence;
    }

    public Endurance generateEndurance(Integer enduranceValue){
        Endurance endurance = new Endurance();
        endurance.setEnduranceValue(enduranceValue);
        return endurance;
    }

    public Charisma generateCharisma(Integer charismaValue) {
        Charisma charisma = new Charisma();
        charisma.setCharismaValue(charismaValue);
        return charisma;
    }


}

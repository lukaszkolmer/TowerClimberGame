package Character.Races;

import Character.BaseStatistics.BaseStatistics;
import Character.BaseStatistics.BaseStatisticsCreatorMethods;

public class Human {

    public String getRaceName() {
        return "Human";
    }

    public String getDescription() {
        return "Well, most boring race to play in fantasy universe.";
    }

    public BaseStatistics generateBaseHumanStatistics(){
        BaseStatisticsCreatorMethods creatorMethods = new BaseStatisticsCreatorMethods();
        return new BaseStatistics(creatorMethods.generateAgility(20),creatorMethods.generateCharisma(20),
                creatorMethods.generateEndurance(20), creatorMethods.generateIntelligence(20),creatorMethods.generateStrength(20));
    }
}

package Character.Races;

import Character.BaseStatistics.BaseStatistics;
import Character.BaseStatistics.BaseStatisticsCreatorMethods;

public class Elf {
    public String getRaceName() {
        return "Elf";
    }

    public String getDescription() {
        return "Pointy ears, likes trees. Most overused fantasy race.";
    }

    public BaseStatistics generateBaseElfStatistics(){
        BaseStatisticsCreatorMethods creatorMethods = new BaseStatisticsCreatorMethods();
        return new BaseStatistics(creatorMethods.generateAgility(25),creatorMethods.generateCharisma(25),
                creatorMethods.generateEndurance(10), creatorMethods.generateIntelligence(20),creatorMethods.generateStrength(10));
    }
}

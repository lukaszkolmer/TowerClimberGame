package Character.Races;

import Character.BaseStatistics.BaseStatistics;
import Character.BaseStatistics.BaseStatisticsCreatorMethods;

public class Dwarf {
    public String getRaceName() {
        return "Dwarf";
    }

    public String getDescription() {
        return "Lang beard, kinda wee, loch his axe bit tae much.";
    }

    public BaseStatistics generateBaseElfStatistics(){
        BaseStatisticsCreatorMethods creatorMethods = new BaseStatisticsCreatorMethods();
        return new BaseStatistics(creatorMethods.generateAgility(5),creatorMethods.generateCharisma(10),
                creatorMethods.generateEndurance(25), creatorMethods.generateIntelligence(15),creatorMethods.generateStrength(25));
    }
}

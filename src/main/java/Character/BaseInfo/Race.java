package Character.BaseInfo;

import Character.BaseStatistics.BaseStatistics;
import Character.Races.RaceList;

import java.util.Scanner;

public class Race {
    private String raceName;
    private String raceDescription;
    private BaseStatistics baseStatistics;

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public String getRaceDescription() {
        return raceDescription;
    }

    public void setRaceDescription(String raceDescription) {
        this.raceDescription = raceDescription;
    }

    public void setBaseStatistics(BaseStatistics baseStatistics) {
        this.baseStatistics = baseStatistics;
    }

    public BaseStatistics getBaseStatistics() {
        return baseStatistics;
    }



    @Override
    public String toString() {
        return "You are " + getRaceName();
    }
}
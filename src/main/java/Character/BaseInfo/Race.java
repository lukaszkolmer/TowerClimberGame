package Character.BaseInfo;

import Character.BaseStatistics.BaseStatistics;
import Character.Races.RaceList;

import java.util.Scanner;

public class Race {
    private String raceName;
    private String raceDescription;
    private BaseStatistics baseStatistics;
    private RaceList raceList = new RaceList();

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

    public Race whatIsCharacterRace() {
        Race race = new Race();
        Scanner scanner = new Scanner(System.in);
        int allDone = 0;
        System.out.println("What is your race?\n 1 - Human(only this works now)\n 2 - Elf \n 3 - Dwarf\n 0 - back");
        do {
            switch (scanner.nextInt()) {
                case 1: {
                    race.setRaceName(raceList.human.getRaceName());
                    race.setRaceDescription(raceList.human.getDescription());
                    race.setBaseStatistics(raceList.human.generateBaseHumanStatistics());
                    allDone++;
                    break;
                }
                case 2: {
                    System.out.println("later");
                    allDone++;
                    break;

                }
                case 0:{
                    allDone++;
                }
            }
        }
        while (allDone==0);
        return race;
    }

    @Override
    public String toString() {
        return "You are " + getRaceName();
    }
}
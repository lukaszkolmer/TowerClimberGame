package Character.BaseInfo;

import Character.Races.RaceList;
import MiscMethods.UserGiveInput;

import java.util.Scanner;

public class CharacterBaseInfoCreationMethods {
    private UserGiveInput userGiveInput = new UserGiveInput();

    private RaceList raceList = new RaceList();
    public Gender whatIsCharacterGender() {
        int allDone = 0;
        Scanner scanner = new Scanner(System.in);
        Gender gender = new Gender();
        System.out.println("What is your gender? \n 1 - Female\n 2 - Male");
        do {
            switch (userGiveInput.userGiveIntFromRange(1,2)) {
                case 1: {
                    gender.setGender("Female");
                    allDone++;
                    break;
                }
                case 2: {
                    gender.setGender("Male");
                    allDone++;
                    break;
                }
            }
        }
        while ( allDone == 0);
        return gender;
    }
    public Name whatIsCharacterName() {
        int setProperly = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your character name?");
        Name name = new Name();
        name.setName(scanner.nextLine());
        while(setProperly == 0)
        {
            if (!name.getName().matches("[a-zA-Z]+")) {
                //Check if it has anything other than letters
                System.out.println("Letters only");
                name.setName(scanner.nextLine());

            }
             else if (name.getName().length()>20){
                System.out.println("Name is to long. Max size is 20");
                name.setName(scanner.nextLine());
            }
             else setProperly++;
        }
        return name;
    }
    public Race whatIsCharacterRace() {
        Race race = new Race();
        Scanner scanner = new Scanner(System.in);
        int allDone = 0;
        System.out.println("What is your race?\n 1 - Human\n 2 - Elf\n 3 - Dwarf");

        do {
            int playerChoice = userGiveInput.userGiveIntFromRange(1,3);
            boolean playerChoseCorrectly = false;
            do{
            if (playerChoice != 1 &&playerChoice !=2 &&playerChoice !=3){
                System.out.println("Please chose correct race");
                System.out.println("\n 1 - Human\n 2 - Elf\n 3 - Dwarf");
                playerChoice = userGiveInput.userGiveIntFromRange(1,3);
            }
            else {playerChoseCorrectly = true;}
            }
            while (!playerChoseCorrectly);
            switch (playerChoice) {
                case 1: {
                    race.setRaceName(raceList.human.getRaceName());
                    race.setRaceDescription(raceList.human.getDescription());
                    race.setBaseStatistics(raceList.human.generateBaseHumanStatistics());
                    allDone++;
                    break;
                }
                case 2: {
                    race.setRaceName(raceList.elf.getRaceName());
                    race.setRaceDescription(raceList.elf.getDescription());
                    race.setBaseStatistics(raceList.elf.generateBaseElfStatistics());
                    allDone++;
                    break;

                }case 3: {
                    race.setRaceName(raceList.dwarf.getRaceName());
                    race.setRaceDescription(raceList.dwarf.getDescription());
                    race.setBaseStatistics(raceList.dwarf.generateBaseElfStatistics());
                    allDone++;
                    break;

                }
            }
        }
        while (allDone==0);
        return race;
    }

    public CharacterBaseInfo createCharacterBaseInfo(){
        Level level = new Level();
        Alignment alignment = new Alignment();
        Name name  = whatIsCharacterName();
        Gender gender = whatIsCharacterGender();
        Race race = whatIsCharacterRace();
        return new CharacterBaseInfo(name,level,gender,alignment,race);
    }
}

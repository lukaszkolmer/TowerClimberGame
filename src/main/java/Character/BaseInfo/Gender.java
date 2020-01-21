package Character.BaseInfo;

import java.util.Scanner;

public class Gender {
    private String gender;

    public String getGender() {
        return gender;
    }



    private void setGender(String gender) {
        this.gender = gender;
    }

    public Gender whatIsCharacterGender() {
        int allDone = 0;
        Scanner scanner = new Scanner(System.in);
        Gender gender = new Gender();
        System.out.println("What is your gender? \n 1 - Female\n 2 - Male\n 0 - back");
        do {
                switch (scanner.nextInt()) {
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
                    case 0:{
                        allDone++;
                        break;
                    }
                }
        }
        while ( allDone == 0);
        return gender;
    }

    @Override
    public String toString() {
        return "You are " + gender;
    }
}
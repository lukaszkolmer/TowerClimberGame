package MiscMethods;


import java.util.Scanner;

public class UserGiveInput {
    private Scanner scanner = new Scanner(System.in);

    public int userGiveSingleInt() {
        int numberGiven = 0;
        boolean inputCorrect = false;
        do {
            if (scanner.hasNextInt()){
                numberGiven = scanner.nextInt();
                inputCorrect = true;
            }
            else {
                System.out.println("Invalind input. Please give correct number.");
                scanner.nextLine();
            }
        }
        while (!inputCorrect);
        return numberGiven;
    }

    public int userGiveIntFromRange(int minValue, int maxValue){
            int numberGiven = 0;
            boolean inputCorrect = false;
            do {
                if (scanner.hasNextInt()){
                    numberGiven = scanner.nextInt();
                    if (numberGiven >= minValue && numberGiven <= maxValue) {
                        inputCorrect = true;
                    }
                    else {
                        System.out.println("You've chosen invalid option. Please pick correct number from " + minValue + " to " + maxValue);
                        scanner.nextLine();
                    }
                }
                else {
                    System.out.println("Invalind input. Please give correct number.");
                    scanner.nextLine();
                }
            }
            while (!inputCorrect);
            return numberGiven;
    }
}

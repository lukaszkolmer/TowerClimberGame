package Character.BaseInfo;

import java.util.Scanner;

public class Name {
    private String name;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Name whatIsCharacterName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your character name?");
        Name name = new Name();
        name.setName(scanner.nextLine());
        while(!name.getName().matches("[a-zA-Z]+"))
        {
            //Check if it has anything other than alphabets
            System.out.println("Letters only");
            name.setName(scanner.nextLine());

        }
        return name;
    }



    @Override
    public String toString() {
        return "Your name is: " + name;
    }
}

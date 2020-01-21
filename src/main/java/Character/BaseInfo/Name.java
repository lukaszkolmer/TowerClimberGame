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



    @Override
    public String toString() {
        return "Your name is: " + name;
    }
}

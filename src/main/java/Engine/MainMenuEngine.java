package Engine;

import MiscMethods.SupportingMethods;
import Character.CustomCharacter;
public class MainMenuEngine {
    private SupportingMethods supportingMethods = new SupportingMethods();

    public void MainMenu(CustomCharacter customCharacter) {
        clearConsole();
        boolean gameShouldWork = true;
        do {
            System.out.println("1 - Explore(not working now dont click me baka) \n 2 - Character info(also no, baka)\n 3 - Inventory \n 0 - Save and exit(no, baka)");
            int playerChoice = supportingMethods.getUserGiveInput().userGiveIntFromRange(0,3);
            switch (playerChoice){
                case 1:{
                    System.out.println("obviously i cannot read.");
                    break;
                }
                case 2:{
                    System.out.println("english is beyond my comprehension - Kristoff 2020");
                    break;
                }
                case 3:{
                    InventoryEngine inventoryEngine = new InventoryEngine();
                    inventoryEngine.inventoryMenu(customCharacter);
                    break;
                }
                case 0:{
                    System.out.println("Exiting game. Baka.");
                    gameShouldWork = false;
                    break;
                }
            }

        }
        while (gameShouldWork);
    }
    private void clearConsole() {
        supportingMethods.getClearConsole().clearConsole();
    }
}

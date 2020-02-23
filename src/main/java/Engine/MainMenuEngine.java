package Engine;

import MiscMethods.SupportingMethods;
import Character.CustomCharacter;
public class MainMenuEngine {
    private SupportingMethods supportingMethods = new SupportingMethods();

    public void MainMenu(CustomCharacter customCharacter) {
        clearConsole();
        boolean gameShouldWork = true;
        do {
            System.out.println(" 1 - Explore(not working  dont click me ) \n 2 - Character info(also no)\n 3 - Inventory \n 0 - Save and exit(not saving yet)");
            int playerChoice = supportingMethods.getUserGiveInput().userGiveIntFromRange(0,3);
            switch (playerChoice){
                case 1:{
                    System.out.println("obviously i cannot read. - user");
                    break;
                }
                case 2:{
                    System.out.println("english is beyond my comprehension - user");
                    break;
                }
                case 3:{
                    InventoryEngine inventoryEngine = new InventoryEngine();
                    inventoryEngine.inventoryMenu(customCharacter);
                    break;
                }
                case 0:{
                    System.out.println("Exiting game.");
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

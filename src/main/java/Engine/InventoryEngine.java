package Engine;

import Character.CustomCharacter;
import MiscMethods.SupportingMethods;

import java.util.Scanner;

public class InventoryEngine {
    private Scanner scanner = new Scanner(System.in);
    private SupportingMethods supportingMethods = new SupportingMethods();

    public void inventoryMenu(CustomCharacter customCharacter) {

        boolean doneWithInventory = false;
        int playerChoice;
        do {
            clearConsole();
            System.out.println("Inventory menu:\n 1 - Show equipped items\n 2 - Show unequipped items \n 0 - Exit");
            playerChoice = supportingMethods.getUserGiveInput().userGiveIntFromRange(0, 2);
            switch (playerChoice) {
                case 1: {
                    boolean doneWithShowEquippedItems = false;
                    do {
                        clearConsole();
                        customCharacter.getInventory().printEquippedItems();
                        System.out.println("\n 1 - Check item \n 2 - Unequip item\n 3 - Drop item \n 0 - Go back");
                        switch (supportingMethods.getUserGiveInput().userGiveIntFromRange(0, 3)) {
                            case 1: {
                                clearConsole();
                                System.out.println("Which item to look at?");
                                customCharacter.getInventory().printEquippedItems();
                                int itemSelected = supportingMethods.getUserGiveInput().userGiveIntFromRange(0, customCharacter.getInventory().getEquippedItemList().size()) - 1;
                                if (itemSelected == -1) {
                                    break;
                                } else {
                                    System.out.println(customCharacter.getInventory().getEquippedItemList().get(itemSelected));
                                    break;
                                }
                            }
                            case 2: {
                                clearConsole();
                                System.out.println("Unequip which item?");
                                customCharacter.getInventory().printEquippedItems();
                                int itemToUnequip = supportingMethods.getUserGiveInput().userGiveIntFromRange(0, customCharacter.getInventory().getEquippedItemList().size()) + -1;
                                if (itemToUnequip == -1) {
                                    break;
                                } else {
                                    customCharacter.getInventory().addToUnequippedInventory(customCharacter.getInventory().getEquippedItemList().get(itemToUnequip));
                                    break;
                                }
                            }
                            case 3: {
                                clearConsole();
                                System.out.println("Drop which item?");
                                customCharacter.getInventory().printEquippedItems();
                                int itemToDrop = supportingMethods.getUserGiveInput().userGiveIntFromRange(0, customCharacter.getInventory().getEquippedItemList().size()) - 1;
                                if (itemToDrop == -1) {
                                    break;
                                } else {
                                    customCharacter.getInventory().dropEquippedItem(customCharacter.getInventory().getEquippedItemList().get(itemToDrop));
                                    break;
                                }
                            }
                            case 0: {
                                doneWithShowEquippedItems = true;
                                break;
                            }
                        }

                    }
                    while (!doneWithShowEquippedItems);
                    break;
                }
                case 2: {
                    boolean doneWithUnequippedItems = false;
                    do {
                        clearConsole();
                        customCharacter.getInventory().printUnEquippedItems();
                        System.out.println("\n 1 - Check item \n 2 - Equip item\n 3 - Drop item \n 0 - Go back");
                        switch (supportingMethods.getUserGiveInput().userGiveIntFromRange(0, 3)) {
                            case 1: {
                                clearConsole();
                                System.out.println("Which item to look at?");
                                customCharacter.getInventory().printUnEquippedItems();
                                int itemSelected = supportingMethods.getUserGiveInput().userGiveIntFromRange(0, customCharacter.getInventory().getUnequippedItemList().size()) - 1;
                                if (itemSelected == -1) {
                                    break;
                                } else {
                                    System.out.println(customCharacter.getInventory().getUnequippedItemList().get(itemSelected));
                                    break;
                                }
                            }
                            case 2: {
                                clearConsole();
                                System.out.println("Unequip which item?");
                                customCharacter.getInventory().printUnEquippedItems();
                                int itemToUnequip = supportingMethods.getUserGiveInput().userGiveIntFromRange(0, customCharacter.getInventory().getEquippedItemList().size()) - 1;
                                if (itemToUnequip == -1) {
                                    break;
                                } else {
                                    customCharacter.getInventory().addToEquippedItemList(customCharacter.getInventory().getUnequippedItemList().get(itemToUnequip));
                                }
                                break;
                            }
                            case 3: {
                                clearConsole();
                                System.out.println("Drop which item?");
                                customCharacter.getInventory().printUnEquippedItems();
                                int itemToDrop = supportingMethods.getUserGiveInput().userGiveIntFromRange(0, customCharacter.getInventory().getEquippedItemList().size()) - 1;
                                if (itemToDrop == -1) {
                                    break;
                                } else {
                                    customCharacter.getInventory().dropUnequippedItem(customCharacter.getInventory().getUnequippedItemList().get(itemToDrop));
                                    break;
                                }
                            }
                            case 0: {
                                doneWithUnequippedItems = true;
                                break;
                            }
                        }

                    }
                    while (!doneWithUnequippedItems);
                    break;
                }
                case 0: {
                    doneWithInventory = true;
                    break;
                }
            }
        }
        while (!doneWithInventory);
    }

    private void clearConsole() {
        supportingMethods.getClearConsole().clearConsole();
    }
}

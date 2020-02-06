package Character.Inventory;

import Item.Armor.Armor;
import Item.Item;
import MiscMethods.SupportingMethods;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;


public class Inventory {
    private List<Item> EquippedItemList;
    private List<Item> UnequippedItemList;
    private Integer armorValue;
    SupportingMethods supportingMethods = new SupportingMethods();

    public Integer getArmorValue() {
        return armorValue;
    }

    public Inventory(List<Item> equippedItemList, List<Item> unequippedItemList) {
        EquippedItemList = equippedItemList;
        UnequippedItemList = unequippedItemList;
    }

    Scanner scanner = new Scanner(System.in);

    public List<Item> getEquippedItemList() {
        return EquippedItemList;
    }

    public List<Item> getUnequippedItemList() {
        return UnequippedItemList;
    }

    public void addToEquippedItemList(Item itemToEquip) {



        Item currentlyEquippedItem = null;
        boolean addingFinished = false;
        do {
            for (Item equippedItem : getEquippedItemList()) {
                if (itemToEquip.getItemType().equals(equippedItem.getItemType())) {
                    currentlyEquippedItem = equippedItem;
                    }
                }
                if (currentlyEquippedItem != null && !addingFinished) {
                    System.out.println(currentlyEquippedItem.getName() + " is equipped. Equip " + itemToEquip.getName() + "?\n 1 - Yes \n 2 - No");
                    switch (supportingMethods.getUserGiveInput().userGiveIntFromRange(1, 2)) {
                        case 1: {
                            addToUnequippedInventory(currentlyEquippedItem);
                            getEquippedItemList().add(itemToEquip);
                            getUnequippedItemList().remove(itemToEquip);
                            System.out.println("Unequipped " + currentlyEquippedItem.getName() + " and equipped " + itemToEquip.getName());
                            addingFinished = true;
                            break;
                        }
                        case 2: {
                            break;
                        }
                    }
                }
                else{
                    getEquippedItemList().add(itemToEquip);
                    addingFinished = true;
                }
        }
            while (!addingFinished);
    }


    public void addToUnequippedInventory(Item itemToAddToUnequipped) {
        boolean addingFinished = false;
        do {
            if (getUnequippedItemList().size() <= 11) {
                getUnequippedItemList().add(itemToAddToUnequipped);
                getEquippedItemList().remove(itemToAddToUnequipped);
                addingFinished = true;
            } else {
                System.out.println("Inventory is full.Do you want to drop other item to make space for " + itemToAddToUnequipped.getName() + "?\n 1 - Yes \n 2 - No");
                switch (supportingMethods.getUserGiveInput().userGiveIntFromRange(1,2)) {
                    case 1: {
                        int temp = 1;
                        int itemToDrop;
                        boolean chosenItemProperly = false;
                        System.out.println("Switch " + itemToAddToUnequipped.getName() + " with which item? 0 to cancel");
                        printUnEquippedItems();
                        itemToDrop = supportingMethods.getUserGiveInput().userGiveIntFromRange(0,getUnequippedItemList().size()) - 1;

                        if (itemToDrop != -1) {
                            Item tempItem = getUnequippedItemList().get(itemToDrop);
                            getUnequippedItemList().remove(itemToDrop);
                            getUnequippedItemList().add(itemToAddToUnequipped);
                            addingFinished = true;
                            System.out.println("Switched " + itemToAddToUnequipped.getName() + " for " + tempItem.getName());
                            break;

                        } else {
                            break;
                        }
                    }
                    case 2: {
                        System.out.println("Do you want to drop " + itemToAddToUnequipped.getName() + "? \n 1 - Yes \n 2 - No");
                        switch (scanner.nextInt()) {
                            case 1: {
                                getUnequippedItemList().add(itemToAddToUnequipped);
                                getUnequippedItemList().remove(itemToAddToUnequipped);
                                addingFinished = true;
                                break;
                            }
                            case 2: {
                                break;
                            }
                        }

                    }
                }
            }
        }
        while (!addingFinished);
    }

    public void dropUnequippedItem(Item itemToDrop) {
        getUnequippedItemList().remove(itemToDrop);
        System.out.println(itemToDrop.getName() + " dropped.");
    }

    public void dropEquippedItem(Item itemToDrop) {
        getEquippedItemList().remove(itemToDrop);
        System.out.println(itemToDrop.getName() + " dropped.");
    }

    public void printEquippedItems() {
        int temp = 1;
        for (Item item : getEquippedItemList()) {
            System.out.println(temp + ". " + item);
            temp++;
        }
    }

    public void printUnEquippedItems() {
        int temp = 1;
        for (Item item : getUnequippedItemList()) {
            System.out.println(temp + ". " + item);
            temp++;
        }
    }
    public Integer giveArmorValueFromEquippedItems(){
        Integer tempArmorValue =0;
        for (Item item: getEquippedItemList()) {
            if (item instanceof Armor){
                tempArmorValue += ((Armor) item).getArmorValue();
            }
        }
        return tempArmorValue;
    }
}

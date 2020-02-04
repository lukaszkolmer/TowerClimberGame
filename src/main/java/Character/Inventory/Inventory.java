package Character.Inventory;

import Item.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Inventory {
    private List<Item> EquippedItemList = new ArrayList<Item>();
    private List<Item> UnequippedItemList = new ArrayList<Item>();

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
        boolean addingFinished = false;
        do{
        for (Item equippedItem : getEquippedItemList()) {
            if (itemToEquip.getItemType().equals(equippedItem.getItemType())) {
                Item currentlyEquipppedItem = equippedItem;
                System.out.println(currentlyEquipppedItem.getName() + " is equipped. Equip " + itemToEquip.getName() + "?\n 1 - Yes \n 2 - No");
                switch (scanner.nextInt()) {
                    case 1: {
                        addToUnequippedInventory(currentlyEquipppedItem);
                        getEquippedItemList().add(itemToEquip);
                        System.out.println("Unequipped " + currentlyEquipppedItem.getName()+" and equipped " + itemToEquip.getName());
                        addingFinished = true;
                        break;
                    }
                    case 2:{break;}
                }
            }
        }
        }
        while (!addingFinished);
    }

    public void addToUnequippedInventory(Item itemToAddToUnequipped) {
        boolean addingFinished = false;
        do {
            if (getUnequippedItemList().size() < 11) {
                getUnequippedItemList().add(itemToAddToUnequipped);
            } else {
                System.out.println("Inventory is full.Do you want to drop other item to make space for " + itemToAddToUnequipped.getName() + "?\n 1 - Yes \n 2 - No");
                switch (scanner.nextInt()) {
                    case 1: {
                        int temp = 0;
                        int itemToDrop;
                        boolean chosenItemProperly = false;
                        System.out.println("Switch " + itemToAddToUnequipped.getName() + " with which item? 0 to cancel");
                        for (Item item : getUnequippedItemList()) {
                            System.out.println(temp + 1 + ". " + item.getName());
                            temp++;
                        }
                        do {
                        itemToDrop = scanner.nextInt() -1;
                        if (itemToDrop < 0 || itemToDrop > temp+1) {

                                System.out.println("Please chose correct item");
                                itemToDrop = scanner.nextInt();
                        }
                        else {chosenItemProperly = true;}
                        }
                        while (!chosenItemProperly);
                        Item tempItem = getUnequippedItemList().get(itemToDrop);
                        if (scanner.nextInt() != 0) {
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

    public void dropEquippedItem(Item itemToDrop){
        getEquippedItemList().remove(itemToDrop);
        System.out.println(itemToDrop.getName() + " dropped.");
    }

    public void printEquippedItems(){
        int temp = 1;
        for (Item item: getEquippedItemList()) {
            System.out.println(temp +". " +item);
            temp++;
        }
    }
    public void printUnEquippedItems(){
        int temp = 1;
        for (Item item: getUnequippedItemList()) {
            System.out.println(temp +". " +item);
            temp++;
        }
    }
}

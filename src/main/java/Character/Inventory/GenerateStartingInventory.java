package Character.Inventory;


import Item.Item;
import Item.ItemsDatabase;

import java.util.ArrayList;
import java.util.List;

public class GenerateStartingInventory {

    public Inventory generateStartingInventory(){
        ItemsDatabase itemsDatabase = new ItemsDatabase();
        List<Item> equippedItemList = new ArrayList<Item>();
        List<Item> unequippedItemList = new ArrayList<Item>();


        equippedItemList.add(itemsDatabase.getBootsDatabase().getBootsSteel());
        equippedItemList.add(itemsDatabase.getChestDatabase().getChestSteel());
        equippedItemList.add(itemsDatabase.getGlovesDatabase().getGlovesSteel());
        equippedItemList.add(itemsDatabase.getHelmetDatabase().getHelmetSteel());
        equippedItemList.add(itemsDatabase.getLegsDatabase().getLegsSteel());
        equippedItemList.add(itemsDatabase.getShieldDatabase().getShieldMediumWooden());
        equippedItemList.add(itemsDatabase.getTrinketDatabase().getTrinketStrengthIncreaseByFive());
        equippedItemList.add(itemsDatabase.getOneHandedSwordsDatabase().getOneHandSwordsShort());

        unequippedItemList.add(itemsDatabase.getHelmetDatabase().getHelmetSteel());
        unequippedItemList.add(itemsDatabase.getOneHandedSwordsDatabase().getOneHandSwordsShort());

        return new Inventory(equippedItemList,unequippedItemList);
    }
}

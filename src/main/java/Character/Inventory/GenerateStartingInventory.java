package Character.Inventory;


import Item.Item;
import Item.ItemsDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class GenerateStartingInventory {

    public Inventory createStartingEquipment(){
        ItemsDatabase itemsDatabase = new ItemsDatabase();
        List<Item> equippedItemList = new CopyOnWriteArrayList<Item>();
        List<Item> unequippedItemList = new CopyOnWriteArrayList<Item>();


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

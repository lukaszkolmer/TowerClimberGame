package Item;

import Character.Inventory.Inventory;

public abstract class Item {
    private Integer durability;
    private ItemType itemType;
    private String name;
    private Enhancement Enhancement;
    public void equipItem(){}
    public void unEquipItem(){}

    public Integer getDurability() {
        return durability;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void increaseDurability(Integer increaseBy){
        durability += increaseBy;
        if (durability>100){
            durability = 100;
        }
    }
    public void decreaseDurability(Integer decreaseBy){
        durability -= decreaseBy;
        if (durability < 0){
            durability = 0;
        }
    }

    public String getName() {
        return name;
    }

    public Enhancement getEnhancement() {
        return Enhancement;
    }

    //abstract public void equip();
    public void equip(){
        Inventory inventory = Inventory.getInstance();
        for (Item item: inventory.getEquipeditemList()) {
            if ()
        }



    }
}

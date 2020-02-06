package Item;

public abstract class Item {
    public Integer durability;
    public ItemType itemType;
    public String name;
    public Enhancement Enhancement;
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
    /*public void equip(){
        Inventory inventory = Inventory.getInstance();
        for (Item item: inventory.getEquipeditemList()) {
            if ()
        }
    }*/
}

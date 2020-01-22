package Item;

public abstract class Item {
    private Integer durability;
    private ItemType itemType;

    public void equipItem(){}
    public void unEquipItem(){}

    public Integer getDurability() {
        return durability;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
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
}

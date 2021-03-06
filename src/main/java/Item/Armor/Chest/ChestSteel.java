package Item.Armor.Chest;

import Item.Armor.Armor;
import Item.ItemType;

public class ChestSteel extends Armor {
    private Integer durability = 100;
    private ItemType itemType = ItemType.Chest;
    private String name ="Steel armor chest ";
    private Integer armorValue = 25;

    @Override
    public Integer getDurability() {
        return durability;
    }

    @Override
    public ItemType getItemType() {
        return itemType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getArmorValue() {
        return armorValue;
    }
}


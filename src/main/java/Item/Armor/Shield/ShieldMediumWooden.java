package Item.Armor.Shield;

import Item.Armor.Armor;
import Item.ItemType;

public class ShieldMediumWooden extends Armor {
    private Integer durability = 100;
    private ItemType itemType = ItemType.ShieldMedium;
    private String name ="Wooden medium shield";
    private Integer armorValue = 10;

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

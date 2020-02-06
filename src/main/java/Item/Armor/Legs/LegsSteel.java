package Item.Armor.Legs;

import Item.Armor.Armor;
import Item.ItemType;

public class LegsSteel extends Armor {
    private Integer durability = 100;
    private ItemType itemType = ItemType.Legs;
    private String name ="Steel leg armor";
    private Integer armorValue = 20;

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

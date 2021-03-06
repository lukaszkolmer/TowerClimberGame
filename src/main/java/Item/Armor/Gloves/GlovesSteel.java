package Item.Armor.Gloves;

import Item.Armor.Armor;
import Item.ItemType;

public class GlovesSteel extends Armor {
    private Integer durability = 100;
    private ItemType itemType = ItemType.Gloves;
    private String name ="Steel gloves";
    private Integer armorValue = 15;

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

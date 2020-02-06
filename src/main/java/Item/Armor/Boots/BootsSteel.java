package Item.Armor.Boots;

import Item.Armor.Armor;
import Item.ItemType;

public class BootsSteel extends Armor {
    private Integer durability = 100;
    private ItemType itemType = ItemType.Boots;
    private String name ="Steel boots";
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

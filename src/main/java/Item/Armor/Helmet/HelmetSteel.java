package Item.Armor.Helmet;

import Item.Armor.Armor;
import Item.ItemType;

public class HelmetSteel extends Armor {
    private Integer durability = 100;
    private ItemType itemType = ItemType.Helmet;
    private String name ="Steel Helmet";
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


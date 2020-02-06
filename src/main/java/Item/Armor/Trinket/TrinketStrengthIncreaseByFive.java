package Item.Armor.Trinket;

import Item.Armor.Armor;
import Item.Enhancement;
import Item.ItemType;

public class TrinketStrengthIncreaseByFive extends Armor {
    private Integer durability = 100;
    private ItemType itemType = ItemType.ShieldMedium;
    private String name ="Small strength trinket";
    private Integer armorValue = 0;
    private Enhancement enhancement = Item.Enhancement.IncreaseStrengthBy5;

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

    @Override
    public Item.Enhancement getEnhancement() {
        return enhancement;
    }

    @Override
    public String toString() {
        return getName() + ". This item increases your strength by 5";
    }
}


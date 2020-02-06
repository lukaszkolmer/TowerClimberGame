package Item.Weapon.OneHandSwords;

import Item.ItemType;
import Item.Weapon.Weapon;

public class OneHandSwordsShort extends Weapon {
    private   Integer durability = 100;
    private  ItemType itemType = ItemType.Sword1H;
    private  String name = "Short sword";
    private  Integer damageValue = 5;

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
    public Integer getDamageValue() {
        return damageValue;
    }
}

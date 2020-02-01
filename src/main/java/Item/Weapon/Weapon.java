package Item.Weapon;

import Item.Item;

public abstract class Weapon extends Item {
    private Integer durability;
    private String itemType;
    private String name;
    private Integer damageValue;

    public Integer getDamageValue() {
        return damageValue;
    }

    public void setDamageValue(Integer damageValue) {
        this.damageValue = damageValue;
    }
}

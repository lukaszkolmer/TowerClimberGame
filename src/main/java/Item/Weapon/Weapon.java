package Item.Weapon;

import Item.Item;

public abstract class Weapon extends Item {
    private Integer damageValue;

    public Integer getDamageValue() {
        return damageValue;
    }

    public void setDamageValue(Integer damageValue) {
        this.damageValue = damageValue;
    }

    @Override
    public String toString() {
        return getName() + ". Damage Value: " + getDamageValue() +". Durability: " + getDurability();
    }
}

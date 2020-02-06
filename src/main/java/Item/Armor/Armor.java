package Item.Armor;

import Item.Item;

public abstract class Armor extends Item {
    private Integer armorValue;

    public Integer getArmorValue() {
        return armorValue;
    }

    public void setArmorValue(Integer armorValue) {
        this.armorValue = armorValue;
    }

    @Override
    public String toString() {
        return getName() + ". Armor Value: " + getArmorValue() +". Durability: " + getDurability();
    }
}

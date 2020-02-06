package Character.Skills.Active;
import Character.CustomCharacter;
import Character.Skills.TargetableAbility;

public class ManaArrow extends ActiveSkill implements TargetableAbility {

    @Override
    public String getName() {
        return "Mana arrow";
    }

    @Override
    public String getDescription() {
        return "Mana shaped into an arrow. One of the basic mana controlling spells. Deals moderatly low damage, but it's mana cost is pretty low";
    }

    private Integer getManaCost() {
        return 10;
    }

    private Integer getDamageValue(CustomCharacter customCharacter) {
        return 5 + (int)(customCharacter.getBaseStatistics().getIntelligence().getIntelligenceValue()*0.1);
    }

    @Override
    public void useOn(CustomCharacter user, CustomCharacter useOn) {
        if (user.getCombatStatistics().getMana().getCurrentMana() > getManaCost()){
            System.out.println("Used " + getName());
            Integer spellDamage = getDamageValue(user);
            System.out.println(useOn.getCharacterBaseInfo().name.getName() + " got hit for " + spellDamage);
            useOn.getCombatStatistics().getHealthPoints().decreaseCurrentHealthPoints(spellDamage);
            user.getCombatStatistics().getMana().currentManaDecrease(getManaCost());
            System.out.println(user.getCharacterBaseInfo().name.getName()+ " used " + getManaCost() + " mana");
        }
        else {
            System.out.println("Not enough mana");
        }
    }
}

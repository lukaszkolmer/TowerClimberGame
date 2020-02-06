package Item;


import Item.Armor.Boots.BootsDatabase;
import Item.Armor.Chest.ChestDatabase;
import Item.Armor.Gloves.GlovesDatabase;
import Item.Armor.Helmet.HelmetDatabase;
import Item.Armor.Legs.LegsDatabase;
import Item.Armor.Shield.ShieldDatabase;
import Item.Armor.Trinket.TrinketDatabase;
import Item.Weapon.OneHandSwords.OneHandedSwordsDatabase;

public class ItemsDatabase {
   BootsDatabase bootsDatabase = new  BootsDatabase();
   ChestDatabase chestDatabase = new ChestDatabase();
   GlovesDatabase glovesDatabase = new GlovesDatabase();
   HelmetDatabase helmetDatabase = new HelmetDatabase();
   LegsDatabase legsDatabase = new LegsDatabase();
   ShieldDatabase shieldDatabase = new ShieldDatabase();
   TrinketDatabase trinketDatabase = new TrinketDatabase();
   OneHandedSwordsDatabase oneHandedSwordsDatabase = new OneHandedSwordsDatabase();

   public BootsDatabase getBootsDatabase() {
      return bootsDatabase;
   }

   public ChestDatabase getChestDatabase() {
      return chestDatabase;
   }

   public GlovesDatabase getGlovesDatabase() {
      return glovesDatabase;
   }

   public HelmetDatabase getHelmetDatabase() {
      return helmetDatabase;
   }

   public LegsDatabase getLegsDatabase() {
      return legsDatabase;
   }

   public ShieldDatabase getShieldDatabase() {
      return shieldDatabase;
   }

   public TrinketDatabase getTrinketDatabase() {
      return trinketDatabase;
   }

   public OneHandedSwordsDatabase getOneHandedSwordsDatabase() {
      return oneHandedSwordsDatabase;
   }
}

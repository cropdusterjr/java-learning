class Monster {
   // private variables
   private String name;
   private int health;
   private Weapon weapon;

   // public methods
   public Monster(String inputName, int inputHealth, Weapon inputWeapon) {
      this.name = inputName;
      this.health = inputHealth;
      this.weapon = inputWeapon;
   }

   public String getName() {
      return this.name;
   }

   public int getHealth() {
      return this.health;
   }

   public String getWeaponName() {
      return weapon.getName();
   }

   public int attack(Monster inputMonster) {
      int damageReceived = (int) (Math.random() * weapon.getMaxDamage());
      inputMonster.health -= damageReceived;
      return damageReceived;
   }
}
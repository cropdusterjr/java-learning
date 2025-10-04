class Weapon {
   // private variables
   private String name;
   private int maxDamage;

   // public methods
   public Weapon() {
      this.name = "Pointy Stick";
      this.maxDamage = 1;
   }

   public Weapon(String inputName, int inputDamage) {
      this.name = inputName;
      this.maxDamage = inputDamage;
   }

   public void setName(String inputName) {
      this.name = inputName;
   }

   public String getName() {
      return this.name;
   }

   public void setMaxDamage(int inputDamage) {
      this.maxDamage = inputDamage;
   }

   public int getMaxDamage() {
      return maxDamage;
   }
}
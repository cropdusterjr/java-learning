class Kitty {
   private String name = "";
   private int age = 0;

   public Kitty() {
      this.name = "Kitty";
      this.age = 0;
   }

   public Kitty(String inputName, int inputAge) {
      this.name = inputName;
      this.age = inputAge;
   }

   public void setName(String inputName) {
      this.name = inputName;
   }

   public void setAge(int inputAge) {
      this.age = inputAge;
   }

   public String getName() {
      return this.name;      
   }

   public int getAge() {
      return this.age;
   }

   public String meow() {
      return this.age + " year old " + this.name + " says 'Meow!'";
   }   
}
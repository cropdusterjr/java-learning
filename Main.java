import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.print("Enter your bunny's name: ");
      String bunnyName = scan.next();

      System.out.print("Enter your bunny's age: ");
      int bunnyAge = scan.nextInt();

      haveBirthday(makeBunny(bunnyName, bunnyAge));
      displayInfo(makeBunny(bunnyName, bunnyAge));

      System.out.println();

      System.out.print("Enter a new name for your bunny: ");
      String newName = scan.next();

      changeName(makeBunny(bunnyName, bunnyAge), newName);
      

   }

   public static Bunny makeBunny(String inputName, int inputAge) {
      Bunny bunny1 = new Bunny();
      bunny1.name = inputName;
      bunny1.age = inputAge;
      return bunny1;
   }

   public static void displayInfo(Bunny bunny1) {
      System.out.println(bunny1.name + " is a " + bunny1.age + " year old bunny.");
   }

   public static void haveBirthday(Bunny bunny1) {
      bunny1.age += 1;     
   }

   public static void changeName(Bunny bunny1, String newName) {
      bunny1.name = newName;
   }

   public static void feed(Bunny bunny1, String appetizer, String mainCourse, String dessert) {
      bunny1.eat(appetizer);
      bunny1.eat(mainCourse);
      bunny1.eat(dessert);
   }

   public static void play(Bunny bunny1) {
      bunny1.hop();
      bunny1.eat("lettuce");
      bunny1.eat("carrots");
      bunny1.sleep();
   }
}

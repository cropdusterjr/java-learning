import java.util.Scanner;

public class madLib {
   public static void main(String[] args) {
      // Instantiating scanner
      Scanner scnr = new Scanner(System.in);
      
      // Declaring variables
      int num1;
      int num2;
      double num3;
      String noun;
      String properName;
      String verb;
      String adjective1;
      String adjective2;
      
      // Collecting inputs
      System.out.print("Enter a whole number : ");
      num1 = scnr.nextInt();

      System.out.print("Enter another whole number : ");
      num2 = scnr.nextInt();

      System.out.print("Enter any number : ");
      num3 = scnr.nextDouble();

      scnr.nextLine(); // grabs whitespace left by previous line

      System.out.print("Enter a noun : ");
      noun = scnr.nextLine();

      System.out.print("Enter a proper name : ");
      properName = scnr.nextLine();

      System.out.print("Enter a verb : ");
      verb = scnr.nextLine();

      System.out.print("Enter an adjective : ");
      adjective1 = scnr.nextLine();

      System.out.print("Enter another adjective : ");
      adjective2 = scnr.nextLine();
      
      // Printing outputs
      System.out.print("One day, " + num1 + " " + noun + "(s)" + " wanted to cross a bridge over a river. ");
      System.out.printf("Under that bridge lived a(n) " + adjective1 + " Troll weighing %.2f", num3);
      System.out.print(" pounds, with " + num2 + " eyes and " + adjective2 + " hair, named " + properName + ". ");
      System.out.println(properName + " said to the " + noun + "(s)" + " \"" + verb + " away, or I will have to eat you!\".");
   }
}
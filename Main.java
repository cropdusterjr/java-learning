import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      Kitty kitty1 = new Kitty();
      
      System.out.print("Enter a name: ");
      kitty1.setName(scan.next());

      System.out.print("Enter an age: ");
      kitty1.setAge(scan.nextInt());

      System.out.println(kitty1.meow());
   }
}
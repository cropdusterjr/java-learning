import java.util.Scanner;

public class HelloJava5 {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      Scanner scnr = new Scanner(System.in);
      
      // Below this comment: declare any variables you may need
      String text;
      
      // Below this comment: collect the required inputs
      System.out.print("Enter your text : ");
      text = scnr.nextLine();
      
      // Below this comment: output the correct output
      System.out.printf("Java says " + "\"%s\"\n", text);
   }
}

import java.util.Scanner; 

public class printTriangle {
   public static void main(String[] args) {
      printTriangle(5, "*");
   }
   
   public static void printTriangle(int size, String charUsed) {
      int numChars;
      int i;

      for (i = 1; i <= size; ++i) {
         numChars = 0;
         while (numChars < i) {
            System.out.print(charUsed);
            ++numChars;
         }
         System.out.println();
      }
   }
   
}
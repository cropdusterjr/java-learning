public class smallestNumber {
   public static void main(String[] args) {
      System.out.println(getSmallest(6, 4, 2));
   }
   
   public static int getSmallest(int num1, int num2, int num3) {
      int output = 0;
      
      if (num1 <= num2) {
         if (num1 <= num3) {
            output = num1;
         }
         else {
            output = num3;
         }
      }
      else if (num2 <= num3) {
         output = num2;
      }
      else {
        output = num3;
      }
      
      return output;
   }
   
}
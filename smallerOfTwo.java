public class smallerOfTwo {
   public static void main(String[] args) {
      System.out.println(getSmallest(13, 12));

   }
   
   public static int getSmallest(int num1, int num2) {
      int smallestNum = 0;

      if (num1 <= num2) {
         smallestNum = num1;
      }
      else {
        smallestNum = num2;
      }

      return smallestNum;
   }
   
}
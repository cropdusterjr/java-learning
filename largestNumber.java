public class Main {
   public static void main(String[] args) {
      System.out.println(getLargest(2, 4, 6));
   }
   
   public static int getLargest(int num1, int num2, int num3) {
      int output = 0;

      if (num1 >= num2) {
         if (num1 >= num3) {
            output = num1;
         }
         else {
            output = num3;
         }
      }
      else if (num2 >= num3) {
        output = num2;
      }
      else {
        output = num3;
      }

      return output;
   }
   
}
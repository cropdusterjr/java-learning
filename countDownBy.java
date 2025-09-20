public class countDownBy {
   public static void main(String[] args) {
      countDownBy(10, 0, 2);
   }
   
   public static void countDownBy(int num1, int num2, int increment) {
      int larger = 0;
      int smaller = 0;
      int i;

      if (num1 > num2) {
         larger = num1;
         smaller = num2;
      }
      else {
         larger = num2;
         smaller = num1;
      }

      for (i = larger; i >= smaller; i -= increment) {
         System.out.print(i + ",");
      }
   }
   
}
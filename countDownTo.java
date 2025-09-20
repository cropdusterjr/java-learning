public class countDownTo {
   public static void main(String[] args) {
      countDownTo(3, 4);
   }
   
   public static void countDownTo(int num1, int num2) {
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

      for (i = larger; i >= smaller; --i) {
         System.out.print(i + ",");
      }
   }
   
}
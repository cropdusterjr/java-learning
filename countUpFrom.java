public class countUpFrom {
   public static void main(String[] args) {
      countUpFrom(4, 3);
   }
   
   public static void countUpFrom(int num1, int num2) {
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

      for (i = smaller; i <= larger; ++i) {
         System.out.print(i + ",");
      }
   }
   
}
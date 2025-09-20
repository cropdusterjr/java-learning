public class countUpBy {
   public static void main(String[] args) {
      countUpBy(0, 10, 2);
   }
   
   public static void countUpBy(int num1, int num2, int increment) {
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

      for (i = smaller; i <= larger; i += increment) {
         System.out.print(i + ",");
      }
   }
   
}
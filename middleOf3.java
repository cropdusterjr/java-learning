public class middleOf3 {
   public static void main(String[] args) {
      System.out.println(middle(7, 100, 13));
   }
   
   public static int middle(int num1, int num2, int num3) {
      int middle = 0;
      int top = 0;
      int bottom = 0;

      if ((num1 >= num2) && (num1 >= num3)){
         top = num1;
      }
      else if ((num2 >= num1) && (num2 >= num3)) {
         top = num2;
      }
      else {
         top = num3;
      }

      if ((num1 <= num2) && (num1 <= num3)) {
         bottom = num1;
      }
      else if ((num2 <= num1) && (num2 <= num3)) {
         bottom = num2;
      }
      else {
         bottom = num3;
      }

      if ((num1 != top) && (num1 != bottom)) {
         middle = num1;
      }
      else if ((num2 != top) && (num2 != bottom)) {
         middle = num2;
      }
      else {
         middle = num3;
      }

      return middle;
   }
   
}
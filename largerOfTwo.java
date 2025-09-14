public class largerOfTwo {
   public static void main(String[] args) {
      System.out.println(getLargest(0,0));
   }
   
   public static int getLargest(int num1, int num2) {
    int output = 0;

    if (num1 >= num2) {
        output = num1;
    }
    else {
        output = num2;
    }
    return output;
   }
   
}
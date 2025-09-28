import java.util.ArrayList;

public class countInRange {
   public static void main(String[] args) {
      ArrayList<Integer> array = new ArrayList<Integer>();

      array.add(1);
      array.add(2);
      array.add(1);
      array.add(3);
      array.add(2);
      array.add(5);
      array.add(6);
      array.add(2);
      array.add(4);
      
      System.out.println(countInRange(array, 1, 6));
   }
   
   public static int countInRange(ArrayList<Integer> arr, int lower, int upper) {
      int count = 0;

      for (int value : arr) {
         if (value >= lower && value <= upper) {
            count++;
         }
      }

      return count;
   }
   
}
import java.util.ArrayList;

public class count {
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

      System.out.println(count(array, 2));
   }
   
   public static int count(ArrayList<Integer> arr, int value) {
      int count = 0;

      for (Integer num : arr) {
         if (num == value) {
            ++count;
         }
      }
      return count;
   }
   
}
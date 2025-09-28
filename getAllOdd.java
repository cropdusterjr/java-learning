import java.util.ArrayList;

public class getAllOdd {
   public static void main(String[] args) {
      ArrayList<Integer> array = new ArrayList<Integer>();

      array.add(0);
      array.add(1);
      array.add(2);
      array.add(3);
      array.add(4);
      array.add(5);

      System.out.println(getAllOdd(array));
   }
   
   public static ArrayList<Integer> getAllOdd(ArrayList<Integer> arr) {
      ArrayList<Integer> newArray = new ArrayList<Integer>();

      for (int value : arr) {
         if (value % 2 != 0) {
            newArray.add(value);
         }
      }

      return newArray;
   }
   
}
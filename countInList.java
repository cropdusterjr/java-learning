import java.util.ArrayList;

public class countInList {
   public static void main(String[] args) {
      ArrayList<Integer> array1 = new ArrayList<Integer>();
      ArrayList<Integer> array2 = new ArrayList<Integer>();

      array1.add(0);
      array1.add(1);
      array1.add(2);
      array1.add(3);
      array1.add(4);
      array1.add(5);

      array2.add(1);
      array2.add(2);
      array2.add(3);

      System.out.println(countInList(array1, array2));
   }
   
   public static int countInList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
      int count = 0;

      for (int value : list1) {
         boolean valueMatch = alsoContains(list2, value);
         if (valueMatch == true) {
            ++count;
         }
      }
      
      return count;
   }

   public static boolean alsoContains(ArrayList<Integer> arr, int value1) {
      boolean matchFound = false;
      
      for (int value2 : arr) {
         if (value1 == value2) {
            matchFound = true;
         }
      }
      return matchFound;
   }
   
}
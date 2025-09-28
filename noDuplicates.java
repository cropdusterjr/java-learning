import java.util.ArrayList;

public class noDuplicates {
   public static void main(String[] args) {
      ArrayList<Integer> myArray = new ArrayList<Integer>();

      myArray.add(0);
      myArray.add(0);
      myArray.add(10);
      myArray.add(10);
      myArray.add(20);
      myArray.add(30);

      System.out.println(noDuplicates(myArray));
   }
   
   public static ArrayList<Integer> noDuplicates(ArrayList<Integer> arr) {
      ArrayList<Integer> newArray = new ArrayList<Integer>();
      
      for (int value : arr) {
         if (contains(newArray, value) != true) {
            newArray.add(value);
         }
      }

      return newArray;
   }

   public static boolean contains(ArrayList<Integer> arr, int value) {
      boolean duplicate = false;
      
      for (int i : arr) {
         if (i == value) {
            duplicate = true;
         }         
      }
      
      return duplicate;
   }
   
}
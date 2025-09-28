import java.util.ArrayList;

public class printArrayList {
   public static void main(String[] args) {
      ArrayList<Integer> array = new ArrayList<Integer>();

      array.add(1);
      array.add(22);
      array.add(333);
      array.add(400);
      array.add(5005);
      array.add(9);
      
      printArrayList(array, " - ");      
   }
   
   public static void printArrayList(ArrayList<Integer> arr, String separator) {
      String list = "";
      int i;

      for (i = 0; i < arr.size(); ++i) {         
         if (i < arr.size() - 1) {
            list += arr.get(i) + separator;
         }
         else if (i == arr.size() - 1) {
            list += arr.get(i);
         }
         else {
            break;
         }
      }

      System.out.println(list);
   }
   
   
}
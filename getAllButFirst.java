public class getAllButFirst {
   public static void main(String[] args) {
      int[] myArray = {1, 22, 333, 400, 5005, 9};
      System.out.println(getAllButFirst(myArray));
   }
   
   public static int[] getAllButFirst(int[] array) {
      int[] newArray = new int[array.length-1];

      for (int i = 0; i < newArray.length; ++i) {
         newArray[i] = array[i + 1];
      }
      return newArray;
   }
   
}
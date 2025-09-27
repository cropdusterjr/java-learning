public class Main {
   public static void main(String[] args) {
      int[] array= {1, 22, 333, 400, 5005, 9};
      System.out.println(getAllButLast(array));
   }
   
   public static int[] getAllButLast(int[] array) {
      int[] newArray = new int[array.length - 1];
      int i;

      for (i = 0; i < newArray.length; ++i) {
         newArray[i] = array[i];
      }

      return newArray;
   }
   
}
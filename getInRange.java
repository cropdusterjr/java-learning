public class getInRange {
   public static void main(String[] args) {
      int[] array = {1, 22, 333, 400, 5005, 9};
      System.out.println(getInRange(array, 100, 1000));
   }
   
   public static int[] getInRange(int[] array, int lower, int upper) {
      int numValues = 0;
            
      for (int value : array) {
         if (value >= lower && value <= upper) {
            ++numValues;
         }
      }
         
      int[] newArray = new int[numValues];
      int newArrayIndex = 0;

      for (int value : array) {
         if (value >= lower && value <= upper) {
            newArray[newArrayIndex] = value;
            ++newArrayIndex;
         }
      }
      
      return newArray;
   }
   
}
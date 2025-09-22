public class isPalindrome {
   public static void main(String[] args) {
      System.out.println(isPalindrome("never odd or even"));
   }
   
   public static boolean isPalindrome(String phraseOrWord) {
      boolean palindrome = true;
      String noSpaces = "";
      String noSpacesReversed = "";
      int i = 0;

      for (i = 0; i < phraseOrWord.length(); ++i) {            
         if (phraseOrWord.charAt(i) != ' ') {
             noSpaces += phraseOrWord.charAt(i);
         }
      }
       
      for (i = noSpaces.length() - 1; i >= 0; --i) {
         noSpacesReversed += noSpaces.charAt(i);         
      }
      
      palindrome = noSpaces.equals(noSpacesReversed);

      return palindrome;     
   }
   
}

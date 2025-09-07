import java.util.Scanner;

public class properName {
   public static void main(String[] args) {
      // Instantiating scanner
      Scanner scnr = new Scanner(System.in);

      // Declaring variables
      String fullName = "";
      String firstName = "";
      String middleName = "";
      String lastName = "";
      int indexOfFirstSpace = 0;
      int indexOfLastSpace = 0;
      int totalCharacters = 0;
      char firstInitial = 0;
      char middleInitial = 0;
      
      // Gathering user inputs
      System.out.print("Enter a proper name : ");
      fullName = scnr.nextLine();

      // Grabbing substrings
      indexOfFirstSpace = fullName.indexOf(" ");
      indexOfLastSpace = fullName.lastIndexOf(" ");
      firstName = fullName.substring(0, indexOfFirstSpace);
      middleName = fullName.substring(indexOfFirstSpace + 1, indexOfLastSpace);
      lastName = fullName.substring(indexOfLastSpace + 1);

      totalCharacters = firstName.length() + middleName.length() + lastName.length();
      firstInitial = fullName.charAt(0);
      middleInitial = fullName.charAt(indexOfFirstSpace + 1);

      // Printing outputs
      System.out.println("Total characters    : " + totalCharacters);
      System.out.println("First name          : " + firstName);
      System.out.println("Middle name         : " + middleName);
      System.out.println("Last name           : " + lastName);
      System.out.println("First initial       : " + firstInitial);
      System.out.println("Middle initial      : " + middleInitial);
      System.out.println("Last name first     : " + lastName + ", " + firstName + " " + middleName);
      System.out.println("Short form          : " + firstInitial + "." + " " + middleInitial + "." + " " + lastName);
   }
}

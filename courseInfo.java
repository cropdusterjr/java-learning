import java.util.Scanner;

public class courseInfo {
   public static void main(String[] args) {
      // Instantiating scanner 
      Scanner scnr = new Scanner(System.in);

      // Declaring variables
      String courseInfo = "";
      String subject = "";
      int courseNumber;
      int sectionNumber = 0;
      String courseTitle = "";
      int indexOfFirstSpace;
      int indexOfSecondSpace;
      int indexOfThirdSpace;
      
      // Collecting user inputs
      System.out.print("Enter course info : ");
      courseInfo = scnr.nextLine();

      // Processing information
      indexOfFirstSpace = courseInfo.indexOf(" ");
      indexOfSecondSpace = courseInfo.indexOf(" ", indexOfFirstSpace + 1);
      indexOfThirdSpace = courseInfo.indexOf(" ", indexOfSecondSpace + 1);
      subject = courseInfo.substring(0, 3);
      courseNumber = Integer.parseInt(courseInfo.substring(4, 7));
      sectionNumber = Integer.parseInt(courseInfo.substring(8, 13));
      courseTitle = courseInfo.substring(indexOfThirdSpace + 1);

      // Printing outputs
      System.out.println(indexOfFirstSpace);
      System.out.println("Subject        : " + subject);
      System.out.println("Course Number  : " + courseNumber);
      System.out.println("Section Number : " + sectionNumber);
      System.out.println("Course Title   : " + courseTitle);
   }
}

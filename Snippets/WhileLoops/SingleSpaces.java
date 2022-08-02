
import java.util.Scanner;

public class SingleSpaces {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userText;

      System.out.print("Enter sentence: ");
      userText = scnr.nextLine();

      while (userText.indexOf("  ") != -1) {
         // At least one double-space still exists
         // Replace all double-spaces by one space
         userText = userText.replace("  ", " ");
      }

      System.out.print("New sentence: " + userText);
   }
}
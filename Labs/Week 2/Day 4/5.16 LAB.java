import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      String input;
      String character;
      char newCharacter;
      int i;
      int count;
      
      character = scnr.next();
      newCharacter = character.charAt(0);
      input = scnr.nextLine();
      
      count = 0;
      
      for (i = 0; i < input.length(); ++i) {
         if (newCharacter == input.charAt(i)) {
            count = count + 1;
         }
      }
      
      if (count == 1) {
         System.out.println(count + " " + character);
      }
      
      else {
      System.out.println(count + " " + character + "'s");
       } 
   }
}
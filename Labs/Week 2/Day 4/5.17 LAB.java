import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner (System.in);
      String input;
      int i;
      String input1 = "";
      
      input = scnr.nextLine();
      
      for (i = 0; i < input.length(); ++i) {
         if (Character.isLetter(input.charAt(i))) {
            input1 += input.charAt(i);
         }
      }
      System.out.println(input1);
   }
}

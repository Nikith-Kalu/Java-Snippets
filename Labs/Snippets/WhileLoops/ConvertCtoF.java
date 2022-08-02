
import java.util.Scanner;

public class ConvertCtoF {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      double celsiusValue;
      double fahrenheitValue;
      char userChar;

      celsiusValue = 0.0;
      userChar = 'y';

      while (userChar == 'y') {
         fahrenheitValue = (celsiusValue * 9.0 / 5.0) + 32.0;

         System.out.print(celsiusValue + " C is ");
         System.out.println(fahrenheitValue + " F"); 

         System.out.print("Type y to continue, any other to quit: ");
         userChar = scnr.next().charAt(0);

         celsiusValue = celsiusValue + 5;
         System.out.println("");
      }
   
      System.out.println("Goodbye.");
   }
}

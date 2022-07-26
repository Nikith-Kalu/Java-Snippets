
import java.util.Scanner;

public class SavingsInterestCalc {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double initialSavings;  // User-entered initial savings
      double interestRate;    // Interest rate
      double currSavings;     // Current savings with interest
      int i;                  // Loop variable

      System.out.print("Enter initial savings: ");
      initialSavings = scnr.nextDouble();

      System.out.print("Enter interest rate: ");
      interestRate = scnr.nextDouble();

      System.out.println("\nAnnual savings for 10 years: ");

      currSavings = initialSavings;
      for (i = 0; i < 10; ++i) {
         System.out.println("$" + currSavings);
         currSavings = currSavings + (currSavings * interestRate);
      }
   }
}
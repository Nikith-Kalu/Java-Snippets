import java.util.Scanner;

public class IncomeTax {    
   // Method to prompt for and input an integer
   public static int promptForInteger(Scanner input, String userPrompt) {
      int inputValue;
      
      System.out.println(userPrompt + ": ");
      inputValue = input.nextInt();
      
      return inputValue;
   }

   // *********************************************************************** 

   // Method to get a value from one table based on a range in the other table
   public static double getCorrespondingTableValue(int search, int [] baseTable, double [] valueTable) {
      int baseTableLength;
      double value;
      int i;
      boolean keepLooking;

      baseTableLength = baseTable.length;
      value = 0.0;
      i = 0;
      keepLooking = true;

      while ((i < baseTableLength) && keepLooking) {
         if (search <= baseTable[i]) {
            value = valueTable[i];
            keepLooking = false;
         }
         else {
            ++i;
         }
      }

      return value;
   }

   // *********************************************************************** 

   public static void main (String [] args) { 
      Scanner scnr = new Scanner(System.in);
      int annualSalary;
      double taxRate;
      int taxToPay;
      int i;
      final String USER_PROMPT = "\nEnter annual salary (negative to exit)";

      // The first entries in the two tables are 0 to catch annualSalary < 0
      int [] salaryBase = {   0,     20000,     50000,     100000,     999999999 };
      double [] taxBase = { 0.0,      0.10,      0.20,       0.30,          0.40 };
    
      annualSalary = promptForInteger(scnr, USER_PROMPT);

      while (annualSalary >= 0) {
         taxRate = getCorrespondingTableValue(annualSalary, salaryBase, taxBase);

         taxToPay= (int)(annualSalary * taxRate);     // Truncate tax to an integer amount
         System.out.println("Annual salary: " + annualSalary + 
                            "\nTax rate: " + taxRate +
                            "\nTax to pay: " + taxToPay);

         // Get the next annual salary
         annualSalary = promptForInteger(scnr, USER_PROMPT);
      } 
   }
}

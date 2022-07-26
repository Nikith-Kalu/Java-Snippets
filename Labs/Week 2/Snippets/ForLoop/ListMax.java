import java.util.Scanner;

// Outputs max of list of integers
// First value indicates list size
// Ex: 4 -1 9 0 3  yields 9

public class ListMax {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int maxSoFar = 0;
      int currValue;
      int numValues;
      int i;

      numValues = scnr.nextInt();

      for (i = 0; i < numValues; ++i) {
         currValue = scnr.nextInt();

         if (i == 0) { // First iteration
            maxSoFar = currValue;
         }
         else if (currValue > maxSoFar) {
            maxSoFar = currValue;
         }
      }

      if (numValues > 0) {
         System.out.println("Max: " + maxSoFar);
      }
   }
}
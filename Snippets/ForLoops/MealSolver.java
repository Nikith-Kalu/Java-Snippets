import java.util.Scanner;

public class MealSolver {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int EMPANADA_COST = 3;
      final int TACO_COST     = 4;

      int userMoney;
      int numTacos;
      int numEmpanadas;
      int mealCost;
      int maxEmpanadas;
      int maxTacos;

      numTacos = 0;
      numEmpanadas = 0;
      mealCost = 0;

      System.out.print("Enter money for meal: ");
      userMoney = scnr.nextInt();

      maxEmpanadas = userMoney / EMPANADA_COST;
      maxTacos = userMoney / TACO_COST;

      for (numTacos = 0; numTacos <= maxTacos; ++numTacos) {
         for (numEmpanadas = 0; numEmpanadas <= maxEmpanadas; ++numEmpanadas) {

            mealCost = (numEmpanadas * EMPANADA_COST) + (numTacos * TACO_COST);

            // Find first meal option that exactly matches user money
            if (mealCost == userMoney) {
               break;
            }
         }

         // If meal option exactly matching user money is found, 
         // break from outer loop as well
         if (mealCost == userMoney) {
            break;
         }
      }

      if (mealCost == userMoney) {
         System.out.println("$" + mealCost + " buys " + numEmpanadas
                 + " empanadas and " + numTacos
                 + " tacos without change.");
      }
      else {
         System.out.println("You cannot buy a meal without having "
                 + "change left over.");
      }
   }
}
import java.util.Scanner;

public class CalorieCalc {
   public static double stepsToMiles(int numSteps) {
      final double FEET_PER_STEP = 2.5;               // Typical adult
      final int FEET_PER_MILE = 5280;

      return numSteps * FEET_PER_STEP * (1.0 / FEET_PER_MILE);
   }

   public static double stepsToCalories(int numSteps) {
      final double STEPS_PER_MINUTE = 70.0;           // Typical adult
      final double CALORIES_PER_MINUTE_WALKING = 3.5; // Typical adult
      double minutesTotal;
      double caloriesTotal;

      minutesTotal = numSteps / STEPS_PER_MINUTE;
      caloriesTotal = minutesTotal * CALORIES_PER_MINUTE_WALKING;

      return caloriesTotal;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int stepsWalked;
      
      System.out.print("Enter number of steps walked: ");
      stepsWalked = scnr.nextInt();
      
      System.out.println("Miles walked: " + stepsToMiles(stepsWalked));
      System.out.println("Calories: " + stepsToCalories(stepsWalked));
   }
}
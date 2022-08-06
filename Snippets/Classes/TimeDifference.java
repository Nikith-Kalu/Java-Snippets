import java.util.Scanner;

/**
 * This program calculates the difference between two 
 * user-entered times. This class contains the 
 * program's main() method and is not meant to be instantiated.
 * @author Mary Adams
 * @version 1.0
 */
public class TimeDifference {
   /**
    * Asks for two times, creating an ElapsedTime object for each, 
    * and uses ElapsedTime's getTimeMinutes() method to properly 
    * calculate the difference between both times.
    * @param args command-line arguments
    * @see ElapsedTime#getTimeMinutes()
    */
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int timeDiff;     // Stores time difference
      int userHours;
      int userMins;
      ElapsedTime startTime = new ElapsedTime(); // Starting time
      ElapsedTime endTime = new ElapsedTime(); // Ending time

      // Read starting time in hours and minutes
      System.out.print("Enter starting time (hrs mins): ");
      userHours = scnr.nextInt();
      userMins = scnr.nextInt();
      startTime.setTime(userHours, userMins);
              
      // Read ending time in hours and minutes
      System.out.print("Enter ending time (hrs mins): ");
      userHours = scnr.nextInt();
      userMins = scnr.nextInt();
      endTime.setTime(userHours, userMins);

      // Calculate time difference by converting both times to minutes
      timeDiff = endTime.getTimeMinutes() - startTime.getTimeMinutes(); 
      
      System.out.println("Time difference is " + timeDiff + " minutes");
   }
}
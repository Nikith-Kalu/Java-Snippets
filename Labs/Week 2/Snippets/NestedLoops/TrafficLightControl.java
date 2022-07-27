import java.util.Scanner;

/* Manual controller for traffic light */
public class TrafficLightControl {
   // enum type declaration occurs outside the main method
   public enum LightState {RED, GREEN, YELLOW, DONE}

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      LightState lightVal;
      String userCmd;

      lightVal = LightState.RED;
      userCmd = "-";

      System.out.println("User commands: n (next), r (red), q (quit).\n");

      while (lightVal != LightState.DONE) {

         if (lightVal == LightState.GREEN) {
            System.out.print("Green light  ");
            userCmd = scnr.next();
            if (userCmd.equals("n")) { // Next
               lightVal = LightState.YELLOW;
            }
         }
         else if (lightVal == LightState.YELLOW) {
            System.out.print("Yellow light  ");
            userCmd = scnr.next();
            if (userCmd.equals("n")) { // Next
               lightVal = LightState.RED;
            }
         }
         else if (lightVal == LightState.RED) {
            System.out.print("Red light  ");
            userCmd = scnr.next();
            if (userCmd.equals("n")) { // Next
               lightVal = LightState.GREEN;
            }
         }

         if (userCmd.equals("r")) { // Force immediate red
            lightVal = LightState.RED;
         }
         else if (userCmd.equals("q")) { // Quit
            lightVal = LightState.DONE;
         }
      }

      System.out.println("Quit program.");
   }
}
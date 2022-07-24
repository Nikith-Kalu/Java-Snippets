import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
         int seconds;
         int minutes;
         int hours;
         int secondsLeft;
         
         seconds = scnr.nextInt();
         hours = seconds / 3600;
         minutes = (seconds - (hours * 3600)) / 60;
         secondsLeft = (seconds - (minutes * 60) - (hours * 3600));
         
         System.out.println("Hours: " + hours);
         System.out.println("Minutes: " + minutes);
         System.out.println("Seconds: " + secondsLeft);

   }
}
import java.util.Scanner; 

public class LabProgram {

   public static boolean isLeapYear(int userYear){
      if (userYear % 4 == 0 && userYear % 100 !=0) {
         return true;
      }
      
         else if (userYear % 400 == 0) {
            return true;
         }
      return false;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int yearNumber = scnr.nextInt();
      
      if (isLeapYear(yearNumber)) {
         System.out.println(yearNumber + " - leap year");
      }
      
      else {
         System.out.println(yearNumber + " - not a leap year");
      }
   }
}
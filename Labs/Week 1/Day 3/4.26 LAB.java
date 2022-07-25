import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      
      String inputMonth = scnr.next();
      int inputDay = scnr.nextInt();
      boolean validInput = false;
      boolean spring = false;
      boolean summer = false;
      boolean autumn = false;
      boolean winter = false;
      
      
      
      //January check
      if (inputMonth.equals("January") && ((inputDay > 0) && (inputDay <32))) {
         validInput = true;
         winter = true;
      }

      
      //February check
      if (inputMonth.equals("February") && ((inputDay > 0) && (inputDay <29))) {
         validInput = true;
         winter = true;         
      }

      
      //March check
      if (inputMonth.equals("March") && ((inputDay > 0) && (inputDay <20))) {
         validInput = true;
         winter = true;      
      }
      else if (inputMonth.equals("March") && ((inputDay > 19) && (inputDay <32))) {
         validInput = true;
         spring = true;
      }

      
      //April check
      if (inputMonth.equals("April") && ((inputDay > 0) && (inputDay <31))) {
         validInput = true;
         spring = true;
      }

      
      //May check
      if (inputMonth.equals("May") && ((inputDay > 0) && (inputDay <32))) {
         validInput = true;
         spring = true;
      }
      
      
      //June check
      if (inputMonth.equals("June") && ((inputDay > 0) && (inputDay <21))) {
         validInput = true;
         spring = true;
      }
      else if (inputMonth.equals("June") && ((inputDay > 20) && (inputDay <31))) {
         validInput = true;
         summer = true;
      }
 
      
      //July check
      if (inputMonth.equals("July") && ((inputDay > 0) && (inputDay <32))) {
         validInput = true;
         summer = true;
      }
      
      
      //August check
      if (inputMonth.equals("August") && ((inputDay > 0) && (inputDay <32))) {
         validInput = true;
         summer = true;
      }

      
      //September check
      if (inputMonth.equals("September") && ((inputDay > 0) && (inputDay <23))) {
         validInput = true;
         summer = true;
      }
      else if (inputMonth.equals("September") && ((inputDay > 22) && (inputDay <31))) {
         validInput = true;
         autumn = true;
      }
      
      
      //October check
      if (inputMonth.equals("October") && ((inputDay > 0) && (inputDay <32))) {
         validInput = true;
         autumn = true;
      }

      
      //November check
      if (inputMonth.equals("November") && ((inputDay > 0) && (inputDay <31))) {
         validInput = true;
         autumn = true;
      }
      
      
      //December check
      if (inputMonth.equals("December") && ((inputDay > 0) && (inputDay <21))) {
         validInput = true;
         autumn = true;
      }
      else if (inputMonth.equals("December") && ((inputDay > 20) && (inputDay <32))) {
         validInput = true;
         winter = true;
      }
      
   

      if (validInput) {
         if (spring) {
            System.out.println("Spring");
         }
         else if (summer) {
            System.out.println("Summer");
         }
         else if (autumn) {
            System.out.println("Autumn");
         }
         else if (winter) {
            System.out.println("Winter");
         }
      }
      else {
         System.out.println("Invalid");
      }
      
      
   }
}

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
     Scanner scnr = new Scanner(System.in);
     int pennies;
     int dollars;
     int quaters;
     int dimes;
     int nickels;
     
     pennies = scnr.nextInt();
     
     if (pennies == 0) {
        System.out.println("No change");
     }
    
     
     if (pennies >= 100) {
         dollars = pennies/100;
         pennies = pennies % 100;
         if (dollars > 1) {
         System.out.println(dollars + " Dollars");
         }
         else {
         System.out.println(dollars + " Dollar");
         }
        }
        
        
     if ((pennies < 100) && (pennies >= 25)) {
        quaters = pennies / 25;
        pennies = pennies % 25;
         if (quaters > 1) {
         System.out.println(quaters + " Quarters");
         }
         else {
         System.out.println(quaters + " Quarter");
         }
        
     }
     
     if ((pennies < 25) && (pennies >= 10)) {
        dimes = pennies / 10;
         pennies = pennies % 10;
         if (dimes > 1) {
         System.out.println(dimes + " Dimes");
         }
         else {
         System.out.println(dimes + " Dime");
         }
       
     }
     
     if ((pennies < 10) && (pennies >= 5)) {
        nickels = pennies / 5;
        pennies = pennies % 5;
         if (nickels > 1) {
         System.out.println(nickels + " Nickels");
         }
         else {
         System.out.println(nickels + " Nickel");
         }
        
     }
     if ((pennies < 5) && (pennies >= 1)) {
        
         if (pennies > 1) {
         System.out.println(pennies + " Pennies");
         }
         else {
         System.out.println(pennies + " Penny");
         }
       
     }
   }
}
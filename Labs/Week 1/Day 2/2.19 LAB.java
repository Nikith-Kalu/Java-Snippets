import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int quarters;
      int dimes; 
      int nickels; 
      int pennies; 
      double convQuarters;
      double convDimes;
      double convNickels;
      double convPennies;
      double finalAmount;
      
      quarters = scnr.nextInt();
      dimes = scnr.nextInt();
      nickels = scnr.nextInt();
      pennies = scnr.nextInt(); 
      
      convQuarters = (quarters * 0.25);
      convDimes = (dimes * 0.1);
      convNickels = (nickels * 0.5);
      convPennies = (pennies * 0.01);
      finalAmount = (convQuarters + convDimes + convNickels + convPennies);
      
      System.out.printf("Amount: $%.2f\n", finalAmount);
      
      
   }
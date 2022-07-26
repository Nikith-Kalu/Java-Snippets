import java.util.Scanner;
public class IsPrime{
    public static void main(String[] args){
       
       Scanner scnr = new Scanner(System.in);
       String message = "You entered the number";
       String result = message;
       int baseCase = 2; 
       int userInput;
       
      
      System.out.println("Please enter your number:");
      userInput = scnr.nextInt();
      
         if (userInput == '1'){
             System.out.println(result + userInput +  " which is NOT a prime number.");
         }
         else if (userInput == baseCase) {
             System.out.println(result + userInput +  " which is a prime number.");
         }
         boolean isPrime = true;
             
       while (baseCase > userInput){
          if (userInput % baseCase == 0){
             isPrime = false;
             ++baseCase;
          }
       }
       if (isPrime){
          System.out.println(result + "which is a prime number.");
       }
       else {
          System.out.println(result + "which is NOT a prime number.");
       }
    }
}
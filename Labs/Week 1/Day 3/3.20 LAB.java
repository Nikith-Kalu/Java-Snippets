import java.util.Scanner;
public class PerfectSquare{
   public static void main(String[] args){
   Scanner scnr = new Scanner(System.in);
   
   
   
   System.out.println("Please input your first decimal value:");
   
   double userInputone = scnr.nextDouble();
   double userSRone;
   double tsone;
   boolean tofone;
   String stofone;
   
   userSRone = Math.sqrt(userInputone);
   userSRone = Math.floor(userSRone);
   tsone = (userSRone * userSRone);
   tofone = tsone == userInputone;   

   stofone =  new Boolean(tofone).toString();
   
   System.out.println("Please input your second decimal value:");
   
   double userInputtwo = scnr.nextDouble();
   double userSRtwo;
   double tstwo;
   boolean toftwo;
   String stoftwo;
   
   userSRtwo = Math.sqrt(userInputtwo);
   userSRtwo = Math.floor(userSRtwo);
   tstwo = (userSRone * userSRone);
   toftwo = tstwo == userInputtwo;
   
   stoftwo =  new Boolean(toftwo).toString();
   
   System.out.println("Please input your third decimal value:");
   System.out.println();
   
   double userInputthree = scnr.nextDouble();
   double userSRthree;
   double tsthree;
   boolean tofthree;
   String stofthree;
   
   userSRthree = Math.sqrt(userInputthree);
   userSRthree = Math.floor(userSRone);
   tsthree = (userSRthree * userSRthree);
   tofthree = tsthree == userInputthree;

   stofthree =  new Boolean(tofthree).toString();

   System.out.println("Input     Square Root as Integer        Perfect Square      ");
   System.out.printf("%-10.2f", userInputone);
   System.out.printf("%-30.0f", userSRone); 
   stofone = String.format("%-20s", stofone); 
   System.out.print(stofone);
   System.out.println();
   
   System.out.printf("%-10.2f", userInputtwo);
   System.out.printf("%-30.0f", userSRtwo); 
   stoftwo = String.format("%-20s", stoftwo); 
   System.out.print(stoftwo);
   System.out.println();
   
   System.out.printf("%-10.2f", userInputthree);
   System.out.printf("%-30.0f", userSRthree); 
   stofthree = String.format("%-20s", stofthree); 
   System.out.print(stofthree);
   System.out.println();
   
   }
}
import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userName;
   
      userName = scnr.next();
      
      System.out.println("Hello " + userName + ", and welcome to CS Online!");
   }
}
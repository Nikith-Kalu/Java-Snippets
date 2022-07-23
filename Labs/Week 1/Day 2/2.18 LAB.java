import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      
      Scanner scnr = new Scanner(System.in);
      
      int userNum;
      int divNum;
      int userNum1;
      int userNum2;
      int userNum3;
      
      userNum = scnr.nextInt();
      divNum = scnr.nextInt();
      
      userNum1 = (userNum / divNum);
      userNum2  = (userNum1 / divNum);
      userNum3 = (userNum2 / divNum);
      
      System.out.print(userNum1 + " " + userNum2 + " " + userNum3);
      
   }
}

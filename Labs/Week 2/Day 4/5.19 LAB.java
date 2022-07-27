import java.util.Scanner;

public class DateParser {
   public static int getMonthAsInt(String monthString) {
      int monthInt;
      
      // Java switch/case statement                                                                
      switch (monthString) {
         case "January": 
            monthInt = 1; 
            break;
         case "February": 
            monthInt = 2; 
            break;
         case "March": 
            monthInt = 3; 
            break;
         case "April": 
            monthInt = 4; 
            break;
         case "May": 
            monthInt = 5; 
            break;
         case "June": 
            monthInt = 6; 
            break;
         case "July": 
            monthInt = 7; 
            break;
         case "August": 
            monthInt = 8; 
            break;
         case "September": 
            monthInt = 9; 
            break;
         case "October": 
            monthInt = 10; 
            break;
         case "November": 
            monthInt = 11; 
            break;
         case "December": 
            monthInt = 12; 
            break;
         default: 
            monthInt = 0;
      }
      
      return monthInt;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // TODO: Read dates from input, parse the dates to find the ones
      //       in the correct format, and output in m/d/yyyy format
      
      String userInput;
      int i;
      int month;
      String x, y, z;
      while(true){
         userInput = scnr.nextLine();
         if(userInput.equals("-1") == true)
         break;
         i = userInput.indexOf(",");
         if (i == -1)
         continue;
         String temp = userInput.substring(0, i);
         x = temp.split(" ")[0];
         y = temp.split(" ")[1];
         z = userInput.substring(i + 2);
         month = getMonthAsInt(x);
         System.out.println(month + "/" + y + "/" + z);
         }
     
   }
}
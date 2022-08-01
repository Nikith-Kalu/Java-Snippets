import java.util.Scanner;

public class LabProgram {
	   public static int calcNumCharacters(String userString, char userChar) { 
		      int count = 0; 
		      
		      for (int i = 0; i < userString.length(); i++) { 
		         if (userString.charAt(i) == userChar) { 
		            count++;
		         }
		      } 
	
		      return count;  
		   }
		   
		   public static void main(String[] args) { 
		      Scanner scnr = new Scanner(System.in);
			      char userChar = scnr.next().charAt(0); 
			      String userString = scnr.nextLine();
			      
			   if (calcNumCharacters(userString, userChar) == 1){
			      System.out.println(calcNumCharacters(userString, userChar) + " " + userChar);
			   }
			   else {
			      System.out.println(calcNumCharacters(userString, userChar) + " " + userChar + "'s");
			   }

		   }
}
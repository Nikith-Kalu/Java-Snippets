import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int highwayNumber;
      int primaryNumber;

      highwayNumber = scnr.nextInt();
      primaryNumber =  highwayNumber; 
      
     
     //primaryNumber 
     if ((highwayNumber >= 100) && (highwayNumber < 1000)) {
        while (primaryNumber > 100) {
           primaryNumber = primaryNumber - 100;
        }
     }
      //200 exception
     if ((highwayNumber == 200)) {
        System.out.println(highwayNumber + " is not a valid interstate highway number.");
        }
      //main highway
     else if ((highwayNumber < 100) && (highwayNumber>0)) {
        //Even Highway
        if (highwayNumber % 2 == 0){ 
           System.out.println("I-" + highwayNumber + " is primary, going east/west.");
        }
        //odd highway
        else {
           System.out.println("I-" + highwayNumber + " is primary, going north/south.");
           }
        }
        
        //aux highways
      else if ((highwayNumber >= 100) && (highwayNumber<1000)) {
           //Even Aux Highway
        if (highwayNumber % 2 == 0){ 
           System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going east/west.");
        }
        //odd Aux highway
        else {
           System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going north/south.");
           }
           }
      //less than 1
      else {
         System.out.println(highwayNumber + " is not a valid interstate highway number.");
         }
       
   }
}
import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
         int i;
         int input;
         int arraySize = 1;
         int arrayOne[] = new int [10];
         int middleItem;
         
         input = scnr.nextInt();
         arrayOne[0] = input;
         for (i = 1; i < 10; ++i) {
            input = scnr.nextInt();
            if (input > 0) {
               arrayOne[i] = input;
               ++arraySize;
               }
            else {break;}
         }
          middleItem = arrayOne[((arraySize/2))];
         
         if (arrayOne[9]>0) {
            System.out.println("Too many numbers");
         }
         else {System.out.println("Middle item: " + middleItem);}
      
  }
}
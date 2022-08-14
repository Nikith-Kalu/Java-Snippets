import java.util.ArrayList;

public class ArrayListPrinter {
   
   // Method prints an ArrayList of Objects
   public static void printArrayList(ArrayList<Object> objList) {
      int i;

      for (i = 0; i < objList.size(); ++i) {
         System.out.println(objList.get(i));
      }
   }
   
   public static void main(String[] args) {       
      ArrayList<Object> objList = new ArrayList<Object>();
      
      // Add new instances of various classes to objList
      objList.add(new Object());
      objList.add(12);
      objList.add(3.14);
      objList.add(new String("Hello!"));
      objList.add(new Business("ACME", "5 Main St"));     
      
      // Print list of Objects
      printArrayList(objList);   
   }
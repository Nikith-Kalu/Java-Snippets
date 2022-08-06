import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantReviews {
 
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      Restaurant ourPlace = new Restaurant();
      String currName;
   
      System.out.println("Type restaurant name: ");
      currName = scnr.nextLine();
      ourPlace.setName(currName);
      System.out.println();
   
      ourPlace.readAllReviews(scnr);
      System.out.println();
   
      ourPlace.printCommentsByRating();
   }
}
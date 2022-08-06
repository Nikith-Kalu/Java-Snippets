import java.util.ArrayList;
import java.util.Scanner;

public class ReviewSystem {
 
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      Reviews allReviews = new Reviews();
      String currName;
      int currRating;
   
      System.out.println("Type rating + comments. To end: -1");
      allReviews.inputReviews(scnr);
   
      System.out.println("\nAverage rating: ");
      System.out.println(allReviews.getAverageRating());
   
      // Output all comments for given rating
      System.out.println("\nType rating. To end: -1");
      currRating = scnr.nextInt();
      while (currRating != -1) {
         allReviews.printCommentsForRating(currRating);
         currRating = scnr.nextInt();
      }
   }
}
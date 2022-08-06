import java.util.Scanner;

// Review and Reviews classes omitted from the figure 

public class Restaurant {
   private String name;
   private Reviews reviews = new Reviews();
   
   public void setName(String restaurantName) {
      name = restaurantName;
   }
      
   public void readAllReviews(Scanner scnr) {
      System.out.println("Type ratings + comments. To end: -1");
      reviews.inputReviews(scnr);
   }
   
   public void printCommentsByRating() { 
      int i;
      
      System.out.println("Comments for each rating level: ");
      for (i = 1; i <= 5; ++i) {
         System.out.println(i + ":");
         reviews.printCommentsForRating(i);
      }
   }
}
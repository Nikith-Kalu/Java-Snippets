import java.util.ArrayList;
import java.util.Scanner;

public class Reviews {
   private ArrayList<Review> reviewList = new ArrayList<Review>();
   
   public void inputReviews(Scanner scnr) {
      Review currReview;
      int currRating;
      String currComment;
   
      currRating = scnr.nextInt();
      while (currRating >= 0) {
         currReview = new Review();
         currComment = scnr.nextLine(); // Gets rest of line
         currReview.setRatingAndComment(currRating, currComment);
         reviewList.add(currReview);
         currRating = scnr.nextInt();
      }
   }
   
   public void printCommentsForRating(int currRating) {
      Review currReview;
      int i;
   
      for (i = 0; i < reviewList.size(); ++i) {
         currReview = reviewList.get(i);
         if (currRating == currReview.getRating()) {
            System.out.println(currReview.getComment());
         }
      }
   }
   
   public int getAverageRating() {
      int ratingsSum;
      int i;
   
      ratingsSum = 0;
      for (i = 0; i < reviewList.size(); ++i) {
         ratingsSum += reviewList.get(i).getRating();
      }
      return (ratingsSum / reviewList.size());
   }
}
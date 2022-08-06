public class Review {
    private int rating = -1;
    private String comment = "NoComment";
    
    public void setRatingAndComment(int revRating, String revComment) {
       rating = revRating;
       comment = revComment;
    }
    public int getRating() { return rating; }
    public String getComment() { return comment; }
 }
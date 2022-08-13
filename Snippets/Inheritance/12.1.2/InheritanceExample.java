public class InheritanceExample {
    public static void main(String[] args) {
       Business someBusiness = new Business();
       Restaurant favoritePlace = new Restaurant();
 
       someBusiness.setName("ACME");
       someBusiness.setAddress("4 Main St");
 
       favoritePlace.setName("Friends Cafe");
       favoritePlace.setAddress("500 W 2nd Ave");
       favoritePlace.setRating(5);
 
       System.out.println(someBusiness.getDescription());
       System.out.println(favoritePlace.getDescription());
       System.out.println("  Rating: " + favoritePlace.getRating());
    }
 }
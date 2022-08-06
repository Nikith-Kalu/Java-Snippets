public class Restaurant {                          
    private String name;
    private int rating;
 
    public void setName(String restaurantName) {  // Mutator
       name = restaurantName;
    }
 
    public void setRating(int userRating) {       // Mutator
       rating = userRating;
    }
 
    public String getName() {  // Accessor
       return name;
    }
 
    public int getRating() {  // Accessor
       return rating;
    }
 
    public void print() {      // Accessor
       System.out.println(name + " -- " + rating);
    }
 }
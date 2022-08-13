// Restaurant.java
public class Restaurant extends Business {
    private int rating;
    ...
    
    @Override
    public String getDescription() {
       return name + " -- " + address +
          "\n  Rating: " + rating;
    }
 }
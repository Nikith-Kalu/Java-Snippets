public class RestaurantFavorites {
    public static void main(String[] args) {
       Restaurant favLunchPlace = new Restaurant();
       Restaurant favDinnerPlace = new Restaurant();
 
       favLunchPlace.setName("Central Deli");
       favLunchPlace.setRating(4);
 
       favDinnerPlace.setName("Friends Cafe");
       favDinnerPlace.setRating(5);
 
       System.out.println("My favorite restaurants: ");
       favLunchPlace.print();
       favDinnerPlace.print();
    }
 }
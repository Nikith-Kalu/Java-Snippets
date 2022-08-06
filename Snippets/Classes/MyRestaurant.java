public class MyRestaurant {
    public static void main(String[] args) {
       Restaurant myPlace = new Restaurant();
       myPlace.setName("Maria's Diner");
       myPlace.setRating(5);
       System.out.print(myPlace.getName() + " is rated ");
       System.out.println(myPlace.getRating());
    }
  }
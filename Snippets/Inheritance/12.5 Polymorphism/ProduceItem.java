public class ProduceItem extends GenericItem { // ProduceItem derived from GenericItem
    public void setExpiration(String newDate) {
       expirationDate = newDate;
    }
 
    public String getExpiration() {
       return expirationDate;
    }
 
    @Override
    public void printItem() {
       System.out.println(itemName + " " + itemQuantity
                                     + " (Expires: " + expirationDate + ")");
    }
 
    private String expirationDate;
 }
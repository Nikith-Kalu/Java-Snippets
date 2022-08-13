public class GenericItem {
    private String itemName;
    private int itemQuantity;
 
    public void setName(String newName) {
       itemName = newName;
    }
 
    public void setQuantity(int newQty) {
       itemQuantity = newQty;
    }
 
    public void printItem() {
       System.out.println(itemName + " " + itemQuantity);
    }
 }
public class GenericItem {
    public void setName(String newName) {
       itemName = newName;
    }
 
    public void setQuantity(int newQty) {
       itemQuantity = newQty;
    }
 
    public void printItem() {
       System.out.println(itemName + " " + itemQuantity);
    }
 
    protected String itemName;
    protected int itemQuantity;
 }
public class Business {
    private String name;
    private String address;
    
    public void setName(String busName) { 
       name = busName; 
    }
    
    public void setAddress(String busAddress) {
       address = busAddress; 
    }
    
    public String getDescription() {
       return name + " -- " + address;
    }
 }
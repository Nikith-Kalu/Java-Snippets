public class Business {
    protected String name;
    protected String address;
    
    void setName(String busName) { 
       name = busName; 
    }
    
    void setAddress(String busAddress) {
       address = busAddress; 
    }   
    
    @Override
    public String toString() {
       return name + " -- " + address;
    }
 }
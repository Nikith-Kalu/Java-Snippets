// Business.java
public class Business {
    protected String name;
    protected String address;
    ... 
 
    public String getDescription() {
       return name + " -- " + address;
    }
 }
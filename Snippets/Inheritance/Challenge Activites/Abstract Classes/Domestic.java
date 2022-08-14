public class Domestic extends Animal {
    private String owner; 
 
    public Domestic(String domesticName, int domesticAge, String domesticOwner) {
       this.name = domesticName;
       this.age = domesticAge;
       this.owner = domesticOwner;
    }
 
    public void printInfo() {
       String nameAndAge = this.getNameAndAge();
 
       System.out.println(nameAndAge);
       System.out.println("Owner: " + this.owner);
    }
 }
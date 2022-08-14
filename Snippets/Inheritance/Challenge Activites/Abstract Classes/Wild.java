public class Wild extends Animal {
    private String species; 
 
    public Wild(String wildName, int wildAge, String wildSpecies) {
       this.name = wildName;
       this.age = wildAge;
       this.species = wildSpecies;
    }
 
    public void printInfo() {
       String nameAndAge = this.getNameAndAge();
 
       System.out.println(nameAndAge);
       System.out.println("Species: " + this.species);
    }
 }
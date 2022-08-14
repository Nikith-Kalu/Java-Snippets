public abstract class Animal {
    protected String name; 
    protected int age; 
 
    abstract void printInfo();
 
    public String getNameAndAge() { 
       return this.name + ", " + age + " years";
    }
 }
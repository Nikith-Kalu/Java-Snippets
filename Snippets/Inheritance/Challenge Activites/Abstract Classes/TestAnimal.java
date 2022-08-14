public class TestAnimal {
    public static void main(String[] args) {
       Domestic myDomestic = new Domestic("Spot", 7, "Maddi");
       Wild myWild = new Wild("Paddington", 7, "Bear");
 
       myDomestic.printInfo();
       System.out.println();
       myWild.printInfo();
    }
 }
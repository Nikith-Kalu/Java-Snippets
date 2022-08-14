public class PrintMedia {
    public static void main(String[] args) {
       Media med = new Media();
 
       med.setSinger("John Mayer");
       med.setDuration(4, 6);
 
       med.printDuration();
       med.printSinger();
    }
 }
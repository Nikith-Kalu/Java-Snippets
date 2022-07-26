public class OutputTable {
    public static void main(String [] args) {
       int currC;
       double equivalentF;
       
       for (currC = -10; currC <= 40; currC += 5) {
          equivalentF = (currC * 9.0 / 5.0) + 32.0;
          
          System.out.print(currC + " C is ");
          System.out.println(equivalentF + " F");
       }
    }
 }
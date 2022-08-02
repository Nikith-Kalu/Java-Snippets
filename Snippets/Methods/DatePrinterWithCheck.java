public class DatePrinterWithCheck {
    public static void printDate(int currDay, int currMonth, int currYear) {
 
       // Parameter error checking
       if ((currDay < 1) || (currDay > 31)) {
          System.out.println("Invalid day (" + currDay + "). Using 1.");
          currDay = 1;
       }
 
       if ((currMonth < 1) || (currMonth > 12)) {
          System.out.println("Invalid month (" + currMonth + "). Using 1.");
          currMonth = 1;
       }
 
       // Begin method's normal behavior
       System.out.print(currMonth + "/" + currDay + "/" + currYear);
    }
 
    
    public static void main(String[] args) {
       printDate(30, 7, 2012);
       System.out.print("\n\n");
 
       printDate(40, 7, 2012);
       System.out.print("\n\n");
 
       printDate(30, 13, 2012);
       System.out.print("\n\n");
    }
 }
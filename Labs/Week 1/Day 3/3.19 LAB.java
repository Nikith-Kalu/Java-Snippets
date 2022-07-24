import java.util.*;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int numPeopleFri;
      int numPeopleSat;
      int numPeopleSun;
      
      double slicesPerPersonFri;
      double slicesPerPersonSat;
      double slicesPerPersonSun;
      
      double costPerPizzaFri;
      double costPerPizzaSat;
      double costPerPizzaSun;
      
      double amountPizzaFri;
      double amountPizzaSat;
      double amountPizzaSun;
      
      double costPizzaFri;
      double costPizzaSat;
      double costPizzaSun;
      
      double taxFri;
      double taxSat;
      double taxSun;
      
      double deliveryFri;
      double deliverySat;
      double deliverySun;
      
      double totalCostFri;
      double totalCostSat;
      double totalCostSun;
      
      double wkndCost;
      
      numPeopleFri = scnr.nextInt();
      slicesPerPersonFri = scnr.nextDouble();
      costPerPizzaFri = scnr.nextDouble();
      
      amountPizzaFri = Math.ceil(numPeopleFri * slicesPerPersonFri / 8);
      costPizzaFri = amountPizzaFri * costPerPizzaFri;
      taxFri = costPizzaFri * 7/100;
      deliveryFri = (costPizzaFri * 20/100) + ((costPizzaFri * 20/100) * 7/100);
      totalCostFri = costPizzaFri + taxFri + deliveryFri;
      
      System.out.println("Friday Night Party");
      System.out.printf((int)amountPizzaFri + " Pizzas: " + "$%.2f\n", costPizzaFri);
      System.out.printf("Tax: $%.2f\n", taxFri);
      System.out.printf("Delivery: $%.2f\n", deliveryFri);
      System.out.printf("Total: $%.2f\n", totalCostFri);
      System.out.println();
      
      scnr.nextLine();
      numPeopleSat = scnr.nextInt();
      slicesPerPersonSat = scnr.nextDouble();
      costPerPizzaSat = scnr.nextDouble();
      
      amountPizzaSat = Math.ceil(numPeopleSat * slicesPerPersonSat / 8);
      costPizzaSat = amountPizzaSat * costPerPizzaSat;
      taxSat = costPizzaSat * 7/100;
      deliverySat = (costPizzaSat * 20/100) + ((costPizzaSat * 20/100) * 7/100);
      totalCostSat = costPizzaSat + taxSat + deliverySat;
      
      System.out.println("Saturday Night Party");
      System.out.printf((int)amountPizzaSat + " Pizzas: " + "$%.2f\n", costPizzaSat);
      System.out.printf("Tax: $%.2f\n", taxSat);
      System.out.printf("Delivery: $%.2f\n", deliverySat);
      System.out.printf("Total: $%.2f\n", totalCostSat);
      System.out.println();
      
      scnr.nextLine();
      numPeopleSun = scnr.nextInt();
      slicesPerPersonSun = scnr.nextDouble();
      costPerPizzaSun = scnr.nextDouble();
      
      amountPizzaSun = Math.ceil(numPeopleSun * slicesPerPersonSun / 8);
      costPizzaSun = amountPizzaSun * costPerPizzaSun;
      taxSun = costPizzaSun * 7/100;
      deliverySun = (costPizzaSun * 20/100) + ((costPizzaSun * 20/100) * 7/100);
      totalCostSun = costPizzaSun + taxSun + deliverySun;
      wkndCost = totalCostFri + totalCostSat + totalCostSun;
      
      System.out.println("Sunday Night Party");
      System.out.printf((int)amountPizzaSun + " Pizzas: " + "$%.2f\n", costPizzaSun);
      System.out.printf("Tax: $%.2f\n", taxSun);
      System.out.printf("Delivery: $%.2f\n", deliverySun);
      System.out.printf("Total: $%.2f\n", totalCostSun);
      System.out.println();
      System.out.printf("Weekend Total: $%.2f\n", wkndCost);
      
   }
}
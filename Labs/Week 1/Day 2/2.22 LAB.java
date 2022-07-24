import java.util.Scanner;

public class RecipeConversion{
    public static void main(String[] args){
       Scanner scnr = new Scanner(System.in);
       
       String ingr;
       Double cups;
       Double sclFctr;
       int grams;
       
       ingr = scnr.nextLine();
       grams = scnr.nextInt();
       sclFctr =  scnr.nextDouble();
       cups = ((double)grams / 250) * sclFctr;
       
       System.out.println("Please input the name of your ingredient:");
       System.out.println("Please input the measurement in grams:");
       System.out.println("Please input the scale factor:");
       System.out.println();
       
       System.out.printf("%-20s", "Ingredient");
       System.out.printf("%-20s", "Grams");
       System.out.printf("%-20s", "Scale Factor");
       System.out.printf("%-20s\n", "Cups");
       
       System.out.printf("%-20s", ingr);
       System.out.printf("%-20d", grams);
       System.out.printf("%-20.1f", sclFctr);
       System.out.printf("%-1.2f\n", cups);
    }
}
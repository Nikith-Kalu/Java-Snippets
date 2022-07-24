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
       cups = (double)(grams / 250) * sclFctr;
       
       System.out.println("Please input the name of your ingredient:");
       System.out.println("Please input the measurement in grams:");
       System.out.println("Please input the scale factor:");
       System.out.println();
       
       System.out.printf("%-20s", "Ingredient");
       System.out.println("%-20s", "Grams");
       System.out.println("%-20s", "Scale Factor");
       System.out.println("%-20s\n", "Cups");
       
       System.out.println("%-20s", ingr);
       System.out.println("%-20d", grams);
       System.out.println("%-20.1f", sclFactor);
       System.out.println("%-1.2f\n", cups);
   
}
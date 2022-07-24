package Labs.Week 1.Day 3;

public class 3.20 LAB {
    
}
import java.util.Scanner;
public class PerfectSquare{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        
        double userInput1;
        double userInput2;
        double userInput3;
        double sqr1;
        double sqr2;
        double sqr3;
        int sqrInt1;
        int sqrInt2;
        int sqrInt3;
        String proof1;
        String proof2;
        String proof3;
        
        System.out.println("Please input your first decimal value:");
        userInput1 = scnr.nextDouble();
        System.out.println("Please input your second decimal value:");
        userInput2 = scnr.nextDouble();
        System.out.println("Please input your third decimal value:");
        userInput3 = scnr.nextDouble();
        System.out.println();
        
        sqr1 = Math.sqrt(userInput1);
        sqr2 = Math.sqrt(userInput2);
        sqr3 = Math.sqrt(userInput3);
        
    if (Math.ceil(sqr1 * sqr1) == userInput1) {
       proof1 = "true";
    }
    else {
       proof1 = "false";
    }
    
    if (Math.ceil(sqr2 * sqr2) == userInput2) {
       proof2 = "true";
    }
    else {
       proof2 = "false";
    }
    
    if (Math.ceil(sqr3 * sqr3) == userInput3) {
       proof3 = "true";
    }
    else {
       proof3 = "false";
    }
    
    System.out.printf("%-10s%-30s%-20s\n", "Input", "Square Root as Integer", "Perfect Square");
    System.out.printf("%-10.2f%-30.0f", userInput1, sqr1);
    System.out.printf("%-20s\n", proof1);
    System.out.printf("%-10.2f%-30.0f", userInput2, sqr2);
    System.out.printf("%-20s\n", proof2);
    System.out.printf("%-10.2f%-30.0f", userInput3, sqr3);
    System.out.printf("%-20s\n", proof3);
    
    
    }
    }
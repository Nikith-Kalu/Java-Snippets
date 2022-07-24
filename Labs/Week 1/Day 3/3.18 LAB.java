import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      double f0;
      double f1;
      double f2;
      double f3;
      double f4;
      double r;
      
      r = Math.pow(2, 1.0/12.0);
      f0 = scnr.nextDouble();
      f1 = f0 * Math.pow(r, 1);
      f2 = f0 * Math.pow(r, 2);
      f3 = f0 * Math.pow(r, 3);
      f4 = f0 * Math.pow(r, 4);
      
      System.out.println(f0 + " " + f1 + " " + f2 + " " + f3 + " " + f4);

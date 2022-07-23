import java.util.Scanner;
public class ProgramSummary{
    public static void main(String[] args){
        /**
         WRITE YOUR CODE BELOW
         */
         Scanner s = new Scanner(System.in);
         String name1;
         String name2;
         String name3;
         
         System.out.println("Please enter the first student name and press the enter key.");
         System.out.println("Please enter the second student name and press the enter key.");
         System.out.println("Please enter the third student name and press the enter key.");
         
         name1 = s.nextLine();
         name2 = s.nextLine();
         name3 = s.nextLine();
         
         System.out.println(name1 + ", " + name2 + ", " + name3);
    } 
import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner (System.in);
      String userPassword;
      String userPasswordMod = "";
      String exclamationMark = "!";
      
      userPassword = scnr.nextLine();
      
      userPasswordMod = userPassword.replace("i", "1");
      userPasswordMod = userPasswordMod.replace("a", "@");
      userPasswordMod = userPasswordMod.replace("m", "M");
      userPasswordMod = userPasswordMod.replace("B", "8");
      userPasswordMod = userPasswordMod.replace("s", "$");
      
      userPasswordMod = userPasswordMod.concat(exclamationMark);
      System.out.println(userPasswordMod);
   }
}

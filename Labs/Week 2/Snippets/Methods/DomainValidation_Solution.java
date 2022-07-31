import java.util.Scanner;

public class DomainValidation_Solution {                         

  // ***********************************************************************

   /**   
      getPeriodPosition - Get the position of a single period in a string.
      @param   stringToSearch - The string to search for periods
      @return  N >=0, the position of the single period in the string
               N < 0, there were no periods, or two or more periods
   */

   public static int getPeriodPosition(String stringToSearch) {
      int stringLength;
      int periodCounter;
      int periodPosition;
      int i;

      stringLength = stringToSearch.length();
      periodCounter =  0;
      periodPosition = -1;
      
      for (i = 0; i < stringLength; ++i) {
         if (stringToSearch.charAt(i) == '.') {
            ++periodCounter;
            periodPosition = i;
         }
      }

      // If there are zero or two or more periods, indicate an incorrect domain
      // name by setting variable periodPosition to -1
      if (periodCounter != 1) {
         periodPosition = -1;
      }
      return periodPosition;
   }

  // ***********************************************************************

   /**   
      hasValidSecondLevel  - Checks if the second level domain part is valid
      @param   secondLevel - The candidate second-level domain
      @return  true  - The second-level domain is valid
               false - The second-level domain is not valid

      A valid second-level domain:
      
      1. Is between 1 and 63 characters long
      2. Contains only upper- and lower-case letters, digits 0-9 and the dash
      3. Cannot begin or end with a dash
   */
   
   public static boolean hasValidSecondLevel(String secondLevel) {
      final int MAX_SECONDLEVEL_LENGTH = 63;
      final char DASH = '-';
      
      boolean isValidSecondLevel;
      int secondLevelLength;
      char nextChar;
      int i;

      isValidSecondLevel = true;    // Assume valid second-level domain
      secondLevelLength = secondLevel.length();
      nextChar = '?';
      
      // Disqualify the second-level domain if it is too short or too long, or
      // if it begins or ends with a dash
      if ((secondLevelLength >= 1) && (secondLevelLength <= MAX_SECONDLEVEL_LENGTH)) {
         if ((secondLevel.charAt(0) == DASH) || (secondLevel.charAt(secondLevelLength - 1) == DASH)) {
            isValidSecondLevel = false;
         }
      }
      else {
         isValidSecondLevel = false;
      }
      
      // Disqualify the second-level domain if any character is not a letter, 
      // digit, or a dash
      i = 0;
      while ((i < secondLevelLength) && (isValidSecondLevel)) {
         nextChar = secondLevel.charAt(i);
         if ((!Character.isLetterOrDigit(nextChar)) && (nextChar != DASH)) {
            isValidSecondLevel = false;
         }
         ++i;
      }
      
      return isValidSecondLevel;
   }

  // ***********************************************************************

   /**   
      hasValidTld - Checks if the top-level domain part is valid
      @param   theTld - The candidate top-level domain
      @return  true   - The top-level domain is valid
               false  - The top-level domain is not valid

      A valid top-level domain begins with a period and then contains only
      upper- and lower-case letters, or digits 0-9.
   */
   
   public static boolean hasValidTld(String theTld) {
      boolean isValidTopLevel;  
      int topLevelLength;
      char nextChar;
      int i;
      
      isValidTopLevel = true;    // Assume valid top-level domain
      topLevelLength = theTld.length();
      nextChar = '?';

      // Disqualify the top-level domain if it is the empty string or
      // the first character is not a period

      if ((topLevelLength <= 0) || (theTld.charAt(0) != '.')) {
         isValidTopLevel = false;
      }

      // Disqualify the top-level domain if any character is not a letter
      // or a digit
      i = 1;
      while ((i < topLevelLength) && (isValidTopLevel)) {
         nextChar = theTld.charAt(i);
         if (!Character.isLetterOrDigit(nextChar)) {
            isValidTopLevel = false;
         }
         ++i;
      }
      
      return isValidTopLevel;
   }

  // ***********************************************************************

   /**   
      isSpecialGtld - Checks if the TLD part is a special gTLD
      @param   specialGtld - An array of valid special gTLD names
      @param   tld   - A candidate top-level domain name
      @return  true  - The TLD is a special gTLD
               false - The TLD is not a special gTLD

   */
   
   public static boolean isSpecialGtld(String [] specialGtld, String tld) {
      boolean isSpecial;
      int i;
   
      isSpecial = false;
      i = 0;

      while ((i < specialGtld.length) && (!isSpecial)) {
         if (specialGtld[i].equals(tld)) {
            isSpecial = true;
         }
         else {
            ++i;
         }
      }
      return isSpecial;
   }

  // ***********************************************************************

   /**   
      getString - Prompts for an input string from the user
      @param   input  - the source of the input (a Scanner object)
      @param   prompt - the prompt to show the user
      @return  The string entered by the user (which could be empty)
   */
 
   public static String getString(Scanner input, String prompt) {
      String userInput;
      
      System.out.println(prompt);
      userInput = input.nextLine();

      return userInput;
   } 
   
  // ***********************************************************************

  public static void main (String [] args) { 
      final String PROMPT_DOMAIN_NAME = "\nEnter the next domain name (Enter to exit): ";
      Scanner scnr = new Scanner(System.in);
      
      // Define the list of valid core gTLDs and restricted gTLDs
      String [] validCoreGtld = { ".com", ".net", ".org", ".info" };
      String [] validRestrictedGtld = { ".biz", ".name", ".pro" };
      String inputName;
      String searchName;
      String secondLevel;        // In aaa.bbb, the aaa part, aka second-level domain
      String theTld;             // In aaa.bbb, the bbb part, aka top-level domain
      int periodPosition;
      boolean isCoreGtld;
      boolean isPeriodPositionValid;
      boolean isRestrictedGtld;
      boolean isDomainValid;

      int i;

      theTld = "";
      isCoreGtld = false;
      isPeriodPositionValid = false;
      isRestrictedGtld = false;
      isDomainValid = false;

      // Get the first domain name to process
      inputName = getString(scnr, PROMPT_DOMAIN_NAME);

      while (inputName.length() > 0) {
         searchName     = inputName.toLowerCase();
         isCoreGtld     = false;
         isDomainValid  = false;
         periodPosition = getPeriodPosition(searchName);

         // The domain name is valid if there is exactly one period in the
         // domain name (at location periodPosition) and the domain name does
         // not start or end with a period. Note that a period position of 0 means
         // the first character is a period, rendering the domain name invalid
         if ((periodPosition > 0) &&
             (searchName.charAt(searchName.length() - 1) != '.')) {
            isPeriodPositionValid = true; 
         }
         else {
            isPeriodPositionValid = false;
         }

         if (isPeriodPositionValid) {
            // Extract the second-level domain and the top-level domain
            secondLevel   = searchName.substring(0, periodPosition);
            theTld        = searchName.substring(periodPosition);
            isDomainValid = hasValidSecondLevel(secondLevel) &&
                            hasValidTld(theTld);

            // If the domain name is valid see if there is a core gTLD
            // or a restricted gTLD
            if (isDomainValid) {
               isCoreGtld = isSpecialGtld(validCoreGtld, theTld);
               if (!isCoreGtld) {
                  isRestrictedGtld = isSpecialGtld(validRestrictedGtld, theTld);
               }
            }
         }
  
         // Display the results
         System.out.print("\"" + inputName + "\" ");
         if (isDomainValid) {
            System.out.print("is a valid domain name and ");
            if (isCoreGtld) {
               System.out.println("has a core gTLD of \"" + theTld + "\".");
            }
            else if (isRestrictedGtld) {
               System.out.println("has a restricted gTLD of \"" + theTld + "\".");
            }
            else {
               System.out.println("has a TLD of \"" + theTld + "\".");
            }
         }
         else {
            System.out.println("is not a valid domain name.");
         }

         // Get the next domain name to process
         inputName = getString(scnr, PROMPT_DOMAIN_NAME);
      }
   } 
}

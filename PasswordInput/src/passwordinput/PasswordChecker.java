package passwordinput;

/**
 * @author Moises Henriquez
 * @date February 27, 2016
 */
public class PasswordChecker {
    
    //Default constructor
    private PasswordChecker(){}
    
    //Method checks if the password meets the established requirements
    public static Boolean checkPassword(String pw){
        //Check if password length is at least 8 characters
        if (pw.length() >= 8) {
            Boolean hasSpecialChar = false;
            Boolean hasUpperCase = false;
            Boolean hasLowerCase = false;
            Boolean hasDigit = false;
            
            for (int i = 0; i < pw.length(); ++i){ //i == instance
                //Check if character is a whitespace
                if (Character.isWhitespace(pw.charAt(i))){
                    return false;
                }
                //Check if character is a special character
                if (!Character.isLetterOrDigit(pw.charAt(i))){
                    hasSpecialChar = true;
                }
                //Check if character is uppercase
                if (Character.isUpperCase(pw.charAt(i))){
                    hasUpperCase = true;
                }
                //Check if character is lowercase
                if (Character.isLowerCase(pw.charAt(i))){
                    hasLowerCase = true;
                }
                //Check if character is a number
                if (Character.isDigit(pw.charAt(i))){
                    hasDigit = true;
                }
            }
            
            if (hasSpecialChar == true && hasUpperCase == true && hasLowerCase == true && hasDigit == true){
                return true;
            }
        }
        return false;
    }
}

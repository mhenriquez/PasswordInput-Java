package passwordinput;
import javax.swing.*;
/**
 * @author Moises Henriquez
 * @date February 27, 2016
 */
public class PasswordInput {
    
    public static void main(String[] args) {
        
        String input;
        input= JOptionPane.showInputDialog(null,"Please enter your password","Password",JOptionPane.QUESTION_MESSAGE);
        
        if (!PasswordChecker.checkPassword(input)){
            JOptionPane.showMessageDialog(null, "Password is invalid!\nPassword must contain a letter,\na number, a special character\nand be 8 characters or longer with no spaces.", "Password Check Result", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Password is valid!", "Password Check Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

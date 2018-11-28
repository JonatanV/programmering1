import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.awt.*;

public class Addition {
    static Scanner scanner;
    public static void main(String args[])
    {
       try
       {
           scanner = new Scanner(System.in);
           double firstNum, secondNum, answer;

           firstNum = scanner.nextDouble();
           secondNum = scanner.nextDouble();

           answer = firstNum + secondNum;
          
           JOptionPane.showMessageDialog(null, answer);
           Toolkit.getDefaultToolkit() .beep();
       }
       catch (InputMismatchException e)
       {
           System.out.println("Invalid input");
       }
       finally
       {
           scanner.close();
       }
}
}
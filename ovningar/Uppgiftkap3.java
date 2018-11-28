import javax.swing.*;
import java.awt.Toolkit;
import java.util.*;

public class Uppgiftkap3 {
	public static void main(String[] args){
	
	Scanner q = new Scanner(System.in);

	double r = q.nextDouble();

	JOptionPane.showMessageDialog(null, "Cirklens asrea är "+ MyMath.cirkelArea(r));
	}
}
import javax.swing.JOptionPane;
import java.awt.Toolkit;
public class Uppgifter2{
	public static void main(String[] args){
	char c1 = '\u00D8';
	char c2 = '\u00F8';
	char c3 = '\u03C0';
    Toolkit.getDefaultToolkit() .beep ();
    JOptionPane.showMessageDialog(null, c1);
    Toolkit.getDefaultToolkit() .beep ();
    JOptionPane.showMessageDialog(null, c2);
    Toolkit.getDefaultToolkit() .beep ();
    JOptionPane.showMessageDialog(null, c3);
	} 
}
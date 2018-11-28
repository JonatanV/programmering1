import javax.swing.JOptionPane;
import java.awt.Toolkit;
public class HelloWorld2 {
	public static void main (String[] args){
	String s1, s2, s3, s4;
    s1 = "Hello World";
    s2 = " My name is ";
    s3 = "user.name";
    s4 = "os.name";
    System.getProperty(s3 + s4);
    JOptionPane.showMessageDialog(null,s1 + s2 +
    	System.getProperty(s3));
   JOptionPane.showMessageDialog(null, "Du använder" +
   	                       System.getProperty(s4));

	}
}

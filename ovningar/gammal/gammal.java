import java.util.*;
import javax.swing.*;
import java.awt.*;

public class gammal{
	public static void main(String[] args){
		String number = JOptionPane.showInputDialog(null,"Which year were you born?",JOptionPane.QUESTION_MESSAGE);
		int result = Integer.parseInt(number);
		int year = Calendar.getInstance().get(Calendar.YEAR);
		JOptionPane.showMessageDialog(null,"You are " + ( year - result ) + " years old","",JOptionPane.PLAIN_MESSAGE);

	if(year-result>=65){
		Toolkit.getDefaultToolkit() .beep();
		JOptionPane.showMessageDialog(null,"Old","",JOptionPane.WARNING_MESSAGE);
	}
	if(year-result <=16) {
		Toolkit.getDefaultToolkit() .beep();
		JOptionPane.showMessageDialog(null,"Ha Younger than me","baby",JOptionPane.WARNING_MESSAGE);
			
	}
	if( 18 < (year-result) && (year-result) < 64){
		Toolkit.getDefaultToolkit() .beep();
		JOptionPane.showMessageDialog(null,"Middle aged person","",JOptionPane.WARNING_MESSAGE);
		
	}
}

}
import javax.swing.*;
import java.util.*;
public class Uppgiftkap3two{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		double temp = in.nextDouble();

		if (temp < 18){
			JOptionPane.showMessageDialog(null, "Turn on the heat");
	} else{
		JOptionPane.showMessageDialog(null,"Lower the heat");				

			
		}
	}
}

import java.util.Random;
import javax.swing.JOptionPane;

public class ting2{
	public static void main(String[] args){

		int n=0;
		int p=0;

	while(n!=666){

		Random rand = new Random();
		p++;
 		n = rand.nextInt(1000) + 1;
 		System.out.println(n);

		}
		JOptionPane.showMessageDialog(null,"It Took "+ p +" Tries to find");
			JOptionPane.showMessageDialog(null,"The Number of The Beast","",JOptionPane.WARNING_MESSAGE);
	}
}

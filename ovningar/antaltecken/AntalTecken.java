import javax.swing.JOptionPane;

public class AntalTecken {
	public static void main (String[] args){
		String namn;
		namn = JOptionPane.showInputDialog(null, "What is your name?");
		JOptionPane.showMessageDialog(null, "Welcome " + namn);
		int Tecken;
		Tecken = namn.length();
		JOptionPane.showMessageDialog(null, "Your name has " + Tecken + " Letters");
	}
}
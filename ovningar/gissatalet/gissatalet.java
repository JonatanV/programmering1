import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class gissatalet{
	public static void main(String []args){
	
		Random rand = new Random();
		
		int n = rand.nextInt(100) + 1;
		System.out.println("Gissa Talet?");
		int i=-15;
		int p=10;
		while(i!=n){
			Scanner q= new Scanner(System.in);
			p--;
			i=q.nextInt();  
				
					if(i>n){
						System.out.println("Lower");
						System.out.println("Guess Again!");

					}
					if(i<n){
						System.out.println("Higher");
						System.out.println("Guess Again!");
					}
				
				}
				JOptionPane.showMessageDialog(null,"Congrats you have guessed the right number the number was "+i," ",JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(null,"You got "+p+" points","",JOptionPane.PLAIN_MESSAGE);

		} 
	}
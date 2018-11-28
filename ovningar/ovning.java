import java.util.Scanner;

public class ovning {
	public static void main(String [] args) {
	String pwd = "mangaz301";
	String guess = "";
	Scanner in = new Scanner(System.in);
	System.out.println("password");

	while(!guess.equals(pwd)) {
		guess = in.nextLine();

	if (guess.equals(pwd)) {
		System.out.println("du loggas in");
	 } 
	 else {
		System.out.println("Del lösenord");
		System.out.println("försök igen");
	}
}
	System.out.println("Du är tillgänglig all data");
	}

}
	

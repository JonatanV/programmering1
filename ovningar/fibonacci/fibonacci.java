public class fibonacci{
	public static void main(String [] args){
		double firstnum = 0;
		double secnum = 1;
		double count = 0;

		while (count < 1475) {
			double tmp = firstnum + secnum ;
			System.out.println(tmp + "");
			firstnum = secnum;
			secnum = tmp;
			count++;

		}
	}
}
package Repetitionsuppgifter;

public class Sparandet {

	public static void main(String[] args) {
		
		double portfolj = 0;
		
		for (int i = 0; i < 20; i++) {
			portfolj += 20000 * 12;
			portfolj *= 1.02;
		}
		
		System.out.println(portfolj);
		
	}
	
}

package LäxaRepetition;

public class OkantAntalHeltal {

	public static void main(String[] args) {
		
		int[] array = new int[] {1,3,4,5,7,3,4,6,7,8,8,5,5,6,56};
		
		System.out.println(numbers(array));
		
	}
	
	public static int numbers(int[] array) {
		int summa = 0;
		for (int i = 0; i < array.length; i++) {
			summa += array[i];
		}
		return summa;
	}
	
	
}

package LäxaRepetition;

public class Anagram {

	public static void main(String[] args) {
		anagram("golf");
	}
	
	private static String word = "";
	
	public static void anagram(String str) {
		if (word.isEmpty()) {
			word = str;
		}
		
		System.out.println(word);
	}
	
}

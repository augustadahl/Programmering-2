package LäxaRepetition;

public class RekursivReverse {

	public static void main(String[] args) {
		System.out.println(reverse("Luddig Lava"));
	}
	
	public static String reverse(String Word) {
		if (Word.length() == 1) {
			return Word;
		} else {
			return Word.charAt(Word.length() - 1) + reverse(Word.substring(0, Word.length() - 1));
		}
	}
	
}

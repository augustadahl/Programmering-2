package LäxaRepetition;

public class Anagram {

	public static void main(String[] args) {
		anagram("golf");
	}

	private static String word = "";
	private static int[] index;

	public static void anagram(String str) {
		if (word.isEmpty()) {
			word = str;
			index = new int[str.length()];
		}

		System.out.println(str);

		str = str.substring(0, index[0]) + str.substring(index[0] + 1, index[0] + 2)
				+ str.substring(index[0], index[0] + 1) + str.substring(index[0] + 2);
		
		if (index[0] < str.length()) {
			index[0]++;
		} else {
			index[0] = 0;
		}
		
		
		anagram(str);

	}

}

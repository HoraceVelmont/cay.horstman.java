package ch8;

public class Example06 {
	public static void main(String[] args) {
		String str = "Hey";

		System.out.println(isWord(str));
	}

	private static boolean isWord(String str) {
		return str.codePoints().allMatch(i -> Character.isAlphabetic(i) || i != 32);
	}
}

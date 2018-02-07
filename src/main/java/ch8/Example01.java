package ch8;

import java.util.Arrays;
import java.util.List;

public class Example01 {
	private static String[] strArray = { "abcde", "abc", "string", "strong", "vessel", "sor", "sortedSt", "heyAsSort" };

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList(strArray);
		long count = stringList.stream().filter(s -> {
			System.out.println(s);
			return s.length() > 4;
		}).limit(5).count();
	}
}

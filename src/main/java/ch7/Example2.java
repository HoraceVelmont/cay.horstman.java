package ch7;

import java.util.Arrays;
import java.util.List;

public class Example2 {
	private static String[] STR_CON_LIST = { "abc", "Abc", "velmont", "haha" };

	public static void main(String[] args) {
		List<String> strList = Arrays.asList(STR_CON_LIST);
		strList.replaceAll(String::toUpperCase);
		strList.forEach(System.out::println);
	}
}

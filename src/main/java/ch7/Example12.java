package ch7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example12 {
	private static String senctence = "Have you never been mellow.";

	public static void main(String[] args) {
		String[] strArray = senctence.split(" ");
		System.out.println(strArray);
		List<String> strList = new ArrayList<>();
		for (String str : strArray) {
			str = str.toLowerCase();
			if (str.endsWith("."))
				str = str.substring(0, str.length() - 1);
			strList.add(str);
		}
		Collections.shuffle(strList);
		strList.forEach(s -> System.out.println(s));
	}
}

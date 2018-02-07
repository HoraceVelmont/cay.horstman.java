package ch7;

import java.util.HashMap;
import java.util.Map;

public class Example9 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.merge("word", 1, Integer::sum);
		map.forEach((s, integer) -> System.out.println("s : " + s + "value : " + integer));
	}
}

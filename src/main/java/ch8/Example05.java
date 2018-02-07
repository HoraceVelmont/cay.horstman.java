package ch8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example05 {
	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		letters("boat").forEach(System.out::println);
	}

	public static Stream<String> letters(String s) {
		return IntStream.rangeClosed(0, s.length() - 1).mapToObj(n -> Character.toString(s.charAt(n)));
	}
}

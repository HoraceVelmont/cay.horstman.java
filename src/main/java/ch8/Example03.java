package ch8;

import java.util.stream.Stream;

public class Example03 {
	public static void main(String[] args) {
		int[] values = { 1, 4, 9, 16 };
		Stream<int[]> integerStream = Stream.of(values);
		integerStream.forEach(s -> System.out.println(s));
	}
}

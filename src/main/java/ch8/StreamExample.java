package ch8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		// 순차 스트림
		List<String> collection = new ArrayList<>();
		Stream<String> stream = collection.stream();

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7 };
		IntStream iStream = Arrays.stream(numbers);

		Stream<String> strStream = Stream.of("Using", "Stream", "API", "from", "Java8");

		LongStream longStream = LongStream.rangeClosed(1, 10);

		int sum = IntStream.rangeClosed(1, 100).reduce(0, (left, right) -> left + right);
		System.out.println(sum);

		int sum2 = IntStream.rangeClosed(1, 100).parallel().reduce(0, (left, right) -> left + right);
		System.out.println(sum2);
	}
}

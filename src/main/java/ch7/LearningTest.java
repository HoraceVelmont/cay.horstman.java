package ch7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class LearningTest {
	public static void main(String[] args) {

		intStreamTest();
	}

	public static void collectTest() {
		List<Student> studentList = Arrays.asList(new Student(), new Student());


	}

	public static void intStreamTest() {
		int[] a = { 10, 20, 30, 40, 50 };
		int sum = IntStream.of(a).sum();
		int sum2 = IntStream.range(0, 5).sum();
		System.out.println(sum2);
	}
}

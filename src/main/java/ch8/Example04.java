package ch8;

import java.util.stream.Stream;

public class Example04 {
	public static void main(String[] args) {
		long seed = 0;
		long a = 25214903917l;
		long c = 11;
		long m = (long) Math.pow(2, 48);
		Stream.iterate(seed, (x) -> ((a * x + c) % m)).limit(1000).forEach(System.out::println);
	}
}

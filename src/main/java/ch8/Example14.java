package ch8;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Example14 {
	public static void main(String[] args) {
		Stream<Double> doubleStream = Stream.of(1.0, 2.0, 3.0);
		//double sum = doubleStream.reduce(0, (left, right) -> left + right);
		//long count = doubleStream.count();
		DoubleStream doubleStream2 = DoubleStream.of(1.0, 2.0);

		double avg2 = doubleStream2.average().orElse(0.0);
		double avg = doubleStream.mapToDouble(d -> d).average().orElse(0.0);
		System.out.println(avg2);
	}
}

package ch5;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Problem1 {
	public static final double[] testDoubleList = { 1.0, 2.0, 3.0 };

	@Test
	public void testReadValues() throws IOException, NumberFormatException {
		List<Double> doubleList = ReadFloat.readValues("double.txt");

		for (int i = 0; i < doubleList.size(); i++)
			assertThat(doubleList.get(i), is(testDoubleList[i]));
	}

	@Test
	public void testSumOfValues() throws IOException, FileNotFoundException {
		double sum = ReadFloat.sumOfValues("double.txt");

		assertThat(sum, is(6.0));
	}

}

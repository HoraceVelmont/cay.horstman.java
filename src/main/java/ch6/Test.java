package ch6;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;

public class Test {

	public static void main(String[] args) {
		//		OrderedSub os = new OrderedSub();
		//		os.equals(new OrderedSub());

		Double[] nums = { 1.0, 2.0, 3.0 };
		Number[] numa = Test.swap(0, 2, 1.5, 2, 3);
		for (Double num : nums) {
			System.out.println(num);

		}
		Test.repeat(10, 42, Integer[]::new);
	}

	public static <T> T[] swap(int i, int j, T... values) {
		T temp = values[i];
		values[i] = values[j];
		values[j] = temp;
		return values;
	}

	public static <V, K> Pair<V, K> firstLast(Map.Entry<V, K> a) {
		return (Pair<V, K>) a;
	}

	public static <T> void maxmin(List<T> elements, Comparator<? super T> comp, List<? super T> result) {

	}

	public static <T> T[] repeat(int n, T obj, IntFunction<T[]> constr) {
		return null;
	}
}

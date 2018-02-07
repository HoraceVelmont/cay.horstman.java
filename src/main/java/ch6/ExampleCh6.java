package ch6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntFunction;

public class ExampleCh6 {

	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
		Comparator<String> c = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return 0;
			}
		};
		ExampleCh6.maxmain(a, c, a);
	}

	public static <T, K> void maxmain(List<T> elemetns, Comparator<? super T> comp, List<? super T> result) {
		ExampleCh6.swapHelper(result, 0, 1);
	}

	public static void swap(ArrayList<?> elements, int i, int j) {
		swapHelper(elements, i, j);
	}

	private static <T> void swapHelper(List<T> elements, int i, int j) {
		T temp = (T) elements.get(i);
		elements.set(i, (T) elements.get(j));
		elements.set(j, temp);
	}

	public static <T> T[] repeat(int n, T obj, IntFunction<T[]> constr) {
		T[] result = constr.apply(n);
		for (int i = 0; i < n; i++)
			result[i] = obj;
		return result;
	}
}

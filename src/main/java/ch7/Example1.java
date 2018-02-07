package ch7;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.IntStream;

public class Example1 {
	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<>();
		makeErathostenesHashSetRemoveMin(hashSet, 19);

	}

	public static void makeErathostenesHashSet(HashSet<Integer> set, int N) {
		IntStream.range(2, N + 1).forEach(value -> set.add(value));
		int i = 2;
		while (i < N * N) {
			for (int j = i; j * i <= N; j++)
				if (set.contains(j * i))
					set.remove(j * i);
			i++;
		}
		set.forEach(integer -> System.out.println(integer));
	}

	public static void makeErathostenesHashSetRemoveMin(HashSet<Integer> set, int N) {
		IntStream.range(2, N + 1).forEach(v -> set.add(v));
		int i = 2;
		while (i < N * N) {
			if (i == N)
				break;
			for (int j = i; j * i <= N; j++)
				if (set.contains(j * i))
					set.remove(j * i);
			System.out.println(i);
			set.remove(i);
			int min = N;
			Iterator<Integer> it = set.iterator();
			while (it.hasNext())
				min = Math.min(min, it.next());

			i = min;
		}
	}

	public static void makeErathostenetBitSet(BitSet set, int N) {
		BitSet bitSet = new BitSet();
	}
}

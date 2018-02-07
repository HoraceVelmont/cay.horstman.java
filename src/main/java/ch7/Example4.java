package ch7;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Example4 {
	public static void main(String[] args) {
		int[] aArray = { 1, 3, 5, 6, 9 };
		List<Integer> aList = new ArrayList<>();
		for (int i = 0; i < aArray.length; i++) {
			aList.add(aArray[i]);
		}
		ListIterator<Integer> it1 = aList.listIterator();
		ListIterator<Integer> it2 = aList.listIterator();
		while (it1.hasNext() && it2.hasNext()) {
			int i1 = it1.next();
			it1.add(2);
			int i2 = it2.next();
		}
	}
}

package ch7;

import java.util.*;

public class Example6 {
	public static void main(String[] args) {
		Map<String, Set<Integer>> toc = new TreeMap<>();
		Set 개요셋 = new HashSet();
		개요셋.add(1);
		toc.put("개요", 개요셋);

		String content = "a b c d e f g a h e r";

		List<String> list = Arrays.asList(content.split(" "));
		Map<String, Integer> fileCounter = new TreeMap<>();
		list.forEach(s -> fileCounter.merge(s, 1, Integer::sum));
		fileCounter.forEach((s, integer) -> System.out.println(s + " : " + integer));
	}
}

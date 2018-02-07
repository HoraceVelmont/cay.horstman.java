package ch8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Example07 {
	public static void main(String[] args) throws IOException {
		File file = new File("alice.txt");
		Map<String, Long> wordCount = Files.lines(Paths.get("alice.txt"))
				.flatMap(line -> Arrays.stream(line.trim().split(" ")))
				.map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase().trim()).filter(word -> word.length() > 0)
				.map(word -> new AbstractMap.SimpleEntry<>(word, 1))
				.collect(groupingBy(AbstractMap.SimpleEntry::getKey, counting()));
		//wordCount.forEach((k, v) -> System.out.println(String.format("%s ==>> %d", k, v)));

		wordCount.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).limit(5)
				.forEach(System.out::println);
	}
}

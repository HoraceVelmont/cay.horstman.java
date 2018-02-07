package ch8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Example08 {
	public static void main(String[] args) throws IOException {
		Long count = Files.lines(Paths.get("words.txt")).flatMap(line -> Arrays.stream(line.split(" ")))
				.map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase().trim())
				.filter(s -> s.contains("a") && s.contains("i") && s.contains("u") && s.contains("o") && s
						.contains("e")).peek(System.out::println).count();
		System.out.println("Count : " + count);
	}
}

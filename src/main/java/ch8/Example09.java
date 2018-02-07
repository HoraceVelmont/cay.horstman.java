package ch8;

import java.io.File;
import java.io.IOException;

public class Example09 {
	public static void main(String[] args) throws IOException {
		File file = new File("alice.txt");
		//		Map<String, Long> wordCount = Files.lines(Paths.get("alice.txt"))
		//				.flatMap(line -> Arrays.stream(line.split(" ")))
		//				.map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase().trim())
	}
}

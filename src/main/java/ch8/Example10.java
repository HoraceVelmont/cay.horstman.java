package ch8;

import java.io.File;
import java.io.IOException;

public class Example10 {
	public static void main(String[] args) throws IOException {
		File file = new File("alice.txt");
		//Long count = Files.lines(Paths.get("words.txt")).flatMap(line -> Arrays.stream(line.split(" "))).forEach();
	}
}

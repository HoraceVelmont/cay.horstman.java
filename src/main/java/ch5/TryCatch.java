package ch5;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TryCatch {
	public static void tryCatch1() {
		BufferedReader in = null;
		try {
			in = Files.newBufferedReader(Paths.get("double.txt"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			System.out.println(e);
		} finally {

		}
	}

	public static void tryCatch2() {
		BufferedReader in = null;
		try {
			in = Files.newBufferedReader(Paths.get("double.txt"), StandardCharsets.UTF_8);
			try {
				in.close();
			} catch (IOException e) {

			}
		} catch (IOException e) {
			try {
				in.close();
			} catch (IOException ee) {

			}
		}
	}
}

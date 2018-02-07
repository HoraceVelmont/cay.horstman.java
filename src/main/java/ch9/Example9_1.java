package ch9;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example9_1 {
	public static void main(String[] args) throws IOException {
		streamDemo();
	}

	public static byte[] readAllBytes(InputStream in) throws IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		copy(in, out);
		out.close();
		return out.toByteArray();
	}

	public static void copy(InputStream in, OutputStream out) throws IOException {
		final int BLOCKSIZE = 1024;
		byte[] bytes = new byte[BLOCKSIZE];
		int len;
		while ((len = in.read(bytes)) != -1)
			out.write(bytes, 0, len);

	}

	public static void charsetDemo() {
		System.out.println("Default charset on this computer : " + Charset.defaultCharset());
		System.out.println("Available charsets on this JVM : " + Charset.availableCharsets().keySet());

		String str = "Java\u2122";
		System.out.println(str);

		byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
		showBytes(bytes);
		showBytes(str.getBytes(StandardCharsets.UTF_16));
		showBytes(str.getBytes(StandardCharsets.ISO_8859_1));
		System.out.println(new String(bytes, Charset.forName("windows-1252")));
	}

	public static void showBytes(byte[] bytes) {
		for (byte b : bytes)
			System.out.printf("%2X", b);
		System.out.println();
	}

	public static void streamDemo() throws IOException {
		Path path = Paths.get("alice.txt");
		try (InputStream in = Files.newInputStream(path)) {
			int firstByte = in.read();
			System.out.println("First byte: " + firstByte);
			byte[] moreBytes = new byte[1_000_000];
			int bytesRead = in.read(moreBytes);
			System.out.println("Bytes read : " + bytesRead);
		}

		byte[] allBytes = Files.readAllBytes(path);
		String contents = new String(allBytes, StandardCharsets.UTF_8);
		System.out.println(contents.substring(0, 50) + "...");

		byte[] helloBytes = { 72, 101, 108, 108, 111, 10 };
		path = Paths.get("alice.txt");
		try (OutputStream out = Files.newOutputStream(path)) {
			out.write(helloBytes);
		}

		InputStream in = new ByteArrayInputStream(helloBytes);
		int n;
		do {
			n = in.read();
			System.out.println(n);
		} while (n != -1);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		out.write(helloBytes);

		byte[] bytes = out.toByteArray();
		System.out.println(new String(bytes,StandardCharsets.UTF_8));
	}
}

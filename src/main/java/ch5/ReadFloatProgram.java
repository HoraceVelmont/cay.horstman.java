package ch5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class ReadFloatProgram {
	private static final String fileName = "double.txt";

	public static void main(String[] args) {
		try {
			List<Double> doubleList = ReadFloat.readValues(fileName);
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다 : " + e);
		} catch (IOException e) {
			System.out.println("파일을 읽는 중 에러가 발생했습니다.");
		} catch (NumberFormatException e) {
			System.out.println("파일 내용 중 double이 아닌 값이 있습니다");
		}
	}
}

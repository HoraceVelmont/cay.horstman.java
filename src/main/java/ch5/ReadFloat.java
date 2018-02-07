package ch5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFloat {

	public static ArrayList<Double> readValues(String filename) throws IOException, NumberFormatException {
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		String readValue;
		ArrayList<Double> doubleList = new ArrayList<>();
		while ((readValue = br.readLine()) != null) {
			doubleList.add(Double.parseDouble(readValue));
		}
		br.close();
		fr.close();
		return doubleList;
	}

	public static double sumOfValues(String filename) throws IOException {
		List<Double> doubleList = ReadFloat.readValues(filename);
		double sum = 0;
		for (Double doubleValue : doubleList) {
			sum += doubleValue;
		}
		return sum;
	}

}

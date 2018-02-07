package ch5;

public class Factorial {
	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(n);
			}
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		Factorial.factorial(5);
	}
}

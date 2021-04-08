package javaprograms;

public class Countdigits {

	public static void main(String[] args) {
		int a = 123456;
		int count = 0;
		while (a > 0) {
			a = a / 10;
			System.out.println(a);
			count++;
		}
		System.out.println("digits in the number are    " + count);

		int c = 12345678;
		String val = String.valueOf(c);
		System.out.println(val);
		String str[] = val.split("");
		for (String values : str) {
			System.out.println(values + "===============");
		}

	}

}

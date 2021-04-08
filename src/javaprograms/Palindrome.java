package javaprograms;

public class Palindrome {

	public static void main(String[] args) {
		int a = 1221;
		int rev = 0;
		while (a > 0) {
			rev = rev * 10 + a % 10;
			a = a / 10;

		}
		System.out.println(rev);
		if (rev==a) {
			System.out.println("number is palindrome");
		}
	}

}

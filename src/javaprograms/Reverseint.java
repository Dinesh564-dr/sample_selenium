package javaprograms;

public class Reverseint {

	public static void main(String[] args) {
		int a = 1281;
		int b=99898;
		int rev = 0,rev1=0;
		while (a > 0) {
			rev = rev * 10 + a % 10;
			a = a / 10;

		}
		System.out.println(rev);
		while (b > 0) {
			rev1 = rev1  + b % 10;
			b = b / 10;

		}
		System.out.println(rev1);
	}

}

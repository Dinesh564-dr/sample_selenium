package javaprograms;

public class NoofoddANDeven {

	public static void main(String[] args) {

		int a = 123456;
		int rem;
		int even = 0;
		int odd = 0;
		while (a > 0) {
			rem = a % 10;
			// a=a/10;
			if (rem % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			a = a / 10;
		}
		System.out.println("even no count is   " + even);
		System.out.println("odd no count is  " + odd);
	}

}

package javaprograms;

public class Prime {

	public static void main(String[] args) {
		int num = 5;
		int count = 0;
		if (num > 1) {
			for (int i = 1; i <=num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
		} else
			System.out.println("number is not prime");
		if (count == 2) {
			System.out.println("number is prime " + num);
		}
	}

}

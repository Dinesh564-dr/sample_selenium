package javaprograms;

public class Fibanocci {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c ;
		// 0,1,1,2,3,5,8,13.......
		System.out.println(a + "-----" + b + "------");
		for (int i = 2; i < 10; i++) {
			c = a + b;
			System.out.println("fibanocci series " + c);
			a = b;
			b = c;
			

		}
	}

}

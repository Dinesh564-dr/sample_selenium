package javaprograms;

public class ReverseString {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("dinesh");
		System.out.println(str.reverse());

		String str2 = "reddy";
		String rev = "";
		for (int i = str2.length()-1; i >= 0; i--) {
			rev = rev + str2.charAt(i);
		}
		System.out.println(rev);
		
	
	}

}

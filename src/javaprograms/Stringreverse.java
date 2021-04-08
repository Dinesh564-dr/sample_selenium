package javaprograms;

public class Stringreverse {

	public static void main(String[] args) {
		/*
		 * StringBuffer sb=new StringBuffer("dinesh"); sb.reverse();
		 * System.out.println(sb);
		 */
		
		String str="ramu";
		String rev = "";
		char[] ch=str.toCharArray();
		for (int i = str.length()-1; i >=0; i--) {
			rev=rev+ch[i];
		
		}
		System.out.println(rev);
		
	}

}

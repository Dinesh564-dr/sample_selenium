package javaprograms;

public class Stringswap {

	public static void main(String[] args) {
		String str1="dinesh";
		String str2="mahesh";
		 
		str1=str1+str2;
		System.out.println(str1);
		str2=str1.substring(0,str1.length()-str2.length());
		System.out.println(str2);
		str1=str1.substring(str2.length());
		System.out.println(str1);
	}

}

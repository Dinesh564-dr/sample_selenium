package javaprograms;

public class StringPrograms {

	public static void main(String[] args) {
		String str="qapital Qa";
		String str2=str.replace(" ","");
		System.out.println(str2);
		
		String arr[]=str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String str3="Qapitol Qap";
		//op:-qlotipa qpo
		String str4=str3.substring(1,7);
		System.out.println(str4);
		String rev ="";
		for (int i =str4.length()-1; i >=0; i--) {
			rev=rev+str4.charAt(i);
		}
		System.out.println(rev);
		String str5=str.substring(0, rev.length());
		System.out.println(str5);
	}

}

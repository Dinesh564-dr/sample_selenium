package javaprograms;

public class Removespecialchars {

	public static void main(String[] args) {
		String str="(@#$%^dinesh+_)";
		str=str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(str);
	}

}

package javaprograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharinString {

	public static void main(String[] args) {
		String str = "dineshdishd";
		Set<Character> uniqueChars = new HashSet<Character>();
		Set<Character> repeats = new HashSet<Character>();
		for(int i = 0; i < str.length() - 1; i++) {
		    if (!uniqueChars.add(str.charAt(i))) {
		        repeats.add(str.charAt(i));
		    }
		}
		System.out.println(uniqueChars);
		System.out.println(repeats);
	}
}

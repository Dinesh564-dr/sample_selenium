package javaprograms;

import java.util.HashSet;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {
		int a[]= {20,12,23,34,45,12,23,43,21,32,23,23,32,12};
		String str[]= {"dinesh","dinesh","raja","raja","dinesh","mahesh"};
		
		 //to remove duplicates
			/*
			 * Set<String> set=new HashSet<String>(Arrays.asList(str));
			 * System.out.println(set);
			 */
		
		  Set<String> s=new HashSet<String>();
		  for (String string :str) {
			if (s.add(string)==false) {
				System.out.println("duplicate element is   "+string);
			}
		}
	}

}

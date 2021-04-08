package javaprograms;

import java.util.HashMap;
import java.util.Map;

public class StringDuplicates {

	public static void main(String[] args) {
		
		String str = "dinesh kumar dinesh kumar reddy dinesh reddy kumar jitheen";
		String b[] = str.split(" ");
		
		/*
		 * Set<String> set = new HashSet<String>(Arrays.asList(words));
		 * System.out.println(set);
		 */
		
		Map<String, Integer> map = new HashMap<>();//create a Map object
		Integer counter=null;//initalize counter
		for(int i=0;i<b.length;i++) { //loop the whole array
		     counter=map.get(b[i]);//get element from map
		     if(map.get(b[i]) == null) { //check if it already exists
		          map.put(b[i], 1);//not exist, add with counter as 1
		     } else {
		          counter++;//if already eists, increment the counter & put to Map
		           map.put(b[i], counter);
		     }
		   
		}
		  System.out.println(map);

	}
}
package javaprograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdHighist {
	public static void main(String[] args) {
		String[] array = { "a", "b", "c", "d", "e" };

		// Method 1
		List<String> list = Arrays.asList(array);
		System.out.println(list);
		
		int arr[]= {2,4,5,6,7,1,3};
		List<Integer> intarr = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			intarr.add(new Integer(arr[i]));
		
		}
		Collections.sort(intarr);
		System.out.println(intarr);
		int val=intarr.get(2);
		System.out.println(val);
	}
}
package javaprograms;

import java.util.Arrays;

public class Largestandsmallest {

	public static void main(String[] args) {
		int arr[]= {12,45,3,46,65,43,23,67};
		int largest=arr[0];
		int smallest=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]>largest) {
				largest=arr[i];
				
			}else if (arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println("given array is "+Arrays.toString(arr));
		System.out.println(smallest);
		System.out.println(largest);
		
	}

}

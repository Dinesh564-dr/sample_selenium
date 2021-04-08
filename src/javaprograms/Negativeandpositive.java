package javaprograms;

import java.util.ArrayList;

public class Negativeandpositive {

	public static void main(String[] args) {
	
		        int[] arr= {-1,3,4,5,-6,6,8,9,-4};
		        ArrayList<Integer> al = new ArrayList<Integer>();
		        for (int i=0;i<arr.length;i++) {
		            if(arr[i]<0) {
		                al.add(arr[i]);
		            }
		        }
		        for (int i=arr.length-1;i>=0;i--) {
		            if(arr[i]>0) {
		                al.add(arr[i]);
		            }
		        }
		        System.out.println(al);
		    }
		}
	

package javaprograms;

public class OldSchool {

	public static void main(String[] args) {
		String str = "old school,test case";
		String rev="";
		String arr[] = str.split(",");
		for (int i = 0; i < arr.length; i++) {
			String arr2[] = arr[i].split(" ");
			for (int j = arr2.length-1; j >0 ; j--) {
				rev=rev+" "+arr2[j];
			}
			rev=rev+",";
			
		}
		System.out.println(rev);
	}

}

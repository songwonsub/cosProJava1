package cosProJava1;

import java.util.ArrayList;
import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		String A = "123";
		String B = "12";
		int sumA = 0;
		int sumB = 0;
		
		for(int i = 0; i < A.length(); i++) {
			
			sumA += A.charAt(i);
		}
		
		for(int i = 0; i < B.length(); i++) {
			
			sumB += B.charAt(i);
		}
		
		System.out.println(Integer.valueOf(A) + Integer.valueOf(B));
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr).indexOf("5"));
		
		System.out.println();
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		
		System.out.println(arr1);
		System.out.println(arr1.indexOf(3));
		
	}

}

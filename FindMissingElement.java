package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,7,6,8,10};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int i;
		for ( i = 0; i < arr.length; i++) {
			if(arr[i]!=i+1) {
				break;
			}
			else {
				continue;
			}
			
		}
		System.out.println("The missing element is"+" "+(i+1));

	}

}

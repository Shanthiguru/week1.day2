package week1.day2;

import java.util.Arrays;

public class FindSecondLargeNum {

	public static void main(String[] args) {
		int num[]= {23,45,67,32,89,22};
		Arrays.sort(num);
		
		//System.out.println(Arrays.toString(num));
		
		int seclar = num.length-2;
		System.out.println("Second Largest Number : " +num[seclar]);
		System.out.println("Second Smallest Number : " +num[1]);
		
		

	}

}

package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int num = 34343, reversedNum = 0, remainder;
		 
		 int temp = num;
		 
		 
		 while(num !=0) {
		 remainder = num % 10;
		 reversedNum = reversedNum * 10 + remainder;
		 num = num/10;
		 }
        if (temp == reversedNum) {
       	 System.out.println(temp +" : " +"is a palindrome");
        }
        else {
       	 System.out.println(temp +" : " +"is not a palindrome");
        }
	}
}

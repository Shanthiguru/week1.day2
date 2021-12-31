package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=13;
		boolean flag=false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=true;
				break;
			}
		}
			if(flag==false) {
				System.out.println("Prime Number");
			}
			else {
				System.out.println("Not a Prime Number");
			}

	}

}

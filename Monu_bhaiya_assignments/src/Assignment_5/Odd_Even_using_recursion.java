package Assignment_5;

public class Odd_Even_using_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		Odd_Even(n);
	}

	public static void Odd_Even(int n) {
		if(n==0) {
			return;
		}
		if(n%2!=0) {
			System.out.println(n);
		}
		Odd_Even(n-1);
		if(n%2==0) {
			System.out.println(n);
		}
		
	}
	
	

}

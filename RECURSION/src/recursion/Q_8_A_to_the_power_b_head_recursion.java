package recursion;

public class Q_8_A_to_the_power_b_head_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=3;
		System.out.println(pow(a,b));
	}
	public static int pow(int a, int b) {
		if(b==0) {
			return 1;
		}
		int fn=pow(a,b-1);
		return fn*a;
	}

}

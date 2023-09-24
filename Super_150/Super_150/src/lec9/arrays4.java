package lec9;

public class arrays4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		int[] ot= {6,7,8,9,10};
		int [] temp= {};
		temp=a;
		a=ot;
		ot=temp;
		System.out.println(a[0]);
		System.out.println(ot[0]);
	}

}

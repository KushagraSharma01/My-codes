package lec19;
import java.util.ArrayList;
public class sumoftwoarray {
	public static void main(String[] arg) {
			//in () brackets the capacity will be stored and in <> size will be stored	
		int []a= {1,0,4,9,6};							//old size +(old size/2) +1 --->the arraylist will grow by this after adding
		int []a2= {3,4,5,6,7,8,3};						//all elements of its size
		TwoArraySum(a,a2);								//ArrayList can only store in contigous memory
	}
	public static void TwoArraySum(int []a1,int []a2) {
		int i=a1.length-1;
		int j=a2.length-1;
		ArrayList<Integer> list =new ArrayList<>(190);
		int carry=0;
		while(i>=0 && j>=0) {
			int sum =0;
			sum=0;
			sum=a1[i]+a2[j]+carry;
			list.add(sum % 10);
			carry=sum/10;
			i--;
			j--;
		}
		while(i>=0) {
			int sum=0;
			sum=a1[i]+carry;
			list.add(sum%10);
			carry=sum/10;
			i--;
		}
		while(j>=0) {
			int sum=0;
			sum=a2[j]+carry;
			list.add(sum%10);
			carry=sum/10;
			j--;
		}
		if(carry!=0) {
			list.add(carry);
		}
		for(int k=list.size()-1;k>=0;k--) {
			System.out.print(list.get(k)+", ");
		}
		System.out.println("END");
	}
}

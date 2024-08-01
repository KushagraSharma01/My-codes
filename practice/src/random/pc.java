package random;

public class pc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,4,4,5};
		int lo=0;
		int hi=a.length-1;
		int in =-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(a[mid]==4) {
				in=mid;
				hi=mid-1;
			}
			else if(a[mid]>4)
				hi=mid-1;
			else
				lo=mid+1;
		}
		System.out.println(in);

	}

}

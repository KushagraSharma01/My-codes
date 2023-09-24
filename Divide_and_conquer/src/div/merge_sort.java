package div;

public class merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry= {2,7,9,1,5};
		int[] q=Merge(arry,0,arry.length-1);
		for (int i = 0; i < q.length; i++) {
			System.out.println(q[i]+" ");
		}
	}	
	public static int[] Merge(int[] arry, int si, int ei) {
		if(si==ei) {
			int[] bs=new int[1];
			bs[0]=arry[si];
			return bs;
		}
		int mid=(si+ei)/2;
		int[] fa=Merge(arry,si,mid);
		int [] sa=Merge(arry,mid+1,ei);
		return MergeTwoArray(fa,sa);
	}
	private static int[] MergeTwoArray(int[] arry1, int[] arry2) {
		int n=arry1.length;
		int m=arry2.length;
		int[] ans=new int[n+m];
		int i=0;//arry1
		int j=0;//arry2
		int k=0;//ans
		while(i<n && j<m) {
			if(arry1[i]<arry2[j]) {
				ans[k]=arry1[i];
				i++;
			}
			else {
				ans[k]=arry2[j];
				j++;
			}
			k++;
		}
		while(i<n) {
			ans[k]=arry1[i];
			i++;
			k++;
		}
		while(j<m) {
			ans[k]=arry2[j];
			j++;
			k++;
		}
		return ans;
	}
	
}

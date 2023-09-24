package lec_2;

public class div_con {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry1= {2,3,5,7,8,9};
		int[] arry2= {1,3,5,7,11,13,15};
		int[] ans=MergeTwoArray(arry1,arry2);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
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

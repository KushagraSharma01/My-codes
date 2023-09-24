package lec12;

public class maximum_subarraySum {
	public static void main(String[] arg) {
		int []a= {-2,-4,-1,5,6,-1,-2};
		System.out.println(Maximum_subarraysum(a));
	}
//	public static int Maximum_subarraysum(int[]a) {
//		int ans=a[0];
//		for(int i=0;i<a.length;i++) {
//			int sum=0;
//			for(int j=i;j<a.length;j++) {
//				sum+=a[j];
//				ans=Math.max(sum,ans);
//			}
//		}
//		return ans;
//	}
	public static int Maximum_subarraysum(int[]a) {				//Kadano's Algorithm
		int ans=a[0];
		int sum=0;
		for(int j=0;j<a.length;j++) {
			sum+=a[j];
			ans=Math.max(sum,ans);
			if(sum<0) {
				sum=0;
			}
		}
		return ans;
	}
}

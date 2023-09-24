package problems;

public class q2433XOR {
		// TODO Auto-generated method stub
		public int[] findXORArray(int[] pref) {
	        int a=pref[0],b;
	        int []arr=new int[pref.length];
	        arr[0]=a;
	        for(int i=1;i<pref.length;i++){
	            b=a;
	            a=a^pref[i];
	            arr[i]=a;
	            a=b^a;
	        }
	        return arr;
	}
		//alternate
		//take XOR of two consecutive elements of given array at a time to get the elements of required array

}

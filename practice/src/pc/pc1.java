package pc;

public class pc1 {
	public static void main(String []args) {
		int []arr= {2,4,6,8,10};
		System.out.println(minimumBuckets(arr.length,arr));
	}
	public static long minimumBuckets(int N, int arr[]){
        // Code here.
        int k=0;
        if(arr.length>=2)
        k=gcd(arr[0],arr[1]);
        else
        	return 1;
        for(int i=0;i<arr.length;i++){
            k=gcd(arr[i],k);
        }
        long sum=0;
        for(int i=0;i<arr.length;i++)
            sum+=arr[i]/k;
        return sum;
    }
    static int gcd(int a, int b)
{
    int r=a%b;
    
    while(r>0) {
		a=b;
		b=r;
		r=a%b;
	}
    return b;
    
}
}

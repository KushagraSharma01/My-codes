package prac;
import java.util.*;
public class p3 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//no rotation takes place
//		//only modulous of the given number of shifts with the total number of bits is taken 
//		//and then shift is done normally
//		int x=1;
//		System.out.println(x>>1);
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int a[]	= new int[n];
		    for(int i=0;i<a.length;i++) 
		    	a[i]=sc.nextInt();
		    char b[] = new char[n];
		    boolean [] vis = new boolean[n];
		    int c=0;
		    for(int i=0;i<a.length;i++) {
		    	if(a[i]==0) {
		    		b[i]= (char)('a'+c);
		    		c++;
		    	}
		    	else {
		    		for(int j=0;j<i;j++) {
		    			if((a[j]==(a[i]-1)) && (vis[j]==false)) {
		    				b[i]=b[j];
		    				vis[j]=true;
		    				break;
		    			}
		    		}
		    	}
		    }
		    String str="";
		    for(int i=0;i<b.length;i++)
		    	str+=b[i];
		    System.out.println(str);
    }

}
}

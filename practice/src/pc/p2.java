package pc;
import java.util.*;
public class p2{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int w=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int var=2;
            int prev=0;
            while(w>0&&prev<w) {
            	int count=0;
            	for(int i=0;i<n;i++) {
            		if(var>=a[i]) {
            			w--;
            			count++;
            		}
            	}
            	prev=count;
            	if(w>=prev)
            	var++;
            }
            System.out.println(var);
            
        }
            
    }
}
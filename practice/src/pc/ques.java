package pc;
import java.util.*;
import java.util.ArrayList;
public class ques {
    public static void main(String args[]) {
    	 Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         while(t-->0){
         int n=sc.nextInt();
         PriorityQueue<Integer> pq=new PriorityQueue<>();
         int size=0;
         for(int i=0;i<n;i++){
             pq.add(sc.nextInt());
             size++;
             int a[]=new int[size];
             for(int j=0;j<size;j++)
             	a[j]=pq.remove();
             if(size%2==0) {
             	for(int j=0;j<size;j++) {
             		if(j==(size/2)-1) {
             			System.out.print((a[j]+a[j+1])/2+" ");
             		}
             	}
             }
             else {
             	for(int j=0;j<size;j++) {
             		if(j==(size/2)) {
             			System.out.print(a[j]+" ");
             		}
             	}
             }
             for(int j=0;j<size;j++)
             	pq.add(a[j]);
         }
         }
    }
}
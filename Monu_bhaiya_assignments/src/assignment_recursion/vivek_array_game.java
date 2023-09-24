package assignment_recursion;
import java.util.*;
public class vivek_array_game {
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		int T=scn.nextInt();
		int count=1;
		while(count<=T) {
			int size=scn.nextInt();
			int[] arr= new int[size];
			for(int i=0; i<size; i++) {
				arr[i]=scn.nextInt();
			}
			System.out.println(output(arr, 0, arr.length-1));
			count++;
		}
	}
public static int output(int[] arr, int si, int ei) {
	int fh=0;
	int sh=0;
	for(int i=si; i<ei; i++ ) {
		int Sum1=sum(arr, si, i);
		int Sum2=sum(arr, i+1, ei);
		if(Sum1==Sum2) {
			fh=output(arr, si, i);
			sh=output(arr, i+1, ei);
			return Math.max(fh, sh)+1;
			}
		}
	return 0;
	}
public static int sum(int[] arr, int si, int ei ) {
	int sum=0;
	for(int i=si; i<=ei; i++) {
		sum=sum+arr[i];
	}
	return sum;
	}
}
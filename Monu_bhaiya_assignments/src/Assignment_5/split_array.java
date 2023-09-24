package Assignment_5; 
import java.util.*;
public class split_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int Num =sc.nextInt();
	    int[] a= new int[Num];
		for(int i=0; i<Num; i++) {
			a[i]=sc.nextInt();
		}
		split1(a, 0, 0, "", 0, "");
		System.out.println(split2(a, 0, 0, "", 0, ""));
	}
	public static void split1(int[] a, int v, int L, String ans1, int R, String ans2 ) {
		if(v==a.length) {
			if(L==R) {
				System.out.println(ans1+ " and "+ ans2);
			}
			return;
		}
		split1(a, v+1, L+ a[v], ans1+ a[v]+ " ", R, ans2);
		split1(a, v+1, L, ans1, R+ a[v], ans2+a[v]+ " ");
	}
	public static int split2(int[] a, int v, int L, String ans1, int R, String ans2 ) {
		int c=0;
		if(v==a.length) {
			if(L==R) {
				return 1;
			}
			return 0;
		}
		split1(a, v+1, L+ a[v], ans1+ a[v]+ " ", R, ans2);
		split1(a, v+1, L, ans1, R+ a[v], ans2+a[v]+ " ");
	    return c;
	}
}


package lec14;
import java.util.*;
public class twodarray2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int[][]a= new int[3][4];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a[0].length;i++) {				//loop for columns
			if(i%2==0) {
			for(int j=0;j<a.length;j++) {				//loop for rows
				System.out.print(a[j][i]+" ");			//a[row][column]
			}
			}
			else {
				for(int j=a.length-1;j>=0;j--) {		//loop for rows
					System.out.print(a[j][i]+" ");			
				}
			}
			
			System.out.println();
		}
		
	}

}

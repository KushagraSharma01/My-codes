package prac;

public class pc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,5,9,10},
				{11 ,17 ,19 ,23},
				{34 ,39 ,41 ,46}};
		int row=0;
		int col=a[0].length-1;
		int target=100;
		int in=-1;
		while(row<a.length&&col>=0) {
			if(a[row][col]==target) {
				in=row;
				break;
			}
			else if(a[row][col]<target)
				row++;
			else
				col--;
		}
		if(in==-1)
			System.out.println("NO");
		else
			System.out.println("YES");
	}

}

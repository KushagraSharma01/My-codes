package lec15;

public class printspiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arry= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		PrintSpiral(arry);
	}
	public static void PrintSpiral(int[][] arry) {
		int minr=0;
		int minc=0;
		int maxr=arry.length-1;
		int maxc=arry[0].length-1;
		int te=arry.length*arry[0].length;      //m*n
		int c=0;
		while(c<te) {
		for(int i=minc;i<=maxc && c<te;i++) {
			System.out.print(arry[minr][i]+" ");
			c++;
		}
		minr++;
		for(int i=minr;i<=maxr && c<te;i++) {
			System.out.print(arry[i][maxc]+" ");
			c++;
		}
		maxc--;
		for(int i=maxc;i>=minc & c<te;i--) {
			System.out.print(arry[maxr][i]+" ");
			c++;
		}
		maxr--;
		for(int i=maxr;i>=minr &c<te;i--) {
			System.out.print(arry[i][minc]+" ");
			c++;
		}
		minc++;
		}
	}

}

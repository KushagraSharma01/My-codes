package lec15;

public class rotateimage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		
	}
	public static void transpose(int[][]a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a[0].length;j++) {
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
	}
	public static void Rotateimage(int[][]a) {
		transpose(a);
		for(int i=0;i<a.length;i++) {
			Reverse(a[i]);
		}
	}
	public static void Reverse(int []a) {
		int i=0;
		int j=a.length-1;
		while(i<j) {
			int c=a[j];
			a[j]=a[i];
			a[i]=c;
			i++;				
			j--;
		}
}
}

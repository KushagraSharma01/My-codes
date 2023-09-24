package problems;

public class q_66_plus_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry= {1,2,3};
		int[] arry1= {};
		arry1=plus_one(arry,arry1);
		for(int i=0;i<arry1.length;i++) {
			System.out.print(arry1[i]+" ");
		}
	}
	private static int[] plus_one(int[] arry,int[] arry1) {
		int c9=0;
		for(int i=0;i<arry.length;i++) {
			if(arry[i]!=9) {
				c9++;
				break;
			}
		}if(c9==0) {
			arry1=new int[arry.length+1];
		}
		else {
			arry1=new int[arry.length];
		}
		int c99=0;
		if(c9==0) {
			arry1[0]=1;
			for(int i=1;i<arry1.length-1;i++) {
				arry1[i]=0;
			}
		}
		else if(arry[arry.length-1]==9) {
			for(int i=arry.length-1;i>=0;i--) {
				if(arry[i]==9 && c99==0) {
					
					arry1[i]=0;
					arry1[i-1]=arry1[i-1]+1;
				}
				else {
					arry1[i]=arry1[i]+arry[i];
					c99++;
				}
			}
			
		}
		else{
			for(int i=arry.length-1;i>=0;i--) {
				if(i==arry.length-1) {
					arry1[i]=arry1[i]+arry[i]+1;
				}
				else {
					arry1[i]=arry1[i]+arry[i];
				}
			}
		}
		return arry1;
	}
}

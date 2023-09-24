package recursion;

public class Q_16_Subsequences_of_dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		PrintPath(0,n,"");
		
	}
	private static void PrintPath(int src,int des,String ans) {
		//TODO Auto-generated method stub
		if(src==des) {								//des--->destination
			System.out.println(ans);
			return;
		}
		if(src>des) {
			return;
		}
		PrintPath(src+1,des,ans+1);
		PrintPath(src+2,des,ans+2);
		PrintPath(src+3,des,ans+3);
	}
}

package recursion;

public class Q_17_Subsequences_of_dice_with_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		PrintPath(0,n,"");
		
	}

	private static void PrintPath(int src,int des,String ans) {
		// TODO Auto-generated method stub
		if(src==des) {
			System.out.println(ans);
			return;
		}
		if(src>des) {
			return;
		}
//		PrintPath(src+1,dice,ans+1);
//		PrintPath(src+2,dice,ans+2);
//		PrintPath(src+3,dice,ans+3);
		
		for(int dice=1;dice<=3;dice++) {
			PrintPath(src+dice,des,ans+dice);
		}
	}
}

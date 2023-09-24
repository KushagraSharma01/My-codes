package recursion;

public class Q_2_Pointer_decrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		PD(n);
		
	}
//	public static void PD(int n) {
//		if(n==0) {
//			return;
//		}
//		System.out.println(n);//self work
//		PD(n-1);//sp				//TAIL RECURSION
//		//In head recursion, the recursive call, when it happens, comes before other processing in the function 
//		//(think of it happening at the top, or head, of the function). 
//		//In tail recursion,it’s the opposite—the processing occurs before the recursive call.
//	}
	public static void PD(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		PD(n-1);
	}
	
}

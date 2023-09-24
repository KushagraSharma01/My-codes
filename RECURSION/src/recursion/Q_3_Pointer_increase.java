package recursion;
public class Q_3_Pointer_increase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		PI(n);
	}
//	public static void PI(int n) {
//		if(n==0) {
//			return;
//		}
//		System.out.println(n+"hello");			//print before calling---->stack grow
//		PI(n-1);//sp							//HEAD RECURSION
//		System.out.println(n);					//print after calling----->stack shrink
//		//if calling is in last then it is tail recursion.
//		//if calling is before other outputs then it is head recursion.
//			//In head recursion, the recursive call, when it happens, comes before other processing in the function 
//			//(think of it happening at the top, or head, of the function). 
//			//In tail recursion,it’s the opposite—the processing occurs before the recursive call.
//	}
	public static void PI(int n) {
		if(n==0) {
			return;
		}
		PI(n-1);
		System.out.println(n);
	}
}

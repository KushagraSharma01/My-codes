package lec17;

public class CBnum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="692239";
		PrintSubstring(str);
	}
	public static void PrintSubstring(String str) {
		int count=0;
		boolean [] visited=new boolean[str.length()];
		for(int  len=1; len<=str.length();len++) {
			for(int j=len;j<=str.length();j++) {
				int i=j-len;
				//System.out.println(str.substring(i,j));.
				String s=str.substring(i,j);
				long num=Long.parseLong(s);
				if(isCbNumber(num)==true && isVisited(visited,i,j-1)==true) {
					count++;
					//marked
					for(int k=i;k<=j-1;k++) {
						visited[k]=true;
					}
				}
			}
		}
		System.out.println(count);
	}
	private static boolean isVisited(boolean[] visited, int i, int j) {
		for(int k=i;k<=j;k++) {
			if(visited[k]==true) {
				return false;
			}
		}
		return true;
	}
	public static boolean isCbNumber(long num) {
		if(num==0 || num==1) {
			return false;
		}
		int[] arry= {2,3,5,7,11,13,17,19,23,29};
		for(int i=0;i<arry.length;i++) {
			if(num==arry[i]) {
				return true;
			}
		}
		for(int i=0;i<arry.length;i++) {
			if(num%arry[i]==0) {
				return false;
			}
		}
		return true;
	}
}

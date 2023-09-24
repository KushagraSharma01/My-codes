package lec17;
public class CB_num {

	public static void main(String[] args) {
		String str="692239";
		PrintSubString(str);
	}
	
	public static void PrintSubString(String str) {
		boolean[] visited =new boolean[str.length()];
		int count =0;
		for(int len=1;len<=str.length();len++) {
			for(int j=len;j<=str.length();j++) {
				int i=j-len;
				String s=str.substring(i,j);
				long num=Long.parseLong(s);
				if(isCBnumber(num)== true && isvisited(visited,i,j-1)==true) {
					count++;
				}
				for(int k=i;k<=j;k++) {
					visited[k]=true;
				}
			}
		}
	}
	public static boolean isvisited(boolean[] visited,int i,int j) {
		for(int k=i;k<=j;k++) {
			if(visited[k]==true) {
				return false;
			}
		}
		return true;
	}
	public static boolean isCBnumber(long num) {
		if(num==0 || num== 1) {
			return false;
		}
		int [] a= {2,3,5,7,11,13,17,19,23,29};
		for(int i=0;i<a.length;i++) {
			if(num == a[i])
				return true;
		}
		for(int i=0;i<a.length;i++) {
			if(num%a[i]==0)
				return false;
		}
		return true;
		
	}
}

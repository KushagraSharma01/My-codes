package lec1;

public class subsequence_without_recursion {
	
	public static void main(String[] args) {
		String str="abc";
		SubSequence(str);
	}
	public static void SubSequence(String str) {
		int n=str.length();
		for (int i = 0; i < (1<<n); i++) {
			String ans="";
			int pos=0;
			int num=i;
			while(num>0) {
				if((num & 1)!=0) {
					ans+=str.charAt(pos);
				}
				pos++;
				num=num>>1;
			}
			System.out.println(ans);
		}
	}

}
package hackerrank;
public class p1{
	static int f=0;
	public static void main(String []args) {
		String s="abca";
		subseq(s,"");
		System.out.println();
		perm(s,"");
		System.out.println(f);
		System.out.println();
		f=0;
		uniperm(s,"");
		System.out.println(f);
	}
	public static void subseq(String s,String ans) {
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		subseq(s.substring(1),ans);
		subseq(s.substring(1),ans+s.charAt(0));
	}
	public static void perm(String s,String ans) {
		if(s.length()==0) {
			f++;
			System.out.println(ans);
			return;
		}
		for(int i=0;i<s.length();i++) {
			perm(s.substring(0,i)+s.substring(i+1), ans+s.charAt(i));
		}
	}
	public static void uniperm(String s,String ans) {
		if(s.length()==0) {
			f++;
			System.out.println(ans);
			return;
		}
		for(int i=0;i<s.length();i++) {
			boolean t=true;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					t=false;
					break;
				}
			}
			if(t)
			uniperm(s.substring(0,i)+s.substring(i+1), ans+s.charAt(i));
		}
	}
}
package Assignment_5;

public class Reverse_bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=00001010;
		String str=Integer.toString(n);
        int ans=0;
        int mul=1;
        System.out.println();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int m=(int)ch;
            ans=ans+m*mul;
            mul=mul*2;
            System.out.println(m);
        }
        System.out.println(ans);
	}

}

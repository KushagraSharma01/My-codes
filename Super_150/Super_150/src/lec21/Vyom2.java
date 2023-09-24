package lec21;

public class Vyom2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcabcbb";
		int[] arry=new int[256];
        int si=0;
        int ei=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(arry[ch]==0){
                arry[ch]++;
                ei++;
            }
            else{
                for(int j=0;j<256;j++){
                    arry[j]=0;
                }
                for(int k=i-1;k>=0;k--){
                    if(s.charAt(k)==ch){
                        si=k+1;
                        break;
                    }
                    else{
                        arry[s.charAt(k)]++;
                    }
                }
                arry[ch]++;
                ei++;
            }
            
            ans=Math.max(ans,ei-si);
            
        }
        System.out.println(ans);
        
	}

}

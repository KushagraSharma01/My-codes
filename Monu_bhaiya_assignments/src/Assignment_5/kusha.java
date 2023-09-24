package Assignment_5;
public class kusha {
	static int f=0;
	public static void main(String[] args) {
		char board[][]= {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word="ABCB";
		System.out.println(Print(board,word));
	}
	public static boolean Print(char[][] board,String word){
	    for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0))
                word(board,word,"",i,j,0);
                if(f!=0)
                return true;
            }
        }
        return false;
	}
	public static void word(char [][]board,String word,String ans,int cr,int cc,int idx) {
        if(ans.equals(word) &&idx==word.length()){
            f++;
            return;
        }
         if(cc<0||cr<0||cr>=board.length||cc>=board[0].length||board[cr][cc]=='#'||board[cr][cc]!=word.charAt(idx)){
            return;
        }
        char temp=board[cr][cc];
        board[cr][cc]='#';
        if(f==0){
            word(board,word,ans+temp,cr+1,cc,idx+1);
            word(board,word,ans+temp,cr-1,cc,idx+1);
            word(board,word,ans+temp,cr,cc-1,idx+1);
            word(board,word,ans+temp,cr,cc+1,idx+1);  
        }
        board[cr][cc]=temp;
	}
}

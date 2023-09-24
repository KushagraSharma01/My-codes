package hack;

public class relative__ranks {

	public static void main(String[] args) {
		
		int[] score = {123123,11921,1,0,123};
		int[] arry=new int[score.length];
        int c=1;
        for(int j=0;j<score.length;j++) {
            int max=-100;
            int idx=0;
            for(int i=0;i<score.length;i++){
                if(score[i]>max){
                    max=score[i];
                    idx=i;
                }
            }
            arry[idx]=c;
            c++;
            score[idx]=-200;
        }
        String[] str=new String[arry.length];
        for(int i=0;i<str.length;i++){
            if(arry[i]==1){
                str[i]="Gold Medal";
            }
            else if(arry[i]==2){
                str[i]="Silver Medal";
            }
            else if(arry[i]==3){
               str[i]="Bronze Medal"; 
            }
            else{
                str[i]=Integer.toString(arry[i]);
            }
        }
        for(int i=0;i<str.length;i++) {
        	System.out.print(str[i]+" ");
        }
	}

}

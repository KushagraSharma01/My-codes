package pc;
import java.util.*;
public class pp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> h = new HashSet<>();
		int []a= {1,2,3,4,5};
        int max=0,longest=0,ans=0;
        for(int i:a) h.add(i);
        for(int i:h){
            if(!h.contains(i-1)){
                max=1;
                longest=i;
                while(h.contains(longest+1)){
                    max+=1; longest+=1;
                }
            }
            ans=Math.max(ans,max);
        }
        
	}

}

package prac;
import java.util.*;
 public class snakesandladders{
    public static void main(String[] args){
        // code here
    	int arr[] = {3, 22, 5, 8, 11, 26, 20, 29, 
    		       17, 4, 19, 7, 27, 1, 21, 9};
    	int []dp = new int[31];
        int vis[] = new int[31];
        Arrays.fill(dp, Integer.MAX_VALUE);
        System.out.println(snakesladder(arr, 1, 0, dp, vis));
        
    }
    public static int snakesladder(int[] arr, int i, int moves, int[] dp,int[] vis){
        if(i>30 || vis[i] == -1)
            return Integer.MAX_VALUE;
            
        if(dp[i] != Integer.MAX_VALUE)
            return dp[i];    
            
        if(i == 30)
            return moves;
        
        for(int j=0;j<arr.length;j+=2){
            if(arr[j] == i&& vis[j+1]!=-1){
                i = arr[j+1];
//                System.out.println(arr[j+1]);
            }
            else if(arr[j] == i)
                return Integer.MAX_VALUE;
        }
        System.out.println(i);
        for(int d=1;d<=6;d++){
            int temp = vis[i];
            vis[i] = -1;
            int a = snakesladder(arr, i+d, moves+1, dp, vis);
            vis[i] = temp;
            dp[i] = Math.min(a, dp[i]);
        }
        return dp[i];
    }
}
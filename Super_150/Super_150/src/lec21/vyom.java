package lec21;

public class vyom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,-1,4};
	    int leftsum=0;
        int rightsum=0;
       for(int i=0;i<nums.length;i++){
           for(int j=0;j<i;j++){
              leftsum=leftsum+nums[j];
              
           }
           System.out.println(leftsum);
           for(int k=i+1;k<nums.length;k++){
               rightsum=rightsum+nums[k];
           }
           System.out.println(rightsum);
           if(leftsum==rightsum){
               System.out.println(i);
           }
           leftsum=0;
           rightsum=0;
       }
	}

}
//public class Main
//{
//	public static void main(String[] args) {
//	    int[] nums={1,-1,4};
//	     int leftsum=0;
//      int rightsum=0;
//      for(int i=0;i<nums.length;i++){
//          for(int j=0;j<i;j++){
//             leftsum=leftsum+nums[j];
//             System.out.println(leftsum);
//          }
//          for(int k=i+1;k<nums.length;k++){
//              rightsum=rightsum+nums[k];
//              System.out.println(rightsum);
//          }
//          if(leftsum==rightsum){
//              System.out.println(i);
//          }
//		
//	}
//  }
//}

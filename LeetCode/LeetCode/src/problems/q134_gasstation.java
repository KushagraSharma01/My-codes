package problems;

public class q134_gasstation {
		public static void main(String[] arg) {
			int[] gas={1,2,3,4,5};
			int[] cost={3,4,5,1,2};
}																	//Remember it is guaranteed to be unique
		public static int CompleteCircuit(int[] gas,int[] cost) { 	// only checking till the last index 	
			int tc=0;												//cumulative sum
			int curr=0;
			int si=0;
			for(int i=0;i<cost.length;i++) {
				tc=tc+gas[i]-cost[i];	// calculated the total sum of difference of complete one loop, if it is zero then no station will form a complete a circuit
				curr=curr+gas[i]-cost[i]; 	//checking sum for individual stations 
				if(curr<0) {
					si=i+1;
					curr=0;
				}
			}
			if(tc<0) {
				return -1;
			}
			return si;
		}
}

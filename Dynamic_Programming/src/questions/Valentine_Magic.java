package questions;

public class Valentine_Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []boys= {2,11,3};
		int []girls= {5,7,3,2};
		System.out.println(mindiff(boys,girls,0,0));
	}
	//apply dp
	public static int mindiff(int []boys,int[] girls,int i,int j) {
		if(i==boys.length)
			return 0;
		if(j==girls.length)
			return 10000000;		//to minimize the answer and to prevent overflow
		int pair=Math.abs(boys[i]-girls[j])+mindiff(boys,girls,i+1,j+1);
		int No_pair=mindiff(boys,girls,i,j+1);	//discarding the girls who will give more diff, some of them will not be 
		return Math.min(pair, No_pair);			//recognized for upcoming boys (hence sorting is done before so that every girl is considered)
	}

}

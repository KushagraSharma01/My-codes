package problems;

public class Q_121_buy_stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices= {7,1,5,3,6,4};
		int i=0;
		int j=prices.length-1;
		int min=1000;
		int max=0;
		while(i<=j) {
			if(prices[i]<min) {
				min=prices[i];
			}
			if(prices[j]>max) {
				max=prices[j];
			}
			i++;
			j--;
		}
		if(max-min>0) {
			System.out.println(max-min);
		}
		else {
			System.out.println("0");
		}
	}

}

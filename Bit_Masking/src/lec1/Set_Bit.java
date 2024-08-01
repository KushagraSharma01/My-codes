package lec1;

public class Set_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//how to find the set bit inside a number
				//method 1-->
					//right shift the number with the number of bits to check
				//method 2-->
					//take bitwise & of 1 with that bit ,if non zero then bit is set
					//else bit is not set
		
		int n = 7;
		int pos = 3;	//indexing is from 0
		int mask = (1<<pos);
		if((n&mask)==0)
			System.out.println("not set");
		else
			System.out.println("set");
		
		//properties of XOR
		//XOR with 0 is same number
		//XOR with 1 is it's complement
		//A^B^C=B^C^A;
		
		
	}

}

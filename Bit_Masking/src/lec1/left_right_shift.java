package lec1;

public class left_right_shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//left shift
		int n = 1;
		System.out.println(n<<31);
		int n1= -5;
		System.out.println(n1<<32);
		
		//in case of 10000000... 31 zeroes then after left shift overflow will happen
		//rotation of same number will happen if all the eight/32 bits are shifted left
		
		//right shift
		//if there is a negative number then we will always put a 1 at MSB
		System.out.println(n1>>3);
		
		
	}

}

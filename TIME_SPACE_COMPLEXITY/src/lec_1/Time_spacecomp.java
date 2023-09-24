package lec_1;
public class Time_spacecomp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start=System.currentTimeMillis();
		for (int i = 0; i < 1000000000; i++) {
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start);
	}
}

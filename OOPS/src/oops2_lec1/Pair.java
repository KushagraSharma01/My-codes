package oops2_lec1;

public class Pair<P,Q> {	//generic class
	
	P x;
	Q y;
	
	public static void main(String[] args) {
		Pair<Integer, Boolean> p=new Pair<>();
		p.x=9;
		p.y=false;
	}

}

package Comparator_Comparable;

public class car implements Comparable <car>{
	int price;
	int speed;
	String color;
	public car() {
		
	}
	public car(int price,int speed,String color) {
		this.price=price;
		this.speed=speed;
		this.color=color;
	}
	@Override
	public String toString() {
		return "Price : "+this.price+" Speed: "+this.speed+" Color: "+this.color;
	}
	@Override
	public int compareTo(car o) {
//		return this.speed-o.speed;
//		return this.price-o.price;
		return this.color.compareTo(o.color);	//this compareTo function is of the String c 
	}
}

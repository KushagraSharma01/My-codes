package lec3;
import java.util.*;
public class marks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //in-built library
		int m=sc.nextInt();
		if(m>=75) {
			System.out.println("A");// double quotes for string, single quotes for character
		}
		else if(m<75 && m>=65) {
			System.out.println("B");
		}
		else if(m<65 && m>=55) {
			System.out.println("C");
		}
		else if(m<55 && m>=45) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		sc.close();//for closing the library
	}
}

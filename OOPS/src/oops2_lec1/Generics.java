package oops2_lec1;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer []arr= {1,2,3,4,5};
		Display(arr);
		String[] arr1= {"Ram","Anku","Ankita","Raj"};
		Display(arr1);
	}
//	public static void Display(Integer[] arr) {
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//	}
	public static <T>void Display(T[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
//to work on every datatype(generic is only for non primitive)
//for primitive datatypes we will use wrapper class
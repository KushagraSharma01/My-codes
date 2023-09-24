package Comparator_Comparable;

import java.util.*;

public class sorting {

	public static void main(String[] args) {
		//alan turing
		// TODO Auto-generated method stub
		int []arr=new int[7];
		//similarly
		car []arr2=new car[5];	//objects(instance of class) will be stored
		//by default the entries will be null
		arr2[0]=new car(200,10,"White");
		arr2[1]=new car(1000,20,"Black");
		arr2[2]=new car(345,3,"Yellow");
		arr2[3]=new car(34,89,"Grey");
		arr2[4]=new car(8907,6,"Red");
		Arrays.sort(arr2,new Comparator<car>(){		//you can either implement comparator in arr2 parent class and override it for every parameter or do it on the spot by passing comparator in the Arrays.sort() method and override there
			public int compare(car o1,car o2) {
				return o1.speed-o2.speed;
			}
		});
		sort(arr2,new Comparable<car>(){		//you can either implement comparator in arr2 parent class and override it for every parameter or do it on the spot by passing comparator in the Arrays.sort() method and override there
			
			@Override
			public int compareTo(car o) {		//we cannot access the speed of every object in arr2 and apply a compareTo method becoz in comparable only one argument is passed and other argument is taken from source code(which is the data member) by using "this" keyword but in comparator we can pass two arguments and can compare their values on the spot and can override them in compare method passed 
				// TODO Auto-generated method stub
				return arr2[0].speed-o.speed;	//you have to override for each object present in arr2
			}
			
		});
		bubblesort(arr2,new speed_comparator());//here the object of the class is implementing the interface(comparator) hence can be passed as comparator  
		Display(arr2);
	}
	public static void Display(car[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i].toString()+" ");
	}
	public static <t extends Comparable<t>> void bubblesort(t[]arr) {	//the t which is used here will only come if it has comparable logic
		for(int i=1;i<arr.length;i++) {								//it is called setting function bound
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j].compareTo(arr[j+1])>0) {
					t temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static <t> void bubblesort(t[]arr,Comparator<t> camp) {	
		for(int i=1;i<arr.length;i++) {					
			for(int j=0;j<arr.length-i;j++) {
				if(camp.compare(arr[j],arr[j+1])>0) {
					t temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static <t extends Comparable<t>> void sort(t[]arr,Comparable<t> o) {	//the t which is used here will only come if it has comparable logic
		for(int i=1;i<arr.length;i++) {								//it is called setting function bound
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j].compareTo(arr[j+1])>0) {
					t temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}
//constructor initializes the data members of a class 

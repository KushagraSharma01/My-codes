package heap;
import java.util.*;
public class heap {
	//heap is a complete binary tree
		//if max level is h then every node till h-1 level have two children
		
		//min heap(smaller values have more priority)(par.data<child.data)
		//max heap(larger values have more priority)(par.data>child.data)
		private ArrayList<Integer> list;
		public heap() {
			list=new ArrayList<>();
		}
		public void Add(int item) {
			list.add(item);
			upheapify(list.size()-1);
		}
		private void upheapify(int ci) { //child index
			int pi=(ci-1)/2;
			if(list.get(pi)>list.get(ci)) {
				Swap(pi,ci);
				upheapify(pi);
			}
			
		}
		public void Swap(int pi,int ci) {
			int temp=list.get(pi);
			list.set(pi, list.get(ci));	//replacing value at index
			list.set(ci, temp);
		}
		public int remove() {			//to do this in log(n) we need to swap first and last value and remove last one, then apply downheapify for last index
			int rv=list.get(0);
			Swap(0,list.size()-1);
			list.remove(list.size()-1);
			downheapify(0);
			return rv;
		}
		private void downheapify(int pi) {
			int lci=2*pi+1;
			int rci=2*pi+2;
			int mini=pi;
			if(lci<list.size()&&list.get(lci)<list.get(mini))
				mini=lci;
			if(rci<list.size()&&list.get(rci)<list.get(mini))
				mini=rci;
			if(mini!=pi) {
				Swap(pi,mini);
				downheapify(mini);
			}
		}
		public int get() {
			return list.get(0);
		}
		public void Display() {
			System.out.println(list);
		}
		
}

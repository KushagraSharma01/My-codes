package random;
import java.util.*;
public class p1 {
	
//	class Hello{
//		List<Integer> ls=new ArrayList<>();
//		public void insert(int val) {
//			for(int i=0;i<ls.size();i++) {
//				if(ls.get(i)==val)
//					return;
//			}
//			ls.add(val);
//		}
//		public void remove(int val) {
//			ls.remove(val);
//		}
//		public int getrandom() {
//			int a=(int)(Math.random()*Integer.MAX_VALUE);
////			System.out.println(a);
//			return ls.get(a%ls.size());
//			
//		}
//	}
	class Hello{
		HashMap<Integer,Integer> hm=new HashMap<>();
		public void insert(int val) {
			hm.put(val, val);
		}
		public void remove(int val) {
			hm.remove(val);
		}
		public int getrandom() {
			for(int i:hm.keySet()) {
				return hm.get(i);
			}
			return -1;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p1 a =new p1();
		Hello b= a.new Hello();
		b.insert(1);
		b.insert(2);
		b.insert(3);
		b.insert(4);
		b.insert(5);
		b.insert(5);
		System.out.println(b.getrandom());
		b.remove(4);
		System.out.println(b.getrandom());
	}

}

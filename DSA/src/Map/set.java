package Map;
import java.util.*;
public class set {
	public static void main(String [] agrs) {
		Set<Integer> s=new Set<>();
		HashSet<Integer> hs=new HashSet<>(); //O(1) implemented using HashTable
		hs.add(4);
		hs.add(5);
		hs.add(6);
		hs.add(7);
		hs.add(4);
		System.out.println(hs);
		System.out.println(hs.contains(4));
		System.out.println(hs.contains(-4));
		System.out.println(hs.remove(4));
		System.out.println(hs);
		System.out.println();
		System.out.println();
		
		TreeSet<Integer> hs1=new TreeSet<>(); //O(log(n))
		hs1.add(8);
		hs1.add(5);
		hs1.add(6);
		hs1.add(7);
		hs1.add(4);
		System.out.println(hs1);
		System.out.println(hs1.contains(4));
		System.out.println(hs1.contains(-4));
		System.out.println(hs1.remove(4));
		System.out.println(hs1);
		System.out.println();
		System.out.println();
		
		LinkedHashSet<Integer> hs2=new LinkedHashSet<>(); //O(1)
		hs2.add(9);
		hs2.add(5);
		hs2.add(6);
		hs2.add(7);
		hs2.add(4);
		System.out.println(hs2);
		System.out.println(hs2.contains(4));
		System.out.println(hs2.contains(-4));
		System.out.println(hs2.remove(4));
		System.out.println(hs2);
		for(int val:hs2) {
			System.out.print(val+" ");
		}
		
	}
}

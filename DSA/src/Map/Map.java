package Map;
import java.util.*;
//HashMap TreeMap Linked hashMap

public class Map {
	
	public static void main(String []args) {
		HashMap<String,Integer> map=new HashMap<>();//HashMap is implemented through Linked List 
		//HashMap is a class 
		//Map<String,Integer> map=new HashMap<>();	//Map is an interface
		TreeMap<String,Integer> map1=new TreeMap<>(); //TreeMap is implemented using Red-Black Tree
		map1.put("Raj",86);
		map1.put("Manish", 70);
		map1.put("Amisha", 67);
		map1.put("Puneet", 80);
		map1.put("Ankit", 67);
		map1.put("Puneet", 78);
		System.out.println(map1);
		//key is unique
		//get O(1)
		System.out.println(map1.get("Ankit"));
		System.out.println(map1.get("Rohit"));
		//remove O(1)
		System.out.println(map1.remove("Ankit"));
		System.out.println(map1);
		//contains O(1)
		System.out.println(map1.containsKey("Kunal"));
		System.out.println(map1.containsKey("Raj"));
		//null as a key is allowed in HashMap
		//But not in TreeMap
		map.put(null, null);
		//TreeMap puts data in sorted form on the basis of keys
		//that is why each operation in TreeMap has log(n) time complexity
		System.out.println();
		System.out.println();
		LinkedHashMap<String, Integer> map2=new LinkedHashMap<>();//implements using doubly linked list
		map2.put("Raj",86);
		map2.put("Manish", 70);
		map2.put("Amisha", 67);
		map2.put("Puneet", 80);
		map2.put("Ankit", 67);
		map2.put("Puneet", 78);
		System.out.println(map2);
		System.out.println(map2.get("Ankit"));
		System.out.println(map2.get("Rohit"));
		System.out.println(map2.remove("Ankit"));
		System.out.println(map2);
		System.out.println(map2.containsKey("Kunal"));
		System.out.println(map2.containsKey("Raj"));
		
		Set<String> key= map1.keySet();
		
		
	}
}
//HashMap :
//1. in HashMap the order is not maintained.
//2. time complexity -> O(1).

//LinkedHashMap :
//1. in LinkedHashMap the order of insertion is maintained when we print the map i.e. it will print the elements in the same order as we added them in map;
//2. doubly linkedList is used in this map;
//3. time complexity is same as HashMap.

//TreeMap :
//1. keys are sorted.
//2. time complexity -> O(logn).
//3. in the implementation of TreeMap, Red Black Trees are used instead of any array, arraylist, linkedlist or doubly linkedlist.
//4. Red Black Trees are BSTs which are "Self Balancing Trees".

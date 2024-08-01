package Graph;
import java.util.*;
public class Alien_Dictionary {
	HashMap<Character,List<Character>>map=new HashMap<>();
	public String alienOrder(String[] words) {
		
		for (int i = 0; i < words.length; i++) {
			String w=words[i];
			for (char ch:w.toCharArray()) {
				if(!map.containsKey(ch)) {
					map.put(ch, new ArrayList<>());
				}
			}
		}
		
		for(int i=0;i<words.length-1;i++) {
			String s1 = words[i];
			String s2 = words[i+1];
			for(int j=0;j<Math.min(s1.length(), s2.length());j++){
				if(s1.charAt(j)!= s2.charAt(j)) {
					map.get(s1.charAt(j)).add(s2.charAt(j));
					break;
				}
			}
		}
		int []in=Indegree();
		Queue<Character> q = new LinkedList<>();
		for(char ch:map.keySet()) {
			if(in[ch-'a']==0)
				q.add(ch);
		}
		StringBuilder sb = new StringBuilder();
		while(!q.isEmpty()) {
			char ch = q.remove();
			sb.append(ch);
			for(char nbrs : map.get(ch)) {
				in[nbrs - 'a']--;
				if(in[nbrs - 'a']==0)
					q.add(nbrs);
			}
		}
		return sb.toString();
		
	}
	public int[] Indegree() {
		int[] arr=new int[26];
		for(char key:map.keySet()) {
			for(char nbrs:map.get(key)){
				arr[nbrs-'a']++;		//edge key se neighbour ke pass jaa rhi hai to neighbour ka indegree  ek se increase ho jayega.
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}




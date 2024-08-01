package graph_prac;
import java.util.*;
public class traversals {

	HashMap<Integer, HashMap<Integer,Integer>> map;
	public traversals(int v) {
		map=new HashMap<>();
		for (int i = 1; i <=v; i++) {
			map.put(i, new HashMap<>());
		}
	}
	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	
	
	public boolean BFS(int src, int des) {		// adding all the nbrs of vtx in queue at once(BFS)
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		q.add(src);
		while(!q.isEmpty()){
			//1. remove
			int rv=q.poll();
			//2.ignore(if already visited)
			if(visited.contains(rv)) {
				continue;
			}
			//3.mark visited
			visited.add(rv);
			//4.Self Work
			if(src==des) {
				return true;
			}
			//5.Add nbrs
			for(int nbrs:map.get(rv).keySet()) {
				if(!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}
		}
		return false;
	}
	
	public boolean DFS(int src, int des) {		//here one nbr of first vtx will be considered and then we will move to it's 
		Stack<Integer> st=new Stack<>();		//nbr without first traversing all nbrs of 1st vtx (DFS)
		HashSet<Integer> visited=new HashSet<>();
		st.push(src);
		while(!st.isEmpty()){
			//1. remove
			int rv=st.pop();
			//2.ignore(if already visited)
			if(visited.contains(rv)) {
				continue;
			}
			//3.mark visited
			visited.add(rv);
			//4.Self Work
			if(src==des) {
				return true;
			}
			//5.Add nbrs
			for(int nbrs:map.get(rv).keySet()) {
				if(!visited.contains(nbrs)) {
					st.push(nbrs);
				}
			}
		}
		return false;
	}
	int comp;
	int cycle;
	public void BFT() {			//if in BFT/DFT two vtx has same nbrs while traversing forward then this repeated nbr shows
		Queue<Integer> q=new LinkedList<>(); 	// the presence of a cycle
		HashSet<Integer> visited=new HashSet<>();
		for(int src:map.keySet()) {
			if(visited.contains(src)) {
				continue;
			}
			q.add(src);
			comp++;		//no. of components in a graph
			while(!q.isEmpty()){
				//1. remove
				int rv=q.poll();
				//2.ignore(if already visited)
				if(visited.contains(rv)) {
					cycle++;		//no. of cycle in a graph
					continue;
				}
				//3.mark visited
				visited.add(rv);
				//4.Self Work
				System.out.print(rv+" ");
				//5.Add nbrs
				for(int nbrs:map.get(rv).keySet()) {
					if(!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		
	}
	public void DFT() {
		int comp =0,cycle=0;
		Stack<Integer> st=new Stack<>();
		HashSet<Integer> visited=new HashSet<>();
		for(int src:map.keySet()) {
			if(visited.contains(src)) {
				continue;
			}
			comp++;
			st.push(src);
			while(!st.isEmpty()){
				//1. remove
				int rv=st.pop();
				//2.ignore(if already visited)
				if(visited.contains(rv)) {
					cycle++;
					continue;
				}
				//3.mark visited
				visited.add(rv);
				//4.Self Work
				System.out.print(rv+" ");
				//5.Add nbrs
				for(int nbrs:map.get(rv).keySet()) {
					if(!visited.contains(nbrs)) {
						st.push(nbrs);
					}
				}
			}
		}
	}
}



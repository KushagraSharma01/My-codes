package Graph;
import java.util.*;
public class kosa_raju_strongly_connected_components {

	HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();
	
	public kosa_raju_strongly_connected_components(int v) {
		// TODO Auto-generated constructor stub
		for(int i=0;i<v;i++)
			map.put(i, new HashMap<>());
		
	}
	public void addedge(int v1, int v2) {
		map.get(v1).put(v2, 5);
	}
	public void KosaRajuAlgo() {
		HashSet<Integer> visited = new HashSet<>();
		Stack<Integer> st = new Stack<>();
		//dfs all vis stack mai push krdo
		dfs(visited,st,0);
		//transpose/reverse krna graph ko 
		HashMap<Integer,HashMap<Integer,Integer>> map1 = new HashMap<>();
		Transpose(map1);
		//dfs component count krna
		int c=0;
		
		
		
	}
	public void dfs(HashSet<Integer> visited, Stack<Integer> st, int vtx) {
		visited.add(vtx);
		for(int nbrs:map.get(vtx).keySet()) {
			if(!visited.contains(nbrs))
				dfs(visited, st, nbrs);
		}
		st.push(vtx);
	}
	public void Transpose(HashMap<Integer,HashMap<Integer,Integer>> map1 ) {
		for(int v1: map.keySet()) {
			for(int v2: map.get(v1).keySet()) {
				if(!map.containsKey(v2))
					map1.put(v2,  new HashMap<>());
				map1.get(v2).put(v1, 5);
			}
		}
		for(int v1: map.keySet()) {
			if(!map.containsKey(v1))
					map1.put(v1, new HashMap<>());
		}
	}

}

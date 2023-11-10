package Graph;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class graph_valid {

		public static void main(String[] args) {
			int n=5;
			int[][] edges = {{0,1}, {0,2}, {0,3}, {1,4}};
			System.out.println(validTree(n,edges));
		}
		public static boolean validTree(int n, int[][] edges) {
			HashMap<Integer, List<Integer>> map=new HashMap<>();
			for (int i = 0; i < n; i++) {
				map.put(i, new ArrayList<>());
			}
			for (int i = 0; i < edges.length; i++) {
				int a=edges[i][0];
				int b=edges[i][1];
				map.get(a).add(b);
				map.get(b).add(a);
			}
			int comp=0;
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
						return false;
					}
					//3.mark visited
					visited.add(rv);
					//4.Self Work
					//System.out.print(rv+" ");
					//5.Add nbrs
					for(int nbrs:map.get(rv)) {
						if(!visited.contains(nbrs)) {
							st.push(nbrs);
						}
					}
				}
			}
			return comp==1;
		}
		
	}
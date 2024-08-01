package graph_prac;
import java.util.*;
public class Kruskal_Algo {
	//to find the minimum spanning tree in a graph
	//here we first select the edges with minimum weight 
	//then add them to our MST if it does not create a cycle in it
	//this is done until we have n-1 edges in our MST, where n is the number of vertices 
	
	//DSU contribution--> 
	//As we add edges in increasing order in DSU, we are also connecting them using union operation(adding them to same set).
	//So, the edges which are not required as there is a connection already present, will not be considered.
	//Hence, only those edges will be added which establish a new connection and does not repeat a connection again(cycle).
	
	HashMap<Integer, HashMap<Integer,Integer>> hm = new HashMap<>();
	
	Kruskal_Algo(int v){
		for(int i=1;i<=v;i++)
			hm.put(i,new HashMap<>());
		
	}
	
	public void AddEdge(int v1, int v2,int cost) {
		hm.get(v1).put(v2, cost);
		hm.get(v2).put(v1, cost);
	}
	
	class Edgepair{
		int v1;
		int v2;
		int cost;
	}
	
	public List<Edgepair> getAllEdges(){
		
		List<Edgepair> l1 = new ArrayList<>();
		for(int v1:hm.keySet()) {
			for(int v2:hm.get(v1).keySet()) {
				Edgepair e = new Edgepair();
				e.v1 = v1;
				e.v2 = v2;
				e.cost = hm.get(v1).get(v2);
				l1.add(e);
			}
		}
		
		return l1;
	}
	
	public void Kruskals() {
		List<Edgepair> l1 = getAllEdges();
		Disjoint_Set_Union dsu = new Disjoint_Set_Union();
		
		Collections.sort(l1, new Comparator<Edgepair>() {
			
			public int compare(Edgepair e1, Edgepair e2) {
				return e1.cost - e2.cost;
			}
		});
		
		for(int v:hm.keySet())
			dsu.Create(v);
		
		for(Edgepair e:l1) {
			int r1 = dsu.find(e.v1);
			int r2 = dsu.find(e.v2);
			if(r1==r2) {	// already a connection is present (in the same set)
				//not considered, will contribute to unnecessary edge(or cycle creation)
			}
			else {
				dsu.union(e.v1, e.v2);     //this edge is considered not present from before
				System.out.println(e.v1+" "+e.v2+" @ "+e.cost+" hello");
			}
				
		}
		
	}
	
	public static void main(String[] args) {
		Kruskal_Algo gh = new Kruskal_Algo(7);
		gh.AddEdge(4, 5, 1);
		gh.AddEdge(1, 2, 10);
		gh.AddEdge(1, 4, 6);
		gh.AddEdge(2, 3, 7);
		gh.AddEdge(4, 3, 5);
		gh.AddEdge(5, 6, 4);
		gh.AddEdge(6, 7, 3);
		gh.AddEdge(5, 7, 2);
		gh.Kruskals();
	}
	
}

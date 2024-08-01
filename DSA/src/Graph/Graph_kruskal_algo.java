package Graph;
import java.util.*;
public class Graph_kruskal_algo {
	
	HashMap<Integer,HashMap<Integer,Integer>> map;
	
	public Graph_kruskal_algo(int v) {
		map=new HashMap<>();
		for(int i=1;i<=v;i++)
			map.put(i, new HashMap<>());
	}
	
	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);

	}
	class EdgePair{
		int e1;
		int e2;
		int cost;
		
		public EdgePair(int e1,int e2,int cost){
			this.e1=e1;
			this.e2=e2;
			this.cost=cost;
		}
		public String toString() {
			return this.e1+" "+this.e2+" @ "+this.cost;
		}
	}
	public List<EdgePair> GetAllEdge(){
		List<EdgePair> l1 = new ArrayList<>();
		for(int e1:map.keySet()) {
			for(int e2:map.get(e1).keySet()) {
				int cost=map.get(e1).get(e2);
				l1.add(new EdgePair(e1,e2,cost));
				
			}
		}
		return l1;
	}
	public void Kruskal() {
		List<EdgePair> l1=GetAllEdge();
		Collections.sort(l1 ,new Comparator<EdgePair>(){
			public int compare(EdgePair o1,EdgePair o2) {
				return o1.cost-o2.cost;
			}
		});
		
		Disjoint_set_union dsu =new Disjoint_set_union();
		for(int v:map.keySet()) {
			dsu.Create(v);
		}
		for(EdgePair e:l1) {
			int re1=dsu.find(e.e1);
			int re2=dsu.find(e.e2);
			if(re1==re2) {
				
			}
			else {
				dsu.Union(e.e1,e.e2);
				System.out.println(e);
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph_kruskal_algo gh=new Graph_kruskal_algo(7);
		gh.AddEdge(1, 4, 6);
		gh.AddEdge(1, 2, 10);
		gh.AddEdge(2, 3, 7);
		gh.AddEdge(3, 4, 5);
		gh.AddEdge(4, 5, 1);
		gh.AddEdge(5, 6, 4);
		gh.AddEdge(7, 5, 2);
		gh.AddEdge(6, 7, 3);
		gh.Kruskal();
	}
}

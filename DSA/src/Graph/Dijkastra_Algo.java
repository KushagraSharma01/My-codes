package Graph;
import java.util.*;

import Graph.Graph_kruskal_algo.EdgePair;

public class Dijkastra_Algo {
	HashMap<Integer, HashMap<Integer,Integer>> map;
	
	public Dijkastra_Algo(int v) {
		map=new HashMap<>();
		for(int i=1;i<=v;i++)
			map.put(i,new HashMap<>());
	}
	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);

	}
	
	class DijkastraPair{
		int vtx;
		String acqpath;
		int cost;
		public DijkastraPair(int vtx,String acqpath,int cost) {
			this.vtx=vtx;
			this.acqpath=acqpath;
			this.cost=cost;
		}
		
		@Override
		public String toString() {
			return this.vtx+" "+this.acqpath+" @ "+this.cost;
		}
	}
		public void Dijkastra() {
			PriorityQueue<DijkastraPair> pq=new PriorityQueue<>(new Comparator<DijkastraPair>() {
				@Override
				public int compare(DijkastraPair o1,DijkastraPair o2) {
					return o2.cost-o1.cost;
				}
			});
			HashSet<Integer> vis = new HashSet<>();
			pq.add(new DijkastraPair(1,"1",0));
			while(!pq.isEmpty()) {
				DijkastraPair rp= pq.poll();
				if(vis.contains(rp.vtx))
					continue;
				vis.add(rp.vtx);
				System.out.println(rp);
				for(int nbrs:map.get(rp.vtx).keySet()) {		//neighbors of rp.vtx
					if(!vis.contains(nbrs)) {
						int cost=rp.cost+map.get(rp.vtx).get(nbrs);
						pq.add(new DijkastraPair(nbrs,rp.acqpath+nbrs,cost));
					}
				}
			}
		}
	public static void main(String[] args) {
		Dijkastra_Algo gh=new Dijkastra_Algo(7);	
		gh.AddEdge(1, 4, 6);
		gh.AddEdge(1, 2, 10);
		gh.AddEdge(2, 3, 7);
		gh.AddEdge(3, 4, 5);
		gh.AddEdge(4, 5, 1);
		gh.AddEdge(5, 6, 4);	
		gh.AddEdge(7, 5, 2);
		gh.AddEdge(6, 7, 3);
		gh.Dijkastra();
	}
}

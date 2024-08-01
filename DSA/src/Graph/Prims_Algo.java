package Graph;

import java.util.*;

import Graph.Graph_kruskal_algo.EdgePair;

public class Prims_Algo {

	HashMap<Integer,HashMap<Integer,Integer>> map;
	
	public Prims_Algo(int v) {
		map=new HashMap<>();
		for(int i=1;i<=v;i++)
			map.put(i, new HashMap<>());
	}
	class PrimsPair{
		int e1;
		int acqv;		//acquiring vertex
		int cost;
		public PrimsPair(int e1,int acqv,int cost) {
			this.e1=e1;
			this.acqv=acqv;
			this.cost=cost;
		}
		public String toString() {
			return this.e1+" "+this.acqv+" @ "+this.cost;
		}
	}
	public void Prims() {
		PriorityQueue<PrimsPair> pq=new PriorityQueue<>(new Comparator<PrimsPair>() {
			public int compare(PrimsPair o1,PrimsPair o2) {
				return o2.cost-o1.cost;
			}
		});
		pq.add(new PrimsPair(3, 3, 0));
		HashSet<Integer> vis=new HashSet<>();
		while(!pq.isEmpty()) {
			PrimsPair rp=pq.poll();
			if(vis.contains(rp.e1))
				continue;
			vis.add(rp.e1);
			System.out.println(rp);
			for(int nbrs:map.get(rp.e1).keySet()) {
				if(!vis.contains(nbrs)) {
					int cost =map.get(rp.e1).get(nbrs);
					pq.add(new PrimsPair(nbrs,rp.e1,cost));
				}
			}
		}
	}
	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prims_Algo gh=new Prims_Algo(7);
		gh.AddEdge(1, 4, 6);
		gh.AddEdge(1, 2, 10);
		gh.AddEdge(2, 3, 7);
		gh.AddEdge(3, 4, 5);
		gh.AddEdge(4, 5, 1);
		gh.AddEdge(5, 6, 4);
		gh.AddEdge(7, 5, 2);
		gh.AddEdge(6, 7, 3);
		gh.Prims();
	}
}
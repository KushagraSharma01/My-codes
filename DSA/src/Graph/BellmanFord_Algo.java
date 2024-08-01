package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Graph.Graph_kruskal_algo.EdgePair;

public class BellmanFord_Algo {
	HashMap<Integer, HashMap<Integer,Integer>> map;
	
	public BellmanFord_Algo(int v) {
		map=new HashMap<>();
		for(int i=1;i<=v;i++)
			map.put(i,new HashMap<>());
	}
	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		//map.get(v2).put(v1, cost);		//as it is a directed graph one-way only

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
	}
	
	public List<EdgePair> GetAllEdge(){
		List<EdgePair> l1 =new ArrayList<>();
		for(int e1:map.keySet()) {
			for(int e2:map.get(e1).keySet()) {
				int cost=map.get(e1).get(e2);
				l1.add(new EdgePair(e1,e2,cost));
				
			}
		}
		return l1;
	}
	public void Bellman() {
		List<EdgePair> l1 =new ArrayList<>();
		l1=GetAllEdge();
		int v=map.size();
		int []dis =new int[v+1];	//one-indexed 
		for(int i=2;i<dis.length;i++)
			dis[i]=9999999;
		
		for(int i=1;i<=v;i++) {
			for(EdgePair e:l1) {
				if(i==v&&dis[e.e2]>dis[e.e1]+e.cost) {
					System.out.println("-ve cycle is present");
					return;
				}
				if(dis[e.e2]>dis[e.e1]+e.cost)
					dis[e.e2]=dis[e.e1]+e.cost;
			}
		}
		for(int i=1;i<dis.length;i++) {
			System.out.print(dis[i]+" ");
		}
	}
	public static void main(String[] args) {
		BellmanFord_Algo bfd=new BellmanFord_Algo(7);	
		bfd.AddEdge(1, 2, 8);
		//bfd.addEdge(2, 5, -2);
		bfd.AddEdge(2, 5, 2);
		bfd.AddEdge(5, 2, 1);
		bfd.AddEdge(4, 5, 4);
		bfd.AddEdge(3, 4, -3);
		bfd.AddEdge(1, 3, 4);
		bfd.AddEdge(1, 4, 5);
		bfd.Bellman();
	}
}

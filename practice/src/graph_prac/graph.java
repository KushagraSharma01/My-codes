package graph_prac;
import java.util.*;
public class graph {

	HashMap<Integer, HashMap<Integer,Integer>> hm = new HashMap<>();
	
	public graph(int vtx) {
		for(int i=1;i<=vtx;i++) {
			hm.put(i, new HashMap<>());
		}
	}
	
	public void addedge(int vtx1, int vtx2, int cost) {
		hm.get(vtx1).put(vtx2, cost);
		hm.get(vtx2).put(vtx1, cost);
	}
	
	public boolean containsedge(int vtx1, int vtx2) {
		if(hm.get(vtx1).containsKey(vtx2))
			return true;
		else 
			return false;
	}
	
	public boolean containsvtx(int vtx) {
		return hm.containsKey(vtx);
	}
	
	public int noofedges() {
		int ans=0;
		for(int vtx:hm.keySet()) {
			ans+=hm.get(vtx).size();
		}
		return ans/2;
	}
	
	public void removeedge(int vtx1, int vtx2) {
		hm.get(vtx1).remove(vtx2);
		hm.get(vtx2).remove(vtx1);
	}
	
	public void removevtx(int vtx) {
		for(int nbrs:hm.get(vtx).keySet()) {
			hm.get(nbrs).remove(vtx);
		}
		hm.remove(vtx);
	}
	
	public boolean haspath(int src, int des,HashSet<Integer> visited) {
		if(src==des)
			return true;
		visited.add(src);
		
		for(int nbrs:hm.get(src).keySet()){
			boolean ans=false;
			if(!visited.contains(nbrs))
				ans = haspath(nbrs,des,visited);
			if(ans)
				return ans;
		}
		
		return false;
		
	}
	
	public void printallpaths(int src, int des, String ans, HashSet<Integer> visited) {
		if(src==des) {
			System.out.println(ans+src);
			return;
		}
		visited.add(src);
		for(int nbrs:hm.get(src).keySet()) {
			if(!visited.contains(nbrs))
			printallpaths(nbrs,des,ans+src+"-> ",visited);
		}
		visited.remove(src);
		
	}
	
}

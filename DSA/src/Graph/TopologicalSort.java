package Graph;
import java.util.*;
public class TopologicalSort {


	HashMap<Integer, HashMap<Integer, Integer>> map=new HashMap<>();
	public TopologicalSort(int v) {
		for(int i=1;i<=v;i++) {
			map.put(i, new HashMap<>());
		}
	}
	public void AddEdge(int v1 ,int v2) {
		map.get(v1).put(v2, 0);//v1--->v2 (unweighted)
		
	}
	
	public int[] Indegree() {
		int v=map.size();
		int[] arr=new int[v+1];
		for(int key:map.keySet()) {
			for(int nbrs:map.get(key).keySet()){
				arr[nbrs]++;		//edge key se neighbour ke pass jaa rhi hai to neighbour ka indegree  ek se increase ho jayega.
			}
		}
		return arr;
	}
	
	public boolean Topological() {
		int[] in=Indegree();
		Queue<Integer> qq=new LinkedList<>();
		for(int i=1;i<in.length;i++) {
			if(in[i]==0) {
				qq.add(i);
			}
		}
		int c=0;
		while(!qq.isEmpty()) {
			int rv=qq.poll();
			c++;
			System.out.print(rv+" ");
			for(int nbrs:map.get(rv).keySet()) {
				in[nbrs]--;
				if(in[nbrs]==0) {
					qq.add(nbrs);
				}
			}
		}
		System.out.println();
		return c<map.size();//while loop jitni baar chlega jitne hmare vertex honge agr cycle nhi hogi to.
	}
	
	public static void main(String[] args) {
		TopologicalSort ts=new TopologicalSort(7);
		ts.AddEdge(1, 2);
		ts.AddEdge(1, 4);
		ts.AddEdge(4, 3);
		ts.AddEdge(3, 2);
		ts.AddEdge(4, 5);
		ts.AddEdge(5, 7);
		ts.AddEdge(6, 3);
		ts.AddEdge(6, 7);
		System.out.println(ts.Topological());		
	}
}




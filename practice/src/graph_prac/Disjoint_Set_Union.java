package graph_prac;
import java.util.*;

public class Disjoint_Set_Union {
	class Node{
		int vtx;
		Node par;
		int rank;
	}
	
	HashMap<Integer,Node> hm = new HashMap<>();
	public void Create(int v) {
		Node n = new Node();
		n.vtx = v;
		n.par = n;		//first everyone are their own parent
		hm.put(v, n);			
	}
	
	public int find(int v) {
		return find(hm.get(v)).vtx;
	}
	
	public Node find(Node v) {
		if(v.par==v)
			return v;
		
		return v.par = find(v.par); //path compression
	}
	
	public void union(int v1, int v2) {
		union(hm.get(v1), hm.get(v2));
	}
	
	public void union(Node v1, Node v2) {
		Node repv1 = find(v1);	//representative element of v1
		Node repv2 = find(v2); 	//representative element of v2
		
		if(repv1==repv2)
			return;
		
		if(repv1.rank<repv2.rank)
			repv1.par = repv2;
		
		else if(repv1.rank<repv2.rank)
			repv2.par = repv1;
		
		else {
			repv1.par = repv2;
			repv2.rank++;
		}
	}
	
	public static void main(String[] args) {
		Disjoint_Set_Union dsu = new Disjoint_Set_Union();
		dsu.Create(1);
		dsu.Create(2);
		dsu.Create(3);
		dsu.Create(4);
		dsu.Create(5);
		dsu.union(2, 4);
		dsu.union(1, 3);
		if(dsu.find(1)==dsu.find(2))
			System.out.println("YES");
		else
			System.out.println("NO");
		
		if(dsu.find(1)==dsu.find(3))
			System.out.println("YES");
		else
			System.out.println("NO");
		
		if(dsu.find(2)==dsu.find(4))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}

package graph_prac;

public class Basic_Disjoint_Set_Union {
	int par[],rank[];
		
	Basic_Disjoint_Set_Union(int n){
		par = new int[n];
		rank = new int[n];
		for(int i=0;i<n;i++)
			par[i]=i;
	}
	
	public int find(int i) {	//find representative element
		if(par[i]==i)
			return i;
		
		return par[i]=find(par[i]);	//path compression
	}
	
	public void merge(int i, int j) {
		int pi = find(i);
		int pj = find(j);
		
		if(pi==pj)
			return;
		if(rank[i]<rank[j])
			par[i] = pj;
		else if(rank[i]>rank[j])
			par[j] = pi;
		else {
			par[i] = pj;
			rank[j]++;
		}
	}
	
	public static void main(String[] args) {
		Basic_Disjoint_Set_Union dsu = new Basic_Disjoint_Set_Union(5);
		dsu.merge(1, 2);
		dsu.merge(3,2);
		if(dsu.find(1)==dsu.find(3))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}

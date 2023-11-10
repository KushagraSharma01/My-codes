package Graph;

import java.util.HashSet;

public class Graph_Cleint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph gh=new Graph(7);
		gh.AddEdge(1, 4, 6);
		gh.AddEdge(1, 2, 10);
		gh.AddEdge(2, 3, 7);
		gh.AddEdge(3, 4, 5);
		gh.AddEdge(4, 5, 1);
		gh.AddEdge(5, 6, 4);
		gh.AddEdge(7, 5, 2);
		gh.AddEdge(6, 7, 3);
		gh.Display();
		System.out.println(gh.haspath(1,6,new HashSet<>()));
		gh.PrintAllPath(1, 6, new HashSet<>(), "");
	}

}

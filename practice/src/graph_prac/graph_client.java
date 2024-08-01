package graph_prac;
import java.util.*;
public class graph_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		graph gh = new graph(5);
//		gh.addedge(1, 2, 0);
//		gh.addedge(1, 4, 0);
//		gh.addedge(1, 5, 0);
//		gh.addedge(2, 5, 0);
//		gh.addedge(2, 4, 0);
//		gh.addedge(2, 3, 0);
//		gh.addedge(5, 4, 0);
//		gh.addedge(4, 3, 0);
//		gh.printallpaths(1,3,"",new HashSet<>());
		traversals gh = new traversals(5);
		gh.addedge(1, 2, 0);
		gh.addedge(1, 4, 0);
//		gh.addedge(1, 5, 0);
//		gh.addedge(2, 5, 0);
//		gh.addedge(2, 4, 0);
		gh.addedge(2, 3, 0);
//		gh.addedge(5, 4, 0);
		gh.addedge(4, 3, 0);
		System.out.println(gh.BFS(1, 5));
		System.out.println(gh.DFS(1, 5));
		System.out.println(gh.BFT());
		System.out.println(gh.DFT());
	}

}

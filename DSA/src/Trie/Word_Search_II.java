package Trie;

import java.util.HashMap;
import java.util.*;
import Trie.Trie.Node;

public class Word_Search_II {
	
	static class Node{								
		char data;
		String isTerminal = null;
		HashMap<Character, Node> child = new HashMap<>();
	
	}
	
	public static void insert(Node root,String word) {
		Node curr = root;
		for(int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			
			if(curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			}
			else {
				Node nn = new Node();
				nn.data = ch;
				curr.child.put(ch, nn);
				curr = nn;
				curr = curr;
			}
		}
		curr.isTerminal = word;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] [] board = {{'o','a','a','n'},
							{'e','t','a','e'},
							{'i','h','k','r'},
							{'i','f','l','v'}};
		String [] words = {"oath","pea","eat","rain"};
		Node root = new Node();
		for(String s: words) {
			insert(root, s);
		}
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				if(root.child.containsKey(board[i][j])) {
					wordsearch(board, i, j, root);
				}
			}
		}
		System.out.println(l1);
	}
	static ArrayList<String> l1 = new ArrayList<>();
	private static void wordsearch(char[][] board, int i, int j, Node root) {
		// TODO Auto-generated method stub
		if(i<0||j<0||i>=board.length||j>=board[0].length||!root.child.containsKey(board[i][j]))
			return;
		
		char ch = board[i][j];
		Node curr = root.child.get(board[i][j]);
		if(curr.isTerminal!=null) {
			l1.add(curr.isTerminal);
			curr.isTerminal = null;
		}
		
		board[i][j]='*';
		wordsearch(board,i+1,j,curr);
		wordsearch(board,i,j+1,curr);
		wordsearch(board,i-1,j,curr);
		wordsearch(board,i,j-1,curr);
		board[i][j]=ch;
	}

}

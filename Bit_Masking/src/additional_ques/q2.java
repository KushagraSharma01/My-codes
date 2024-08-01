package additional_ques;

public class q2 {
	//421. Maximum XOR of Two Numbers in an Array
	//Given an integer array nums, return the maximum result of nums[i] XOR nums[j], where 0 <= i <= j < n.
	//approach --> trie can be used in order to retrieve the bits of the elements of array
	//then we will apply a loop for each element in array to check it's max XOR with other elements by using trie
	
	public static class Node {
		Node zero;				//child zero
		Node one;				//child one
	}

	public static void Insert(Node root, int val) {
		Node curr = root;
		for (int i = 31; i >= 0; i--) {		// to get max XOR that is why we are starting from 31st bit
			int bit = (val & (1 << i));		// we are adding only the nodes which are not present from before
			if (bit == 0) {
				if (curr.zero != null) {
					curr = curr.zero;
				} else {
					Node nn = new Node();
					curr.zero = nn;
					curr = nn;

				}
			} else {
				if (curr.one != null) {
					curr = curr.one;
				} else {
					Node nn = new Node();
					curr.one = nn;
					curr = nn;

				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 3, 10, 5, 25, 2, 8 };
		Node root = new Node();
		for (int val : arr) {
			Insert(root, val);
		}
		int ans = Integer.MIN_VALUE;
		for (int val : arr) {
			ans = Math.max(ans, getxor(root, val));
		}
		System.out.println(ans);

	}

	private static int getxor(Node root, int val) {
		// TODO Auto-generated method stub
		Node curr = root;
		int xor = 0;
		for (int i = 31; i >= 0; i--) {
			int bit = (val & (1 << i));
			if (bit == 0) {
				if (curr.one != null) {
					xor += (1 << i);
					curr = curr.one;
				} else {
					curr = curr.zero;
				}
			} else {
				if (curr.zero != null) {
					xor += (1 << i);
					curr = curr.zero;
				} else {
					curr = curr.one;
				}
			}
		}
		return xor;
	}
}
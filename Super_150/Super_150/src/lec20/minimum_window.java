package lec20;

public class minimum_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ABCODEBANC";
		String t="ABC";
		System.out.println(MinimumWindow(s,t));
		
	}
	public static String MinimumWindow(String s, String t) {
		int[] freqt=new int[123];
		for(int i=0;i<t.length();i++) {
			char ch=t.charAt(i);
			freqt[ch]++;		//implicit type casting.... ch is used as an integer in this freq[ch]..,//here we used ++ to  
			System.out.println(ch);       		//A ,//make the elements of the array to be 1 from their current value 0
			System.out.println(freqt[ch]);			//1 ,//which have index equal to the ascii value of ch, we are basically
												//increasing the frequency of the elements of t as per their occurrence
		}
		int[] freqs=new int[123];
		int si=0;
		int ei=0;
		int start=-1;
		int len=Integer.MAX_VALUE;
		int count=0;
		while(ei<s.length()) {
			//grow
			char ch=s.charAt(ei);
			freqs[ch]++;
			if(freqt[ch]>=freqs[ch]) {
				count++;
			}
			//shrink
			if(count==t.length()) {				//this means all the characters present in t are found in the substring of s
				//char c=s.charAt(si);
				while(freqs[s.charAt(si)]>freqt[s.charAt(si)] && si<=ei) {
					freqs[s.charAt(si)]--;
					si++;
				}
			
			//answer
				if(len>ei-si+1) {			//even when abc is at both startand  end but what matters is the shortest length		
					len=ei-si+1;
					start=si;
				}
			}
			ei++;
		}
		if(start==-1) {
			return "";
		}
		return s.substring(start,start+len);
	}

}

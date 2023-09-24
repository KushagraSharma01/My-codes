package lec20;

public class longestnonrepeating {
public static void main(String[] args) {
	
}
public static int nonrepeatlong(String s){
	int[] a = new int[123];
    int sti = 0;
    int eni = 0;
    int answer = 0;
    while(eni<s.length()){
    	//window increase
    	a[s.charAt(eni)]++;
    	//window shrink
        while(a[s.charAt(eni)]>1){
            a[s.charAt(sti)]--;
            sti++;
        }
        
        answer = Math.max(answer,eni-sti+1);
        eni++;
    }
    return answer;
}
}

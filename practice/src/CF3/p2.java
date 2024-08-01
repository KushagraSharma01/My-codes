package CF3;
import java.util.*;
public class p2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			HashMap<Integer, Integer> hm = new HashMap<>();
			List<Integer> l1 = new ArrayList<>();
			int min = Integer.MAX_VALUE;
			for(int i=0;i<(n*n);i++) {
				
				int a = sc.nextInt();
				l1.add(a);
				if(hm.containsKey(a))
					hm.put(a, hm.get(a)+1);
				else
					hm.put(a, 1);
				min = Math.min(min, a);
				
			}
//			stanlee
//			System.out.println(l1);
			int currcol = min;
			boolean f = false;
			for(int i=0;i<n;i++) {
				int currow = currcol ;
				for(int j=0;j<n-1;j++) {
					currow += c;
					if(hm.containsKey(currow)) {
						if(hm.get(currow)>1)
							hm.put(currow, hm.get(currow)-1);
						else
							hm.remove(currow);
					}
					else {
						f = true;
						break;
					}
					
					
				}
				
					if(hm.containsKey(currcol)) {
						
						if(hm.get(currcol)>1)
							hm.put(currcol, hm.get(currcol)-1);
						else
							hm.remove(currcol);
					}
					else
						break;
					if(f)
						break;
				currcol +=  d;
				
			}
			if(hm.size()==0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}

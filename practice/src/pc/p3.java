package pc;

public class p3 {
	public static void main(String[] args) {
		Node slow = head;
        Node fast = head;
	Node prev; 
        int flag = 0;
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
	    prev=slow;
            slow = slow.next;

            if(slow == fast)
            {
		if(slow==head){
		prev.next=null;
		return true;
		}
                flag = 1;
                slow = head;
                while(slow != fast)
                {
			
                    slow = slow.next;
                    fast = fast.next;
                }
                slow.next = null;
                return true;
            }
        }
        return false;
	}
}

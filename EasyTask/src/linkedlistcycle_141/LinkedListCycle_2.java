package linkedlistcycle_141;
/**
 * 解法二：双指针法
 * 采用快慢两指针，快指针一次跑两步，慢指针一次跑一步，如果存在环，那么快指针和慢指针定会相遇(无论快慢指针初始位置如何)
 * 空间复杂度O(1)，时间复杂度O(N+K)
 * @author 127
 *
 */
public class LinkedListCycle_2 {
	 public boolean hasCycle(ListNode head) {
	        if(head==null||head.next==null) return false;
	        ListNode fast=head.next;
	        ListNode slow=head;
	        while(fast.next!=null&&fast.next.next!=null&&slow.next!=null){
	            if(fast==slow) return true;
	            fast=fast.next.next;
	            slow=slow.next;
	        }
	        return false;
	    }
} 

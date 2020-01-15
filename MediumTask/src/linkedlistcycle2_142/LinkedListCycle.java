package linkedlistcycle2_142;
/**
 * 解法一：双指针法
 * 先判断是否存在环，如果存在环时环起点即为栈头和相遇点同时移动的相遇点
 * 要点：相遇点为均从栈头出发的快慢指针的相遇点
 * 此时空间复杂度为O(1)
 * 解法二：哈希表法
 * 和141基本无区别，空间复杂度为O(N)
 * @author 127
 *
 */

public class LinkedListCycle {
	class Node{
		int val;
		Node next;
		Node(int x) {
			val = x;
			next = null;
		}
		Node(int x,Node next){
			val=x;
			this.next=next;
		}
	}
	public Node detectCycle(Node head) {
		 Node fast = head, slow = head;
	        while (true) {
	            if (fast == null || fast.next == null) return null;
	            fast = fast.next.next;
	            slow = slow.next;
	            if (fast == slow) break;
	        }
	        fast = head;
	        while (slow != fast) {
	            slow = slow.next;
	            fast = fast.next;
	        }
	        return fast;
	    }
    }

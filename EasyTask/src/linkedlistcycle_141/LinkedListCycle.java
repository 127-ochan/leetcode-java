package linkedlistcycle_141;

import java.util.HashMap;
import java.util.Map;

/**
 * 解法一：查表法
 * 涉及到判断是否存在某元素--哈希表效率最高
 * 时间空间复杂度均为O(N)
 * @author 127
 *
 */

public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
        Map<ListNode,Integer> nMap=new HashMap<>();
        ListNode cur=head;
        int pos=-1;
        int i=0;
        while(cur!=null){
            if(nMap.containsKey(cur)){
                pos=nMap.get(cur);
                break;
            }
            nMap.put(cur,i);
            cur=cur.next;
            i++;
        }
        return pos!=-1;
    }
}
class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
}

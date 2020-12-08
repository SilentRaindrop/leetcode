package list;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class leetcode142 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(true){
            if(fast==null||fast.next==null) return null;
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        fast=head;
        while(fast!=slow){
            slow=slow.next;
            fast=fast.next;
        }
        return fast;
    }
}
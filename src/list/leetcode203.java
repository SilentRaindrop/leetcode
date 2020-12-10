package list;
//移除链表元素
public class leetcode203 {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode f=dummy;
        ListNode l=head;
        while(l!=null){
            if(l.val==val){
                f.next=f.next.next;
                //1.
                //l=l.next;
                //f=f.next;
                l=f.next;}
            else{
                l=l.next;
                f=f.next;
            }
        }
        head=dummy.next;
        return head;
    }
}
package list;

public class leetcode21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode();
        ListNode tail=dummy;
        ListNode first=l1;
        ListNode last=l2;
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                tail.next=l1;
                l1=l1.next;
                tail=tail.next;
                tail.next=null;
            }
            else{
                tail.next=l2;
                l2=l2.next;
                tail=tail.next;
                tail.next=null;
            }
        }
        if(l1!=null)
            tail.next=l1;
        if(l2!=null)
            tail.next=l2;
        return dummy.next;
    }
}
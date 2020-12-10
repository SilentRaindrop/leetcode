package list;

class leetcode206 {
    public ListNode reverseList(ListNode head) {
        //准备两个指针
        if(head==null) return null;
        ListNode f=head;
        ListNode l=head.next;
        ListNode temp=head.next;
        f.next=null;
        while(temp!=null){
            temp=temp.next;
            l.next=f;
            f=l;
            l=temp;
        }
        head=f;
        return head;
    }
}
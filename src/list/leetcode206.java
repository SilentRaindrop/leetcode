package list;
//反转链表
//这是我第一个自主做出来的题目，尽管它对于其他人而言非常简单，但是对我来说这是一个伟大的开始。
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
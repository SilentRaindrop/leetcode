package list;

//删除链表的倒数第n个结点
class leetcode19 {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy=new ListNode(0,head);//为链表增加伪头结点
            ListNode first=head;
            ListNode second=dummy;
            for(int i=0;i<n;i++){
                first=first.next;
            }
            while(first!=null){
                first=first.next;
                second=second.next;
            }
            second.next=second.next.next;
            return dummy.next;
        }
    }
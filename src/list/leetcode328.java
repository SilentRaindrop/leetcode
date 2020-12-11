package list;
//给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
//
//请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//算法思想：要求在空间复杂度为1内完成，所以不允许new出新空间；一共准备了三个指针，一个用作偶数链表表头
//方便后面连接用，一个用于连接奇数结点，一个用于连接偶数结点
public class leetcode328 {
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        ListNode odd=head;
        ListNode evenhead=head.next;
        ListNode even=evenhead;
        while(even!=null&&even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenhead;
        return head;
    }
}

package list;
//设计链表
//
class LinkNode{
    int val;
    LinkNode next;
    public LinkNode(int val){
        this.val=val;
    }
}
class MyLinkedList {
    int size;
    LinkNode head;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        size=0;
        head=new LinkNode(0);
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(size<=index||index<0)
        {
            //system.out.println("获取失败");
            return -1;
        }
        else
        {
            LinkNode p=head;
            for(int i=0;i<index+1;i++)
                p=p.next;
            return p.val;
        }

    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index>size)
            return;
        if(index<0)
            index=0;
        size++;
        LinkNode p=head;
        for(int i=0;i<index;i++)//找到前一个结点
            p=p.next;
        LinkNode x=new LinkNode(val);
        x.next=p.next;
        p.next=x;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        LinkNode x=head;
        size--;
        for(int i=0;i<index;i++)
            x=x.next;
        x.next=x.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
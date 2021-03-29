package list;


import java.util.List;

class listNode{
    int val;
    listNode next;
    listNode prev;
    public listNode(){}
    public listNode(int val){this.val=val;}

}

public class doubleList {
    listNode head;
    listNode tail;
    int size;
    public doubleList(){
        head=new listNode();
        tail=new listNode();
        head.next=tail;
        tail.prev=head;
        size=0;
    }
    //指定位置插入
    public void addAtIndex(int index,int val){
        if(index<0) index=0;
        if(index>size) index=size;
        listNode temp=head;
        for(int i=0;i<=index;i++){
            temp=temp.next;//到达添加结点的位置
        }
        listNode x=new listNode(val);
        //先链后断
        x.next=temp;
        x.prev=temp.prev;
        temp.prev.next=x;
        x=temp.prev;
        size+=1;
    }
    public int get(int index){
        if(index<0||index>size)
            return -1;
        listNode node=head;
        for(int i=0;i<=index;i++){
            node=node.next;
        }
        return node.val;
    }
    public void addAtHead(int val){
        addAtIndex(1,val);
        size+=1;
    }
    public void addAtTail(int val){
        addAtIndex(size,val);
        size+=1;
    }
    public void deleteAtIndex(int index){
        listNode temp=head;
        for(int i=0;i<=index;i++){
            temp=temp.next;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        temp.next=null;
        temp.prev=null;
        size--;
    }

    public static void main(String[] args) {
        doubleList d=new doubleList();
        d.addAtHead(1);
        d.addAtIndex(1,2);
    }
}
/*
class MyLinkedList {
    private int size;
    private MyListNode dummyHead;
    private MyListNode dummyTail;

    private class MyListNode{
        int val;
        MyListNode next;
        MyListNode prev;

        public MyListNode(){}

        public MyListNode(int val){
            this.val=val;
        }

        public MyListNode(int val,MyListNode next,MyListNode prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }

        @Override
        public String toString() {
            return val+"";
        }
    }

    */
/** Initialize your data structure here. *//*

    public MyLinkedList() {
        dummyHead=new MyListNode();
        dummyTail=new MyListNode();
        dummyHead.next=dummyTail;
        dummyTail.prev=dummyHead;
    }

    */
/** Get the value of the index-th node in the linked list. If the index is invalid, return -1. *//*

    public int get(int index) {
        if(index<0 || index>size-1)
            return -1;
        else
            return getIndexNode(index).val;
    }

    */
/** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. *//*

    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    */
/** Append a node of value val to the last element of the linked list. *//*

    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    */
/** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. *//*

    public void addAtIndex(int index, int val) {
        if(index<0){
            addAtIndex(0,val);
        }else if(index<=size){
            MyListNode currNode=getIndexNode(index);
            MyListNode node=new MyListNode(val);
            MyListNode prevNode=currNode.prev;
            node.prev=prevNode;
            node.next=currNode;
            currNode.prev=node;
            prevNode.next=node;
            size++;
        }
    }

    */
/** Delete the index-th node in the linked list, if the index is valid. *//*

    public void deleteAtIndex(int index) {
        if(index >=0 && index<size){
            MyListNode currNode=getIndexNode(index);
            MyListNode prevNode=currNode.prev;
            MyListNode nextNode=currNode.next;
            prevNode.next=currNode.next;
            nextNode.prev=currNode.prev;
            currNode.prev=null;
            currNode.next=null;
            size--;
        }
    }

    public MyListNode getIndexNode(int index){
        MyListNode curr;
        if(index<=size/2){
            curr=dummyHead.next;
            for(int i=0;i<index;i++,curr=curr.next){}
        }else{
            curr=index==size?dummyTail:dummyTail.prev;
            for (int i=0;i<size-index-1;i++,curr=curr.prev){};
        }
        return curr;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer=new StringBuffer("head <-> ");
        MyListNode tempNode=dummyHead.next;
        for (int i=0;i<size;i++,tempNode=tempNode.next){
            stringBuffer.append(tempNode.val+" <-> ");
        }
        stringBuffer.append("tail");
        return stringBuffer.toString();
    }

}
*/

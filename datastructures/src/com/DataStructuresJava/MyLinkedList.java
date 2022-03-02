package com.DataStructuresJava;
class MyLinkedList{
    class MyNode{
        int data;
        MyNode next;
        MyNode(int da){
            this.data=da;
            this.next=null;
        }
    }
    MyNode head=null,tptr;
    void push(int d){
        MyNode nptr=new MyNode(d);
        if (head==null){
            head=nptr;
            tptr=head;
        }else{
            tptr.next=nptr;
            tptr=nptr;
        }
    }
    public MyNode reverse(MyNode li){
        int c=0;
        while (li!=null || li.next!=null){
            return li;
        }
        return li;
    }
    public static MyNode addTwoLists(MyNode first, MyLinkedList second){

        return first;
    }
    static void printList(MyNode node)
    {
        while (node != null)
        {
            System.out.print(node.data+" ");
            node = node.next;
        }
    }
    void deleteNode(int key)
    {
        MyNode temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null)
            return;

        prev.next = temp.next;
    }
    public void insertAfter(int pos,int da){
        int i=0;
        if (pos==0){
          MyNode nptr=new MyNode(da);
          nptr.next=head;
          head=nptr;
          return;
        }
        pos--;
        for (MyNode trav=head;trav!=null;trav=trav.next,i++) {
            if(i==pos){
                MyNode tptr=trav.next;
                MyNode nptr=new MyNode(da);
                trav.next=nptr;
                nptr.next=tptr;
                break;
            }
        }
    }
    public void deleteItem(int pos){
        int i=0;
        if(pos==0){
            head=head.next;
        }
        pos--;
        for (MyNode trav = head;trav!=null ;trav=trav.next,i++) {
            if(i==pos){
                trav.next=trav.next.next;
                break;
            }
        }
    }
}

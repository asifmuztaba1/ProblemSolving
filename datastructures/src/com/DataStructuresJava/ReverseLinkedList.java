package com.DataStructuresJava;

public class ReverseLinkedList {
    public static MyLinkedList.MyNode reverse(MyLinkedList.MyNode list, int k){
        int c=0;
        MyLinkedList.MyNode pnode=list;
        MyLinkedList.MyNode prevnode=null;
        MyLinkedList.MyNode temp=null;
        while (pnode!=null && c<k){
            temp=pnode.next;
            pnode.next=prevnode;
            prevnode=pnode;
            pnode=temp;
            c++;
        }
        if(pnode!=null)
        {
            list.next=reverse(temp,k);
        }
        return prevnode;
    }
    public static int countList(MyLinkedList list){
        int c=0;
        MyLinkedList.MyNode tnode=list.head;
        while (tnode!=null){
            c++;
            tnode=tnode.next;
        }
        return c;
    }
}

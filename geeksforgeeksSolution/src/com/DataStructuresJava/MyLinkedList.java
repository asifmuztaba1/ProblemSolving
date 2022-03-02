package com.DataStructuresJava;

public class MyLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    Node head;
    public Node pushlist(int n){
        if(head==null){
            Node nptr=new Node(n);
            head=nptr;
            head.next=nptr;
        }
        return head;
    }
    static void printList(Node n){
        while (n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }
}

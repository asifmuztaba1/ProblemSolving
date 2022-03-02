package com.DataStructuresJava;

public class BST {
    class Mytree{
        int data;
        Mytree left,right;
        Mytree(int d){
            this.data=d;
            this.left=null;
            this.right=null;
        }
    }
    Mytree root=null;
    public void treeInsert(int d){
        Mytree ntr=new Mytree(d);
        if(root==null){
            root=ntr;
            return;
        }else{
            Mytree traverse=root;
            while (traverse!=null){
                if(traverse.data<d){
                    if(traverse.right==null){
                        traverse.right=ntr;
                        return;
                    }else{
                        traverse=traverse.right;
                    }
                }else {
                    if(traverse.left==null){
                        traverse.left=ntr;
                        return;
                    }else{
                        traverse=traverse.left;
                    }
                }
            }
            traverse=ntr;
        }
    }
    public void printTree(Mytree t){
        if(t==null){
            return;
        }
        printTree(t.left);
        System.out.println(t.data);
        printTree(t.right);
    }
}

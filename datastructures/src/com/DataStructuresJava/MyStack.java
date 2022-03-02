package com.DataStructuresJava;

import java.util.Stack;

public class MyStack {
        public void push(int a, Stack<Integer> s)
        {
            s.push(a);
        }
        public int pop(Stack<Integer> s)
        {
            return s.pop();
        }
        public int min(Stack<Integer> s)
        {
            int min=Integer.MAX_VALUE;

            for(int i=0;i<s.size();i++)
            {
                int j=s.get(i);
                min=Math.min(min,j);
            }
            return min;
        }
        public boolean isFull(Stack<Integer>s, int n)
        {
            return s.size()==n;
        }
        public boolean isEmpty(Stack<Integer>s)
        {
            return s.empty();
        }
}

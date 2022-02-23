package com.DataStructuresJava;

public class Main {
    static int reverse=0;
    public static void main(String[] args) {
	    int num=5;
        System.out.println(fib(num));
        int rev=987;
        System.out.println(reverse(rev));
    }

    private static int reverse(int rev) {
        if(rev==0){
            return reverse;
        }else{
            int t=rev%10;
            reverse=reverse*10+t;
            reverse(rev/10);
        }
        return reverse;
    }

    private static int fib(int num) {
        if(num<2) return num;
        return num*fib(num-1);
    }
}

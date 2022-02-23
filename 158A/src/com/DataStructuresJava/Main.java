package com.DataStructuresJava;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int k= scan.nextInt();
        int[] a=new int[n];
        int temp=0,pos=0,l=0;
        for (int i = 0; i < n; i++) {
            a[i]=scan.nextInt();
        }
        if(a[0]==0){
            System.out.println(0);
        }else{
            int tempmark=a[k-1];
            for (int i = n-1; i >=0; i--) {
                if(a[i]==tempmark && tempmark!=0){
                    System.out.println(i+1);
                    break;
                }
                if(tempmark==0 && a[i]>tempmark){
                    System.out.println(i+1);
                    break;
                }
            }
        }

    }
}

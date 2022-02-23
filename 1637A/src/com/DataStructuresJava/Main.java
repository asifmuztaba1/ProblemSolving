package com.DataStructuresJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        for (int i = 0; i < T; i++) {
            int n= scan.nextInt();
            int[] arr=new int[n];
            for (int j = 0; j < n; j++) {
                arr[j]=scan.nextInt();
            }
            if (issorted(arr)){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
    public static boolean issorted(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]>a[i+1]){
                return false;
            }
        }
        return true;
    }
}

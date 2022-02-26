package com.DataStructuresJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int T=scan.nextInt();
        for (int i = 0; i < T; i++) {
            int n=scan.nextInt();
            int k=scan.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            int cur=k;
            for (int j = 0; j < n; j++) {
                a[j]=scan.nextInt();
            }
            for (int j = 0; j < n; j++) {
                b[j]=scan.nextInt();
            }
            for (int j = 0; j < n; j++) {
                if(a[j]<=cur){
                    cur+=b[j];
                    a[j]=999999;
                    j=-1;
                }
            }
            System.out.println(cur);
        }
    }
}

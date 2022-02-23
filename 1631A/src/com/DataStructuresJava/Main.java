package com.DataStructuresJava;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T= scan.nextInt();
        for (int i = 0; i < T; i++) {
            int n= scan.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=scan.nextInt();
            }
            for (int j = 0; j < n; j++) {
                b[j]=scan.nextInt();
            }
            for (int j = 0; j < n; j++) {
                if(a[j]<b[j]){
                    int temp=a[j];
                    a[j]=b[j];
                    b[j]=temp;
                }

            }
            Arrays.sort(a);
            Arrays.sort(b);
            System.out.println(a[n-1]*b[n-1]);
        }
    }
}

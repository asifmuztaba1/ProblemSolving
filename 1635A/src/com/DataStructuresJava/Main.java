package com.DataStructuresJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int T=scan.nextInt();
        for (int i = 0; i < T; i++) {
            int n=scan.nextInt();
            long[] s=new long[n];
            long tt=0;
            for (int j = 0; j < n; j++) {
                s[j]=scan.nextLong();
                tt=tt|s[j];
            }
            System.out.println(tt);
        }
    }
}

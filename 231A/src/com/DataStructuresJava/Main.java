package com.DataStructuresJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int[] p=new int[3];
        int s=0,z=0;
        for (int i = 0; i < T; i++) {
            z=0;
            for (int j = 0; j < 3; j++) {
                p[j]= scan.nextInt();
                if(p[j]==1){
                   z++;
                }
            }
            if(z>=2){
                s++;
            }
        }
        System.out.println(s);
    }
}

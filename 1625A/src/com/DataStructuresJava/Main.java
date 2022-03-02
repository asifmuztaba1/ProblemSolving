package com.DataStructuresJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int T= scan.nextInt();
        for (int i = 0; i < T; i++) {
            int n =scan.nextInt();
            int l= scan.nextInt();
            int[] x=new int[n];
            int res=0;
            for (int j = 0; j < n; j++) {
                x[j]= scan.nextInt();
            }
            for (int j = 0; j <=30; j++) {
                int on=0,zr=0;
                for (int k = 0; k < n; k++) {
                    if((x[k]&(1<<j))==0){
                        zr++;
                    }else{
                        on++;
                    }
                }
                if(on>zr){
                    res=res|(1<<j);
                }
            }
            System.out.println(res);
        }
    }
}

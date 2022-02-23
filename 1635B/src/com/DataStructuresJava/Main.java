package com.DataStructuresJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int T=scan.nextInt();

        for (int i = 0; i < T; i++) {
            int n=scan.nextInt();
            int[] li=new int[n];
            for (int j = 0; j < n; j++) {
                li[j]=scan.nextInt();
            }
            int c=0;
            for (int j = 0; j < n; j++) {
                if(j!=0 && j!=n-1 && (li[j]> li[j-1]) && (li[j]>li[j+1])){
                    if(j+2<n){
                        li[j+1]=Math.max(li[j],li[j+2]);
                    }else{
                        li[j+1]=li[j];
                    }
                    c++;
                }
            }
            System.out.println(c+"\n"+Arrays.toString(li).replace('[',' ').replace(']',' ').replace(',',' '));
        }
    }
}

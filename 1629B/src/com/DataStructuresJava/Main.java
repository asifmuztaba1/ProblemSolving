package com.DataStructuresJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int T= scan.nextInt();
        for (int i = 0; i < T; i++) {
            int l=scan.nextInt();
            int r= scan.nextInt();
            int k= scan.nextInt();
            int len=r-l+1;
            if (r==l && r!=1){
                    System.out.println("YES");
                    continue;
            }else if(r==l && r==1){
                System.out.println("NO");
                continue;
            }
            int odd=0;
            if(len%2==0){
                odd=len/2;
            }else{
                if(r%2==0 && l%2==0){
                    odd=len/2;

                }else{
                    odd=len/2+1;

                }
            }
            if( odd<=k){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}

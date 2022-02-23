package com.SquaresandCubes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int testcase= scan.nextInt();
        int n=0,k=0;
        String s="";

        for (int i=0;i<testcase;i++){
            int counter=0;
            n=scan.nextInt();
            k= scan.nextInt();
            scan.nextLine();
            s= scan.nextLine();
            if(k==0){
                System.out.println(1);
                continue;
            }else{
                int flg=0;
                for(int r=0,l=n-1;r<l;r++,l--){
                    if(s.charAt(r)!=s.charAt(l)){
                        flg=1;
                        break;
                    }
                }
                if(flg==1){
                    System.out.println(2);
                }else{
                    System.out.println(1);
                }
            }
        }
    }
}

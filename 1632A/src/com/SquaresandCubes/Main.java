package com.SquaresandCubes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int testcase=scan.nextInt();
        for (int i=0;i<testcase;i++){
            int n=scan.nextInt();
            scan.nextLine();
            String s=scan.nextLine();
            if(n<=1){
                System.out.println("YES");
                continue;
            }
            else if(n==2) {
                System.out.println(s.charAt(0));
                System.out.println((s.charAt(0)==s.charAt(1))?"NO":"YES");

            }else {
                System.out.println("NO");
            }
        }
    }
}

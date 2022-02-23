package com.Minority;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int testcase= scan.nextInt();
        for(int i=0;i<testcase;i++){
            String bin=scan.next();
            if(bin.length()==0) continue;
            if(bin.length()==2){
                System.out.println(0);
            }else {
                int one = 0, zero = 0;
                for (int j = 0; j < bin.length(); j++) {
                    if (bin.charAt(j) == '1') {
                        one++;
                    } else if (bin.charAt(j) == '0') {
                        zero++;
                    }
                }
                if (one > zero) {
                    System.out.println(zero);
                } else if (zero > one) {
                    System.out.println(one);
                } else {
                    System.out.println(zero - 1);
                }
            }
        }
    }
}

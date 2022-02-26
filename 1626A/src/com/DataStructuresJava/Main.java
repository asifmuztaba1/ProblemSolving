package com.DataStructuresJava;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int T=scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < T; i++) {
            String s=scan.nextLine();
            int[] alp=new int[26];
            for (int j = 0; j < s.length(); j++) {
                alp[s.charAt(j)-'a']++;
            }
            for (int j = 0; j < alp.length; j++) {
                for (int k = 0; k < alp[j]; k++) {
                    System.out.print((char)(j+97));
                }
            }
            System.out.println();
        }
    }
}

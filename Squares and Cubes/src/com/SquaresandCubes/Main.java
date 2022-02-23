package com.SquaresandCubes;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int testCase=scan.nextInt();
//        long num;
//        for (int i=0;i<testCase;i++){
//            Set<Long> set=new HashSet<Long>();
//            num=scan.nextLong();
//            for (long ij=1;ij*ij<=num;ij++){
//                set.add(ij*ij);
//                if (ij*ij*ij<=num){
//                    set.add(ij*ij*ij);
//                }
//            }
//            System.out.println(set.size());
//        }
        repeatedString("a",10);
    }
    public static long repeatedString(String s, long n) {
        int slength=s.length();
        int i=0;
        int con=0,nmaxl=0;
        char[] ch = s.toCharArray();
        do{
            if (ch[i]=='a') con++;
            if(i>=slength-1 && i< n) {
                i=0;
            }else {
                i++;
            }
            nmaxl++;
        }while(nmaxl<n);
        System.out.println(con);
        return con;
    }
}

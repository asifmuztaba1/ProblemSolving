package com.tuples;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static boolean prims(int h){
        if(h==2) return true;
        for(int i=2;i<h;i++){
            if(h%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> prims=new ArrayList<>();
        int testCase=scan.nextInt();
        int c=0;
        for(int i=1;i<=testCase;i++){
            int num=scan.nextInt();
            for(int j=1;j<num;j++){
                prims.add(j);
            }
            c=0;
            for(int k=1;k<prims.size()-3;k++){
                if(prims(prims.get(k))){
                    try {
                        if (prims.get(k) + prims.get(k + 1) == prims.get(k + 2)) {
                            c++;
                        }
                    }catch (Exception ignored){
                    }
                }
            }
        }
        System.out.println(c);
    }
}

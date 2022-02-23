package com.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int t=scan.nextInt();
        for (int i = 0; i < t; i++) {
            //System.out.println("TestCase="+i);
            int n=scan.nextInt();
            scan.nextLine();
            int[] in=new int[n];
            for (int j = 0; j < n; j++) {
                in[j]=scan.nextInt();
            }
            if (n==1){
                System.out.println(in[0]);
            }else{
                for (int j = 0; j < n; j++) {
                    if(in[j]!=(j+1)){
                        for (int k =n-1; k>j; k--) {
                            if(in[k]==(j+1)){
                                for (int l = k; l >j ; l--,j++) {
                                   int temp = in[l];
                                   in[l]=in[j];
                                   in[j]=temp;
                                }
                                break;
                            }
                        }
                        break;
                    }
                }
                System.out.println(Arrays.toString(in).replace("[", "").replace("]", " ").replace(","," "));

            }
        }
    }
}

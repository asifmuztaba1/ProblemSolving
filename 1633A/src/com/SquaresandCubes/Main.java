package com.SquaresandCubes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int T=scan.nextInt();
        for(int i=0;i<T;i++){
            int num=scan.nextInt();
            if(num%7==0){
                System.out.println(num);
            }else{
                num-=num%10;
                num+=9;
                num-=num%7;
                System.out.println(num);
            }
        }
    }
}

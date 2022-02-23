/*Approach:
we need to check if taro can get to the village with his coins where the coins will decrease by 1 for
per village travel and if he meet with a friend they he can gather one more coin and then we need to calculate the total vilage travels by taro.

Complexity:
As there are n times loop will be running the time complexity will be O(N^2)
*/
package com.tuples;

import java.util.*;
import java.lang.*;
import java.io.*;
import static java.util.Collections.*;
import static java.util.Arrays.*;
public class Main{
    void dijmain(){
        Scanner scan = new Scanner(System.in);
        double N=scan.nextDouble();
        double K=scan.nextDouble();
        double A=scan.nextDouble();
        double B=scan.nextDouble();
        double AN=scan.nextDouble();
        double BN=scan.nextDouble();
        double VIL=Math.pow(10, 100)+1;
        int chk=0;
        for (int i=0;i<VIL;i++){
            K--;
            if(K<0){
                System.out.println( i);
                break;
            }
            for(int f=0;f<N;f++){
                if(i>=A && i <=AN){
                    for(int cp=0;cp<AN && BN>=0;cp++){
                        K+=cp;
                        BN--;
                        if(BN<=0){
                            chk=1;
                            break;
                        }
                    }
                    if (chk==1){
                        break;
                    }
                }
            }
            if (chk==1){
                System.out.println(i);
                break;
            }
        }


    }
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        new Main().dijmain();
    }
}
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double k1, k2, sum1, sum2;
        sum1=0;
        sum2=0;
        for (double i=1; i<100; i=i+2) {
            k1=Math.pow(i,-1);
            sum1=sum1+k1;
        }
        for (double i=2; i<100; i=i+2) {
            k2=Math.pow(i,-1);
            sum2=sum1+k2;
        }
        double sum=sum1+sum2;
        double wayHome=sum1-sum2;
        System.out.println(sum);
        System.out.println(wayHome);
        in.close();// write your code here
    }
}
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = in.nextInt();
        double sum=0;
        double i;
        for (i=1; i<n+1; i++) {
            double z = Math.pow(i,-1);
            sum=sum+z;
        }
        System.out.println(sum);
        in.close();// write your code here
    }
}

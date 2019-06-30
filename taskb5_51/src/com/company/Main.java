package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Input n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double an,sum=0,average;
        for (int i = 0; i < n; i++){
            System.out.print("Input an: ");
            an=in.nextInt();
            sum=sum+an;
        }
        average=sum/n;
        System.out.println(average);
        in.close();
    }
}

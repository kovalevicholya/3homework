package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Input n: ");
        n=in.nextInt();
        double time, besttime = 0;
        for (int i = 0; i < n; i++){
            System.out.print("Input time: ");
            time=in.nextInt();
            if(time<besttime)
                besttime=time;
            System.out.print(besttime);
        }
        in.close();
    }
}


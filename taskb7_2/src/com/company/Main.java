package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.print("Input a: ");
        a=in.nextInt();
        System.out.print("Input b: ");
        b=in.nextInt();
        System.out.print("Input c: ");
        c=in.nextInt();

        System.out.print("Output of numbers: ");
        for (int i = a; i < b; i++){
            if(i%c==0)
                System.out.println(i);
        }
        in.close();
    }
}


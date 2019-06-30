package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double p0 = 1.29;
        double z = 1.25*10E-4;
        int h;
        double p;
        for (h=0; h<1001; h=h+100) {
            p = p0 * Math.pow(Math.E, -h * z);
            System.out.println(h + "  " + p);
        }
        in.close();// write your code here
    }
}

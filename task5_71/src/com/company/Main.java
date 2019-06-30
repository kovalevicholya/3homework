package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double rub=1000;
        for (int i=1; i<11; i++) {
            rub=rub*1.2;
            double pr=rub-1000;
            System.out.println("Growth " + i + "=" + pr);
        }
        for (int i=1; i<11; i++) {
            rub=rub*1.2;
            System.out.println("Deposit amount" + i + "=" + rub);
        }
        in.close();// write your code here
    }
}
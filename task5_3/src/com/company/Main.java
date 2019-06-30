package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Number: ");
        int number = in.nextInt();
        int b, a;
        switch (number) {
            case 1:
                for (int i = 20; i < 36; i++) {
                    System.out.println(i);
                }
            case 2:
                System.out.print("Input b >= 10: ");
                b = in.nextInt();
                for (int i = 10; i < b+1; i++) {
                    System.out.println(i + i*i);
                }
            case 3:
                System.out.print("Input a <= 50: ");
                a = in.nextInt();
                for (int i = a; i < 51; i++) {
                    System.out.println(i + i * i * i);
                }
            case 4:
                System.out.print("Input a : ");
                a = in.nextInt();
                System.out.print("Input b>=a : ");
                b = in.nextInt();
                for (int i = a; i < b+1; i++) {
                    System.out.println(i + i * i * i);
                    in.close();// write your code here
                }
        }
    }
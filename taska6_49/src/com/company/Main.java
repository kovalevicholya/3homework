package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Number: ");
        int number = in.nextInt();
        int a, i;
        i = 0;
        while (number != 0) {
            a = number % 10;
            number = number / 10;
                if (a % 3 == 0) {
                System.out.println("Number contains the number 3");
                i++;
                break;
            }
        }
        if (i == 0) {
            System.out.println("Number does not contains the number 3");

        }
        in.close();
    }
}
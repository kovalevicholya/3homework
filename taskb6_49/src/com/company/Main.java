package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Number: ");
        int number = in.nextInt();
        int a, i, j;
        i = 0;
        j = 0;
        while (number != 0) {
            a = number % 10;
            number = number / 10;
            if (a % 2 == 0) {
                System.out.println("Number contains the number 2");
                i++;
            } else {
                if (a % 5 == 0) {
                    System.out.println("Number contains the number 5");
                    j++;
                }
            }
        }
            if (j == 0 && i == 0) {
                System.out.println("Number does not contain the number 5 and 2");
            } else {
                if (i == 0 && i != 0) {
                    System.out.println("Number does not contain the number 5 and contains 2");
                } else {
                    System.out.println("Number contain the number 5 and 2");
                }
            }


        in.close();
    }
    }

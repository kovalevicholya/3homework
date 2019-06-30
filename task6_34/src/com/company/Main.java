package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        number = 100;
        int i;
        for (i = 1; i < 16; ) {
            number = number + 1;
            if (number % 19 == 0) {
                System.out.println(number);
                i++;
            }
        }
        in.close();
    }
}

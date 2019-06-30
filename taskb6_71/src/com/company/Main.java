package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height, height0, count = 0, n = 10;
        System.out.print("Input height: ");
        height = in.nextInt();

        for (int i = 0; i < n - 1; i++) {
            height0 = height;
            System.out.print("Input height: ");
            height = in.nextInt();
            if (height < height0)
                count++;
            if (count == (n - 1))
                System.out.println("Descending list");
            else
                System.out.println("Non-descending list");
            in.close();
        }
    }
}


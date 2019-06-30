package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input n: ");
        int n= in.nextInt();
        int men,mensum=0,square,squaresum=0;
        double density;
        for (int i = 0; i < 12; i++){
            System.out.print("Input men: ");
            men=in.nextInt();
            mensum=mensum+men;
            System.out.print("Input square: ");
            square=in.nextInt();
            squaresum=squaresum+square;

        }
        density=squaresum/mensum;
        System.out.println(density);
        in.close();
    }
}


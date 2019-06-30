package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number, min, max, difference, res;
        System.out.print("Input number: ");
        number=in.nextInt();
        min=number%10;
        max=number%10;
        for (int i = 0; number > 0; i++){
            res=number%10;
            number=number/10;
            if(res<min)
                min=res;
            if(res>max)
                max=res;
        }
        difference=max-min;
        if(difference%2==0)
            System.out.println("difference is even");
        else
            System.out.println("difference is odd");
        in.close();
    }
}


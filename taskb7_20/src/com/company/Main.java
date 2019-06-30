package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int an, a1, resa=0, resb, resc, n;
        a1=0;
        System.out.print("Input n: ");
        n=in.nextInt();
        int koef=1;
        for (int i = 0; i < n; i++){
            System.out.print("Input an: ");
            an=in.nextInt();
            resa=resa+koef*an;
            koef=-1*koef;
            if(i==0)
                a1=an;
            if(i==1)
                resb=a1+an;
            if(i==n-1)
                resc=a1+an;
        }
        in.close();
    }
}

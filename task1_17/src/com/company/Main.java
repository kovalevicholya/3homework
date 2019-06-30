package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Number: ");
        int number = in.nextInt();
        int x, x1, x2, x3, v, t, a, m, g, h, R1, R2, alpha, R, b, c, gama, m1, m2, r, I, d;
        double y;
        switch (number) {
            case 1:
                System.out.print("Input x1: ");
                x1 = in.nextInt();
                System.out.print("Input x2: ");
                x2 = in.nextInt();
                y = Math.sqrt(Math.pow(x1, 2) + Math.pow(x2, 2));
                System.out.println(y);
                break;
            case 2:
                System.out.print("Input x1: ");
                x1 = in.nextInt();
                System.out.print("Input x2: ");
                x2 = in.nextInt();
                System.out.print("Input x3: ");
                x3 = in.nextInt();
                y = x1 * x2 + x1 * x3 + x2 * x3;
                System.out.println(y);
                break;
            case 3:
                System.out.print("Input v: ");
                v = in.nextInt();
                System.out.print("Input t: ");
                t = in.nextInt();
                System.out.print("Input a: ");
                a = in.nextInt();
                y = v * t + (a * Math.pow(t, 2)) / 2;
                System.out.println(y);
                break;
            case 4:
                System.out.print("Input v: ");
                v = in.nextInt();
                System.out.print("Input m: ");
                m = in.nextInt();
                System.out.print("Input g: ");
                g = in.nextInt();
                System.out.print("Input h: ");
                h = in.nextInt();
                y = (m * Math.pow(v, 2)) / 2 + m * g * h;
                System.out.println(y);
                break;
            case 5:
                System.out.print("Input R1: ");
                R1 = in.nextInt();
                System.out.print("Input R2: ");
                R2 = in.nextInt();
                y = 1 / R1 + 1 / R2;
                System.out.println(y);
                break;
            case 6:
                System.out.print("Input m: ");
                m = in.nextInt();
                System.out.print("Input g: ");
                g = in.nextInt();
                System.out.print("Input alpha: ");
                alpha = in.nextInt();
                y = m * g * Math.cos(alpha);
                System.out.println(y);
                break;
            case 7:
                System.out.print("Input R: ");
                R = in.nextInt();
                y = 2*Math.PI*R;
                System.out.println(y);
                break;
            case 8:
                System.out.print("Input b: ");
                b = in.nextInt();
                System.out.print("Input a: ");
                a = in.nextInt();
                System.out.print("Input c: ");
                c = in.nextInt();
                y = Math.pow(b,2) - 4*a*c;
                System.out.println(y);
                break;
            case 9:
                System.out.print("Input gama: ");
                gama = in.nextInt();
                System.out.print("Input m1: ");
                m1 = in.nextInt();
                System.out.print("Input m2: ");
                m2 = in.nextInt();
                System.out.print("Input r: ");
                r = in.nextInt();
                y = (gama*m1*m2)/Math.pow(r,2);
                System.out.println(y);
                break;
            case 10:
                System.out.print("Input I: ");
                I = in.nextInt();
                System.out.print("Input R: ");
                R = in.nextInt();
                y = Math.pow(I,2)*R;
                System.out.println(y);
                break;
            case 11:
                System.out.print("Input b: ");
                b = in.nextInt();
                System.out.print("Input a: ");
                a = in.nextInt();
                System.out.print("Input c: ");
                c = in.nextInt();
                y = a*b*Math.sin(c);
                System.out.println(y);
                break;
            case 12:
                System.out.print("Input b: ");
                b = in.nextInt();
                System.out.print("Input a: ");
                a = in.nextInt();
                System.out.print("Input c: ");
                c = in.nextInt();
                y = Math.sqrt(Math.pow(a,2)+ Math.pow(b,2) - 2*a*b*Math.cos(c));
                System.out.println(y);
                break;
            case 13:
                System.out.print("Input b: ");
                b = in.nextInt();
                System.out.print("Input a: ");
                a = in.nextInt();
                System.out.print("Input c: ");
                c = in.nextInt();
                System.out.print("Input d: ");
                d = in.nextInt();
                y = (a*d+b*c)/(a*d);
                System.out.println(y);
                break;
            case 14:
                System.out.print("Input x: ");
                x = in.nextInt();
                y = Math.sqrt(1 - Math.pow(Math.sin(x),2));
                System.out.println(y);
                break;
            case 15:
                System.out.print("Input b: ");
                b = in.nextInt();
                System.out.print("Input a: ");
                a = in.nextInt();
                System.out.print("Input c: ");
                c = in.nextInt();
                System.out.print("Input x: ");
                x = in.nextInt();
                y = 1/(Math.sqrt(a*Math.pow(x,2)+ b*x +c));
                System.out.println(y);
                break;
            case 16:
                System.out.print("Input x: ");
                x = in.nextInt();
                y = (Math.sqrt(x+1)+ Math.sqrt(x-1))/(2*Math.sqrt(x));
                System.out.println(y);
                break;
            case 17:
                System.out.print("Input x: ");
                x = in.nextInt();
                y = Math.abs(x)+ Math.abs(x+1);
                System.out.println(y);
                break;
            case 18:
                System.out.print("Input x: ");
                x = in.nextInt();
                y = Math.abs(1 - Math.abs(x));
                System.out.println(y);
                break;
            default:
                System.out.println("Mistake");
        }


        in.close();// write your code here
    }
}

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float pri ;
        float t ;
        float rate;
        System.out.print("Enter the principal amount ");
        pri = in.nextFloat();
        System.out.print("Enter the time ");
        t = in.nextFloat();
        System.out.print("Enter the rate of interest ");
        rate = in.nextFloat();
        float si = (pri * t * rate) / 100;
        System.out.println("Simple interest is " + si);
    }
}


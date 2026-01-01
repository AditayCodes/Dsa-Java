
// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number ");
        int n1 = in.nextInt();
        System.out.print("Enter second number ");
        int n2 = in.nextInt();
        if (n1 > n2) {
            System.out.print(n1 + " is greater than " + n2);
        }
        else {
            System.out.print(n2 + " is greater than " + n1);
        }
    }
}
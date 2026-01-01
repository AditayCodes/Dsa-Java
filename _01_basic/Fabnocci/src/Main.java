
// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter up to hum much numbers ");
        int input = in.nextInt();
        if (input <= 0) {
            System.out.print("Invalid input !!");
        }
        int n1 = 0;
        int n2 = 1;
        if (input >= 1) {
            System.out.print( "The Fibonacci series " + n1 );
        }
        if (input >= 2) {
            System.out.print(  " "+ n2);
        }

        for (int i = 3; i <=input ; i++) {
            int n3= n1 + n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
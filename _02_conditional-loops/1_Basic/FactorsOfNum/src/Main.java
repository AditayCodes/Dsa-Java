
// Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = in.nextInt();
        if (num <= 0) {
            System.out.print("Invalid number !!");
        }
        else {
            System.out.println("Factors of " + num + " are " );
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
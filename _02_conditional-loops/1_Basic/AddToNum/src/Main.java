
// Addition Of Two Numbers

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the pairs ");
        int number= in.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.print("Enter first number ");
            int n1= in.nextInt();
            System.out.print("Enter second number ");
            int n2= in.nextInt();
            int n3 = n1+n2;
            System.out.println("Sum of two numbers is "+n3);
        }
    }
}
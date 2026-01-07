import java.util.Scanner;

// Define a program to find out whether a given number is even or odd.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number ") ;
        int n1=in.nextInt();
        evenOdd(n1);
    }
    static void evenOdd(int a) {
        if (a == 0) {
            System.out.println("0 is neither Even nor Odd ");
        }
        else if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
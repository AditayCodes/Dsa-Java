// Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int num;
        System.out.print("Enter the number until 0 to stop !! ");
        num = in.nextInt();
        while (num!=0){
            if (num > largest) {
                largest=num;
            }
            System.out.print("Enter the number until 0 to stop !! ");
            num = in.nextInt();
        }
        System.out.println("Largest of all numbers is "+largest);
    }
}
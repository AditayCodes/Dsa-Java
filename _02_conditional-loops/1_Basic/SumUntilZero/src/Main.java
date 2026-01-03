// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        int num;
        System.out.print("Enter the number until 0 to stop !! ");
        num = in.nextInt();
        while (num!=0){
            sum=sum+num;
            System.out.print("Enter the number until 0 to stop !! ");
            num = in.nextInt();
        }
        System.out.println("sum of all numbers are "+sum);
    }
}
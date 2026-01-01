
// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number ");
        int num = in.nextInt();
        int original = num;
        int rev = 0;

        while (num !=0){
            int digit= num % 10;
            rev= rev * 10 + digit;
            num=num/10;
        }
        if (original == rev) {
            System.out.println(original + " is pallindrome !");
        }
        else {
            System.out.println(original + " is not a pallindrome !");
        }
    }
}
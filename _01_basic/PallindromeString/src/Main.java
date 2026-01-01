
// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String ");
        String num = in.next();
        String rev = "";
        for (int i = num.length()-1 ; i >= 0; i--) {
            rev= rev + num.charAt(i);
        }
        if (num.equals(rev)) {
            System.out.println(num + " is a pallindrome ");
        }
        else {
            System.out.println(num + " is not a pallindrome ");
        }
    }
}

//optimized

/*
        boolean isPalindrome = true;
        int left = 0;
        int right = num.length() - 1;

        while (left < right) {
            if (num.charAt(left) != num.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}

 */


/*
import java.util.Scanner;
//Reverse A String In Java
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = in.nextInt();
        int temp = num;
        int rev = 0;
        while (num != 0) {
            int last = num % 10;
            rev = rev * 10 + last;
            num = num / 10;
        }
        System.out.println("Reverse of string is " + rev);
    }
}
*/
import java.util.Scanner;
//Reverse A String In Java
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number ");
        String str = in.next();
        /*

        //Method - 1
        String rev = new StringBuilder(str).reverse().toString();

        //Method - 2
        String rev = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            rev=rev + str.charAt(i);
        }
        */

         //Method - 3
        char[] rev = str.toCharArray();
        for (int i = rev.length-1; i >=0 ; i--) {
            System.out.print(rev[i]);
        }
    }
}
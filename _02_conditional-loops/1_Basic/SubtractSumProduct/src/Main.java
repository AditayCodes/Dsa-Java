
// Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num=in.nextInt();
        int sum=0;
        int product=1;

        while(num > 0){
            int dig= num % 10;
            sum = sum + dig;
            product=product * dig;
            num/=10;
        }
        int res=product-sum;
        System.out.println(res);
    }
}

// To find Armstrong Number between two given number.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = in.nextInt();
        int digit=0;
        int temp =num;

        //count digits
        while (temp > 0){
            digit++;
            temp = temp/10;
        }
        temp=num;
        int sum=0;

        //armstrong sum
        while(temp >0){
            int val = temp % 10;
            int power = 1;
            for (int i = 1; i <= digit; i++) {
                power = power * val;
            }
            sum= sum + power;
            temp= temp/10;
        }
        if (sum == num) {
            System.out.println("Armstrong");
        }else {
            System.out.println("Not Armstrong");
        }

    }
}
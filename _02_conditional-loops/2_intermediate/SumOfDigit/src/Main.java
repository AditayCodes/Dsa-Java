import java.util.Scanner;
// Sum Of A Digits Of Number
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = in.nextInt();
        int sum=0;
        while (num!=0) {
            int last= num%10;
            sum=sum+last;
            num=num/10;
        }
        System.out.println("Total sum is "+sum);
    }
}
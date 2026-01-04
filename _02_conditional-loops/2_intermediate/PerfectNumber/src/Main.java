import java.util.Scanner;
// Perfect Number In Java
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = in.nextInt();
        int sum=0;
        for (int i = 1; i <=num/2 ; i++) {
            if (num % i == 0) {
                sum=sum+i;
            }
        }
        if (sum == num && num!=0) {
            System.out.println(num+" Perfect number");
        }
        else {
            System.out.println(num+" Not a perfect number");
        }
    }
}